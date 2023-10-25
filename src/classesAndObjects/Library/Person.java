package classesAndObjects.Library;

public class Person {
    String name;
    int age;
    Book[] borrowedBook = new Book[10];
    int lengthBooks = 0;
    Book[] historyOfBooks = new Book[6];
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
                    System.out.println(borrowedBook[i].title);
                }
            }
        } else {
            System.out.println("Ни одна книга не было взято напрокат.");
        }
    }

}
