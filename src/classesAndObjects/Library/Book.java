package classesAndObjects.Library;

public class Book {
    private String author;
    private String title;
    private int id;

    Book(String author, String title, int id) {
        this.author = author;
        this.title = title;
        this.id = id;
    }

    void display() {
        System.out.println("ID: " + id + " | Book: " + title + "' by Author: '" + author);
    }

    public void addTitleBook() {
        System.out.println("Добавлена книга: " + title);
    }

    public String getTitleBook() {
        return title;
    }
}
