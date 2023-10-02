package classesAndObjects;
public class Student {
    String name;
    int studentId;
    Book borrowedBook;
    String lastBorrowedBook;
    public void display() {
        System.out.println("Студент: " + name + " | Студент Айди: " + studentId + " | " + "Предыдущая книга: " + lastBorrowedBook);
        if(borrowedBook != null) {
            System.out.print("Взятая книга: ");
            borrowedBook.display();

        } else {
            System.out.println("Ни одна книга не была взята напрокат.");
            System.out.println("Предыдущая книга: " + lastBorrowedBook);
        }
    }
}
