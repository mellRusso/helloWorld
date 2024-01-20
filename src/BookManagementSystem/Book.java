package BookManagementSystem;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private int publishYear;

    Book(String title, String author, int isbn, int publishYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishYear = publishYear;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !getClass().equals(obj.getClass())) return false;
        Book book = (Book) obj;
        if (!title.equals(book.title)) return false;
        if (!author.equals(book.author)) return false;
        if (publishYear != publishYear) return false;
        return isbn == isbn;
    }

    @Override
    public int hashCode() {
        int result = title == null ? 0 : title.hashCode();
        result = 31 * result + (author == null ? 0 : author.hashCode());
        result = 31 * result + isbn;
        result = 31 * result + publishYear;
        return result;
    }
}


