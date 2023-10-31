package classesAndObjects.Library;

public class Person {
    int id;
    String name;
    int age;
    Book[] borrowedBook = new Book[10];
    int indexBorrowedBook = 0;
    int lengthBooks = 0;

    Book[] historyOfBooks = new Book[100];
    int indexHistoryofBooks = 0;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person() {

    }


    public boolean canBorrowMoreBooks() {
        return lengthBooks < 2;
    }

    public void display() {
        if (borrowedBook != null) {
            for (int i = 0; i < borrowedBook.length; i++) {
                if (borrowedBook[i] != null) {
                  //System.out.println(borrowedBook[i].title);
                }
            }
        } else {
            System.out.println("Не одна книга не была взята напрокат.");
        }
    }

    public int findBorrowedBook(Person person, String nameBook) { //список отданных книг
        for(int i = 0; i < person.borrowedBook.length; i++) {
            if(person.borrowedBook[i] != null) {
                if(nameBook.equals(person.borrowedBook[i].listTitleBook(person.borrowedBook[i]))) {
                    return i;
                }
            }
        }
        return -1;
    }

}
