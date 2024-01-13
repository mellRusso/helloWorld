package AbstractionsInterfaces.Library;

public class ReaderBook extends User implements Reader {
    ReaderBook(String name) {
        super(name);
    }

    @Override
    public void takeBook(Administrator administrator, String title) {
        Admin admin = (Admin) administrator;
        System.out.println("Читатель " + getName() + " берет книгу " + title + " у администратора " + admin.getName());
    }

    @Override
    public void returnBook(String title) {
        System.out.println("Читатель " + getName() + " возвращает книгу " + title);
    }
}
