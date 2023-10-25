package classesAndObjects.Library;

public class Student extends Person {

    Book[] borrowedBook = new Book[1];

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override //переопределяеп метод у студента
    public boolean canBorrowMoreBooks() {
        return lengthBooks < 1;
    }
}
