package AbstractionsInterfaces.Library;

public class Library {
    private static String[] books = new String[10];
    private static int indexBooks;

    public static void addBook(String title) {
        books[indexBooks++] = title;
    }

    public static void display() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }

    public static String[] getBooks() {
        return books;
    }
}
