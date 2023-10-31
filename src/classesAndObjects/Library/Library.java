package classesAndObjects.Library;

public class Library {
    private Book[] availableBook = new Book[10];
    private int indexAvailableBook = 0;
    private Person[] libraryReader = new Person[30];
    private int indexLibraryReader = 0;
    private Supplier supplier = new Supplier();
    private int copyIndexAvailable;

    public void addBook(Book book) {
        availableBook[indexAvailableBook] = book;
        book.addTitleBook();
        indexAvailableBook++;
    }

    public void addReader(Person person) { //добавляем нового читателя
        libraryReader[indexLibraryReader++] = person;
    } //добавления читателей

    public void displayLybrary() { //список книг
        for (int i = 0; i < availableBook.length; i++) {
            if (availableBook[i] != null) {
                System.out.print(i+1 + ". ");
                availableBook[i].listTitleBook();
            }
        }
    }

    public boolean reader(int id) { //список читателей. для проверки по айди
        for(int i = 0; i < libraryReader.length; i++) {
            if(libraryReader[i] != null) {
                if(id == libraryReader[i].id) {
                    return true;
                }
            }
        }
        return false;
    }

    public void lendBook(Person person, String nameBook) { //добавление книги
        int indexBook = findAvailableBook(nameBook);
        copyIndexAvailable = indexBook;
        if(reader(person.id)) {
            if (availableBook != null && indexBook != -1) {
                if (person.canBorrowMoreBooks()) {
                    person.borrowedBook[person.indexBorrowedBook++] = availableBook[indexBook];
                    availableBook[indexBook] = null;
                    person.lengthBooks++;
                    System.out.println("ВЗял");
                }else {
                    System.out.println("Больше нельзя взять книг!");
                }
            }else {
                System.out.println("Такой книги нету");
            }
        }else {
            System.out.println("Вы не являетесь читателем библиотеки!");
        }
    }

    public void acceptBook(Person person, String nameBook) { //возврат книги
        int indexBook = person.findBorrowedBook(person, nameBook);
        if(person.borrowedBook != null && indexBook != -1) {
            availableBook[copyIndexAvailable] = person.borrowedBook[indexBook];
            person.historyOfBooks[person.indexHistoryofBooks++] = person.borrowedBook[indexBook];
            person.borrowedBook = null;
            person.lengthBooks--;
            copyIndexAvailable = 0;
            System.out.println("ПОложил");
        }else {
            System.out.println("Такой книги нету!");
        }
    }

    public int findAvailableBook(String nameBook) { //поиск нужной книги
        for(int i = 0; i < availableBook.length; i++) {
            if(availableBook[i] != null) {
                if(nameBook.equals(availableBook[i].listTitleBook(availableBook[i]))) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void orderOfBook(String author, String book, int id) { //заказ книг
        if(findAvailableBook(book) == -1) {
            Book newBook = supplier.orderOfBooks(author, book, id);
            availableBook[indexAvailableBook++] = newBook;
            System.out.println("Книга заказана! и теперь доступна!");
        }else {
            System.out.println("Данная книга есть в библиотеке!");
        }
    }
}
