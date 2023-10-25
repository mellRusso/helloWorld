package classesAndObjects.Library;

public class Book {
    String author;
    String title;
    int id;

    Book(String author, String title, int id) {
        this.author = author;
        this.title = title;
        this.id = id;
    }

    void display() {
        System.out.println("ID: " + id + " | Book: " + title + "' by Author: '" + author);
    }


}
