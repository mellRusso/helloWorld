package AbstractionsInterfaces.Library;

public class SupplierWorker extends User implements Supplier {
    SupplierWorker(String name) {
        super(name);
    }

    @Override
    public void bringBook(String title) {
        System.out.println("Поставщик " + getName() + " принес в библиотеку книгу " + title);
        Library.addBook(title); //добавляем книгу в библиотеку
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
