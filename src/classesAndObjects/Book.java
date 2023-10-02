package classesAndObjects;
public class Book {
    String author;
    String title;
    int id; //айди книги
    String category;
    int rating; //рейтинг от 1 до 5

    void display() {
        System.out.println("ID: " + id + " | Book: " + title + "' by Author: '" + author + " Category: " + category + " Rating: " + rating + "'");
    }



}
