package classesAndObjects.Library;

public class Teacher extends Person {
    Teacher(String name, int age, int id) {
        super(name, age, id);
    }

    @Override //переопределяем метод у учителя
    public boolean canBorrowMoreBooks(Person person) {
        return person.getLengthBook() < 1;
    }
}
