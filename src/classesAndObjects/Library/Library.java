package classesAndObjects.Library;

import java.util.Date;

public class Library {
    private Book[] availableBook = new Book[40];
    private int indexAvailableBook;
    private Person[] libraryReader = new Person[30];
    private int indexLibraryReader;
    private Supplier supplier = new Supplier();
    private int copyIndexAvailable;
    private Date date = new Date();
    private static int workingHoursStart;
    private static int workingHoursFinish;
    private String[] reviews = new String[20];
    private int indexReviews;

    public void addBook(Book book) {
        availableBook[indexAvailableBook] = book;
        System.out.println("Добавлена книга: ");
        book.addTitleBook();
        indexAvailableBook++;
    }

    public void setWorkingHours(Person person, int workingHoursStart, int workingHoursFinish) { //время работы библиотеки
        if (person.getId() == 1) {
            this.workingHoursStart = workingHoursStart;
            this.workingHoursFinish = workingHoursFinish;
        } else {
            System.out.println("Вы не являетесь директором");
        }
    }


    public void addReader(Person person) { //добавляем нового читателя
        libraryReader[indexLibraryReader++] = person;
    } //добавления читателей

    public void displayLybrary() { //список книг
        int g = 1;
        for (int i = 0; i < availableBook.length; i++) {
            if (availableBook[i] != null) {
                System.out.print(g + ". ");
                System.out.println(availableBook[i].getTitleBook());
                g++;
            }
        }
    }

    public boolean reader(int id) { //список читателей. для проверки по айди
        for (int i = 0; i < libraryReader.length; i++) {
            if (libraryReader[i] != null) {
                if (id == libraryReader[i].getId()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void lendBook(Person person, String nameBook) { //добавление книги
        int indexBook = findAvailableBook(nameBook);
        copyIndexAvailable = indexBook;
        if (date.getHours() >= workingHoursStart && date.getHours() <= workingHoursFinish) {
            if (reader(person.getId())) {
                if (availableBook != null && indexBook != -1) {
                    if (person.canBorrowMoreBooks(person)) {
                        person.setBorrowedBook(availableBook[indexBook]);
                        person.addLengthBook();
                        availableBook[indexBook] = null;
                        System.out.println("ВЗял");
                    } else {
                        System.out.println("Больше нельзя взять книг!");
                    }
                } else {
                    System.out.println("Такой книги нету");
                }
            } else {
                System.out.println("Вы не являетесь читателем библиотеки!");
            }
        } else {
            System.out.println("Библиотека работает с " + workingHoursStart + " до " + workingHoursFinish);
        }
    }

    public void acceptBook(Person person, String nameBook) { //возврат книги
        int indexBook = person.findBorrowedBook(person, nameBook);
        if (person.getBorrowedBook() != null && indexBook != -1) {
            availableBook[copyIndexAvailable] = person.getBorrowedBookIndex(indexBook);
            person.setHistoryOfBooks(person.getBorrowedBookIndex(indexBook));
            person.setBorrowedBook(indexBook, null);
            person.subtrackLengthBook();
            copyIndexAvailable = 0;
            System.out.println("ПОложил");
        } else {
            System.out.println("Такой книги нету!");
        }
    }

    public int findAvailableBook(String nameBook) { //поиск нужной книги
        for (int i = 0; i < availableBook.length; i++) {
            if (availableBook[i] != null) {
                if (nameBook.equals(availableBook[i].getTitleBook())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void orderOfBook(String author, String book, int id) { //заказ книг
        if (findAvailableBook(book) == -1) {
            supplier.setNewBook(author, book, id);
            Book newBook = supplier.getNewBook();
            availableBook[indexAvailableBook++] = newBook;
            System.out.println("Книга заказана! и теперь доступна!");
        } else {
            System.out.println("Данная книга есть в библиотеке!");
        }
    }

    public void setReviews(String nameBook, String review) {
        if (findAvailableBook(nameBook) != -1) {
            reviews[indexReviews++] = nameBook + ": " + review;
        } else {
            System.out.println("Такой книги у нас нету! Но вы можете ее заказать");
        }
    }

    public void getReviews() {
        System.out.println("Отзывы на книги");
        for (int i = 0; i < reviews.length; i++) {
            if (reviews[i] != null) {
                System.out.println(reviews[i]);
            }
        }
    }
}
