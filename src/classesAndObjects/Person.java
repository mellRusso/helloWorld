package classesAndObjects;
public class Person {
    String name;
    int age;
    Book borrowedBook;
    String lastBorrowedBook;
    public void display() {
        if(borrowedBook != null) {
            System.out.println("Name: "+ name + " Age: " + age + " | " + "Предыдущая книга: " + lastBorrowedBook);
            borrowedBook.display();
        }
        else {
            System.out.println("Ни одна книга не была взята напрокат.");
            System.out.println("Предыдущая книга: " + lastBorrowedBook);
        }
    }

}
