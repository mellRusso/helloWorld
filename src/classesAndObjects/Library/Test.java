package classesAndObjects.Library;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book("Достоевский", "Подросток", 1);
        Book book2 = new Book("Достоевский", "Братья Карамазовы", 2);
        Book book3 = new Book("Достоевский", "Бессы", 3);
        Book book4 = new Book("Достоевский", "Преступление и наказание", 4);

        Student student = new Student("Petr", 13, 123);
        Teacher teacher = new Teacher("Roma", 34, 223);

        Director director = new Director("Niko", 56, 1);

        Supplier supplier = new Supplier();

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.addReader(student);

        library.setWorkingHours(director, 9, 21); //время работы библиотеки
        library.lendBook(student, "Подросток");
        library.acceptBook(student, "Подросток");
        library.orderOfBook("Джорджа Оруэлл", "1984", 5); //заказываем книгу

        library.setReviews("Подросток", "хорошая книга"); //добавляем отзывы
        library.setReviews("Подросток", "плохая");
        library.setReviews("Подросток", "моя любимая книга!");
        library.setReviews("Бессы", "лучшая книга Достоевского!");

        library.getReviews(); //вывод отзывов
    }
}
