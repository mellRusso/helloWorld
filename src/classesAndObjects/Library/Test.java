package classesAndObjects.Library;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Book book1 = new Book("Достоевский", "Подросток", 1);
        Book book2 = new Book("Достоевский", "Братья Карамазовы", 2);
        Book book3 = new Book("Достоевский", "Бессы", 3);
        Book book4 = new Book("Достоевский", "Преступление и наказание", 4);

        Teacher teacher = new Teacher("Nina", 46);

        Student student = new Student("Petya", 21);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.lendBook(teacher, "Преступление и наказание");
        library.lendBook(teacher, "Бессы");
        String teacheLengthBook = library.lendBook(teacher, "Подросток");//не может взять третью книгу, т.к стоит ограничение

        library.lendBook(student, "Подросток");
        String studentLengthBook = library.lendBook(student, "Братья Карамазовы");
        //тоже самое касается и студента! студент может взять максимум одну книгу

    }
}
