package classesAndObjects;
public class Library {
    Book availableBook; // информация о доступной книге!
    Book availableBook1; // информация о доступной книге!


    public void display() { //проверяем какие книги есть в библиотеке! тут можно было бы использовать массив, но т.к мы его не проходили решил не добавлять!
            if(availableBook != null && availableBook1 != null) {
                System.out.println("Доступные книги: " + "| " + availableBook.title + " | " + availableBook1.title + " |");
            } else if (availableBook != null && availableBook1 == null) {
                System.out.println("Доступные книги: " + "| " + availableBook.title);
            }else if (availableBook == null && availableBook1 != null) {
                System.out.println("Доступные книги: " + "| " + availableBook1.title);
            }else if (availableBook == null && availableBook1 == null) {
                System.out.println("Книг нету");
            }
    }
    public void lendBook(Student student) {
        if(availableBook != null && student.borrowedBook == null) {
            student.borrowedBook = availableBook;
            availableBook = null;
        } else if (availableBook1 != null && student.borrowedBook == null) {
            student.borrowedBook = availableBook1;
            availableBook1 = null;
        } else {
            System.out.println("Книга уже взята на прокат");
        }
    }

    public void acceptBook(Student student, int rating) {
        if(availableBook == null && student.borrowedBook != null) {
            student.lastBorrowedBook = student.borrowedBook.title;
            availableBook = student.borrowedBook;
            student.borrowedBook = null;
            availableBook.rating = rating;
        } else if (availableBook1 == null && student.borrowedBook != null) {
            student.lastBorrowedBook = student.borrowedBook.title;
            availableBook1 = student.borrowedBook;
            student.borrowedBook = null;
            availableBook.rating = rating;
        } else {
            System.out.println("В библиотеке уже есть книга");
        }
    }



    public void lendBook(Teacher teacher) {
        if(availableBook != null && teacher.borrowedBook == null) {
            teacher.borrowedBook = availableBook;
            availableBook = null;
        } else if (availableBook1 != null && teacher.borrowedBook == null) {
            teacher.borrowedBook = availableBook1;
            availableBook1 = null;
        } else {
            System.out.println("Книга уже взята на прокат");
        }
    }

    public void acceptBook(Teacher teacher, int rating) {
        if(availableBook == null && teacher.borrowedBook != null) {
            teacher.lastBorrowedBook = teacher.borrowedBook.title;
            availableBook = teacher.borrowedBook;
            teacher.borrowedBook = null;
            availableBook.rating = rating;
        } else if (availableBook1 == null && teacher.borrowedBook != null) {
            teacher.lastBorrowedBook = teacher.borrowedBook.title;
            availableBook1 = teacher.borrowedBook;
            teacher.borrowedBook = null;
            availableBook.rating = rating;
        } else {
            System.out.println("В библиотеке уже есть книга");
        }
    }

    public void lendBook(Person person) {
        if(availableBook != null && person.borrowedBook == null) {
            person.borrowedBook = availableBook;
            availableBook = null;
        } else if (availableBook1 != null && person.borrowedBook == null) {
            person.borrowedBook = availableBook1;
            availableBook1 = null;
        } else {
            System.out.println("Книга уже взята!");
        }
    }

    public void acceptBook(Person person, int rating) {
        if(availableBook == null && person.borrowedBook != null) {
            person.lastBorrowedBook = person.borrowedBook.title;
            availableBook = person.borrowedBook;
            person.borrowedBook = null;
            availableBook.rating = rating;
        } else if (availableBook1 == null && person.borrowedBook != null) {
            person.lastBorrowedBook = person.borrowedBook.title;
            availableBook1 = person.borrowedBook;
            person.borrowedBook = null;
            availableBook.rating = rating;
        } else  {
            System.out.println("В библиотеке уже есть книга");
        }
    }
}
