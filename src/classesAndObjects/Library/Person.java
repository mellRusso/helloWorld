package classesAndObjects.Library;

public class Person {
    private int id;
    private String name;
    private int age;
    private Book[] borrowedBook = new Book[10];
    private int indexBorrowedBook;
    int lengthBooks;

    private Book[] historyOfBooks = new Book[100];
    private int indexHistoryofBooks;

    Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    Person() {

    }

    public boolean canBorrowMoreBooks() {
        return lengthBooks < 2;
    }

    public int getId() {
        return id;
    }

    public Book setBorrowedBook(Book available) {
        lengthBooks++;
        return borrowedBook[indexBorrowedBook++] = available;
    }

    public Book[] getBorrowedBook() {
        return borrowedBook;
    }

    public Book setBorrowedBook(int indexBook) {
        return borrowedBook[indexBook];
    }

    public void setBorrowedBook(int indexBook, Book book) {
        lengthBooks--;
        borrowedBook[indexBook] = book;
    }

    public void display() {
        if (borrowedBook != null) {
            for (int i = 0; i < borrowedBook.length; i++) {
                if (borrowedBook[i] != null) {
                    System.out.println(borrowedBook[i].getTitle(borrowedBook[i]));
                }
            }
        } else {
            System.out.println("Не одна книга не была взята напрокат.");
        }
    }

    public int findBorrowedBook(Person person, String nameBook) { //список отданных книг
        for (int i = 0; i < person.borrowedBook.length; i++) {
            if (person.borrowedBook[i] != null) {
                if (nameBook.equals(person.borrowedBook[i].getTitle(person.borrowedBook[i]))) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void setHistoryOfBooks(Book book) {
        historyOfBooks[indexHistoryofBooks++] = book;
    }

    public int getLengthBook() {
        return lengthBooks;
    }

    public void displayHistory() {
        for (int i = 0; i < historyOfBooks.length; i++) {
            if (historyOfBooks[i] != null) {
                System.out.println(historyOfBooks[i].getTitle(historyOfBooks[i]));
            }
        }
    }
}
