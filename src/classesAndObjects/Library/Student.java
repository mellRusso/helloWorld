package classesAndObjects.Library;

public class Student extends Person {

    Book[] borrowedBook = new Book[1];
    Person person = new Person();

    Student(String name, int age, int id) {
        super(name, age, id);
    }

    @Override //переопределяеп метод у студента
    public boolean canBorrowMoreBooks() {
        return person.getLengthBook() < 5;
    }
}
