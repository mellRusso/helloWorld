package AbstractionsInterfaces.Library;

public interface Reader {
    void takeBook(Administrator administrator, String title);

    void returnBook(String title);
}
