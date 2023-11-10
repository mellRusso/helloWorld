package classesAndObjects.Library;

public class Supplier {
    private Book newBook;

    public void setNewBook(String author, String title, int id) {
        newBook = new Book(author, title, id);
    }

    public Book getNewBook() {
        return newBook;
    }


}
