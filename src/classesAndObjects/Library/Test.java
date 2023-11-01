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


        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        System.out.println("////////");
        library.addReader(student);
        library.addReader(teacher);

        library.lendBook(student, "Подросток");
        library.lendBook(student, "Бессы");
        library.lendBook(student, "Братья Карамазовы");

        /*
        while (true) {
            System.out.println("Добро пожаловать в библиотеку");
            System.out.println("Введите пожалуйста свой ID");
            int id = scanner.nextInt();
            if(library.reader(id)) {
                displayMenu();
                System.out.println("Выберите нужное действие");
                int command = scanner.nextInt();
                if(command == 1) {
                    library.displayLybrary();
                }
            }else {
                System.out.println("Вы не являетесь читателем бибилотеки!");
            }
        }

         */
    }
    public static void displayMenu() {
        System.out.println("1. Список доступных книг");
    }
}
