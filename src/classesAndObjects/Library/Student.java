package classesAndObjects.Library;

public class Student extends Person {

    Book[] borrowedBook = new Book[1];

    Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override //переопределяеп метод у студента
    public boolean canBorrowMoreBooks() {
        return lengthBooks < 5;
    }
}
