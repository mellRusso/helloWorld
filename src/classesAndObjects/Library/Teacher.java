package classesAndObjects.Library;

public class Teacher extends Person {

    Book[] borrowedBook = new Book[2];

    Teacher(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override //переопределяеп метод у ученика
    public boolean canBorrowMoreBooks() {
        return lengthBooks < 10;
    }

}
