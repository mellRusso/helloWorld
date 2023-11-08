package classesAndObjects.Library;

public class Supplier {
    private Book newBook;

    public Book setNewBook(String author, String title, int id) {
        newBook = new Book(author, title, id);
        return newBook;
    }
}
