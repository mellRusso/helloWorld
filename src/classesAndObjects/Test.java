package classesAndObjects;
public class Test {
    public static void main(String[] args) {
        Book book = new Book();
        book.author = "Leo Tolstoy";
        book.title = "War and Peace";
        book.id = 1;
        book.category = "roman";

        Book book1 = new Book();
        book1.author = "Clavell James";
        book1.title = "Shogun";
        book1.id = 222;
        book1.category = "Roman";

        Library library = new Library();
        library.availableBook = book;
        library.availableBook1 = book1;


        Student student = new Student();
        student.name = "John";
        student.studentId = 12345;

        Subject subject = new Subject();
        subject.title = "literature";

        Teacher teacher = new Teacher();
        teacher.name = "Elena";
        teacher.subject = subject;


        Person person = new Person(); //создаем человека лол
        person.name = "Roma";
        person.age = 17;


        library.display();
        library.lendBook(person);

        library.display();
        library.lendBook(student);

        library.display();
        library.acceptBook(person, 3);

        library.display();
        library.lendBook(teacher);

        person.display();
        student.display();
        teacher.display();


    }
}
