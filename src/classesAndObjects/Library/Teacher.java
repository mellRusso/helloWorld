package classesAndObjects.Library;

public class Teacher extends Person {

    Book[] borrowedBook = new Book[2];

    Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override //переопределяеп метод у ученика
    public boolean canBorrowMoreBooks() {
        return lengthBooks < 2;
    }

}
