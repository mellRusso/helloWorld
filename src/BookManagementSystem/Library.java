package BookManagementSystem;

public class Library {

    private Book[] books = new Book[5];
    private int indexBook;

    public void addBook(Book book) {
        if (findIsbn(book.getIsbn()) == null) {
            books[indexBook++] = book;
            System.out.println("Книга добавлена");
        } else {
            System.out.println("Данная книга есть в библиотеке");
        }
    }

    public Book findIsbn(int isbn) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getIsbn() == isbn) {
                    return books[i];
                }
            }
        }
        return null;
    }

    public void deleteBooks(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].equals(book)) {
                    books[i] = null;
                    System.out.println("Книга была удалена");
                } else {
                    System.out.println("Книги нет. Посему удалить нельзя");
                }
            }
        }
    }

    public void display() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getTitle());
            }
        }
    }
}
