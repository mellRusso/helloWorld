package BookManagementSystem;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Толстой", 1, 1868);
        Book book2 = new Book("Преступление и наказание", "Достоевский", 2, 1866);
        Book book3 = new Book("Война и мир", "Толстой", 1, 1868);

        Library library = new Library();

        library.addBook(book1); //добавляем книгу
        library.addBook(book3); //пробуем добавить такую же книгу
        library.addBook(book2); //добавляем другую книгу

        System.out.println(library.findIsbn(2).getTitle()); //ищем книгу по isbn

        library.deleteBooks(book2);

        library.display();
    }
}
