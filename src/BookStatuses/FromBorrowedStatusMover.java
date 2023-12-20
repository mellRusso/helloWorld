package BookStatuses;

public class FromBorrowedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.BORROWED) {
            switch (requestedStatus) {
                case AVAILABLE:
                    book.setStatus(requestedStatus);
                    System.out.println("Меняем статус с " + Status.BORROWED + " на " + requestedStatus);
                    break;
                case ARCHIVED:
                    book.setStatus(requestedStatus);
                    System.out.println("Меняем статус с " + Status.BORROWED + " на " + requestedStatus);
                    break;
                case OVERDUED:
                    book.setStatus(requestedStatus);
                    System.out.println("Меняем статус с " + Status.BORROWED + " на " + requestedStatus);
                    break;
                default:
                    System.out.println("Перевод из статус " + Status.BORROWED + " в " + requestedStatus + " невозможен");
            }
        } else {
            System.out.println("Не верный статус");
        }
    }
}
