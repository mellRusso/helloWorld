package AbstractionsInterfaces.Library;

public class Admin extends User implements Administrator {
    Admin(String name) {
        super(name);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор уведомляет читателя о просрочке");
    }

    @Override
    public void finBook(String nameBook) {
        for (String book : Library.getBooks()) {
            if (book != null) {
                if (nameBook.equals(book)) {
                    System.out.println("Книга " + nameBook + " найдена");
                }
            }
        }
    }

    @Override
    public void giveBook() {
        System.out.println("Администратор отдает книгу");
    }
}
