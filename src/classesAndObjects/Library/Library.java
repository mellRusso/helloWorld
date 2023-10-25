package classesAndObjects.Library;

public class Library {
    Book[] availableBook = new Book[10];
    ; // информация о доступных книгах!
    int indexAvailableBook = 0;
    int indexBorrowedBook = 0;
    int copyIndexAvailableBook = 0;
    //копируем индекс массива для того чтобы потом вернуть книгу в библиотеку в тот же индекс с которого взяли!
    int copyIndexBorrowedBook = 0;

    public void addBook(Book book) {
        availableBook[indexAvailableBook] = book;
        System.out.println("Книга добавлена: " + book.title);
        indexAvailableBook++;
    }

    public void displayLybrary() {
        for (int i = 0; i < availableBook.length; i++) {
            if (availableBook[i] != null) {
                System.out.println(availableBook[i].title);

            }
        }
    }

    public String lendBook(Person person, String nameBook) {
        if (availableBook != null) {
            if (person.canBorrowMoreBooks()) {
                for (int i = 0; i < availableBook.length; i++) {
                    if (availableBook[i] != null) {
                        if (nameBook.equals(availableBook[i].title)) {
                            person.borrowedBook[indexBorrowedBook] = availableBook[i];
                            copyIndexAvailableBook = i;
                            copyIndexBorrowedBook = indexBorrowedBook;
                            availableBook[i] = null;
                            indexBorrowedBook++;
                            person.lengthBooks++;
                            return "Книга была взята";
                        }
                    }
                }
                return "Данной книги нету";
            } else {
                return "Вы не можете взять больше книг";
            }
        } else {
            return "В библиотеке нету книг";
        }
    }

    public void acceptBook(Person person, String nameBook) {
        if (person.borrowedBook != null) {
            availableBook[copyIndexAvailableBook] = person.borrowedBook[copyIndexBorrowedBook];
            person.historyOfBooks[person.indexHistoryofBooks++] = availableBook[copyIndexAvailableBook];
            person.borrowedBook[copyIndexBorrowedBook] = null;
        }
    }
}
