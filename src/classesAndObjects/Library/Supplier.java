package classesAndObjects.Library;

public class Supplier {
    private Book newBooks;

    public Book orderOfBooks(String author, String title, int id) {
        newBooks = new Book(author, title, id);
        return newBooks;
    }
}
