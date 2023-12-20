package BookStatuses;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");

        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);

        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        fromBorrowedStatusMover.moveToStatus(book, Status.OVERDUED);
    }
}
