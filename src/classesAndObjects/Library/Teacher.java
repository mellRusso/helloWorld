package classesAndObjects.Library;
public class Teacher {
    String name;
    Subject subject;
    Book borrowedBook;
    String lastBorrowedBook;
    public void display() {
        System.out.println("Учитель: " + name + " | Учит: " + subject.title + " | " + "Предыдущая книга: " + lastBorrowedBook);
        if(borrowedBook != null) {
            System.out.print("Взятая книга: ");
            borrowedBook.display();
        } else {
            System.out.println("Ни одна книга не была взята напрокат.");
            System.out.println("Предыдущая книга: " + lastBorrowedBook);
        }
    }
}
