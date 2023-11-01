package classesAndObjects.Library;

public class Teacher extends Person {

    private Book[] borrowedBook = new Book[2];


    Teacher(String name, int age, int id) {
        super(name, age, id);
    }

    @Override //переопределяеп метод у ученика
    public boolean canBorrowMoreBooks() {
        return lengthBooks < 1;
    }
}
