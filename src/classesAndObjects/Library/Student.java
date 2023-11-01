package classesAndObjects.Library;

public class Student extends Person {
    Student(String name, int age, int id) {
        super(name, age, id);
    }

    @Override //переопределяеп метод у студента
    public boolean canBorrowMoreBooks(Person person) {
        return person.getLengthBook() < 2;
    }
}
