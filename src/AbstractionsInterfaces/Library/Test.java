package AbstractionsInterfaces.Library;

public class Test {
    public static void main(String[] args) {
        Reader reader = new ReaderBook("Petr");
        Administrator administrator = new Admin("Georg");
        reader.takeBook(administrator, "Игра престолов");

        Supplier supplier = new SupplierWorker("Misha");
        supplier.bringBook("Война и мир");
        supplier.takeBook(administrator, "Война и мир");
    }
}
