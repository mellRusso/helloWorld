package BookStatuses;

public class FromOverduedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.OVERDUED) {
            switch (requestedStatus) {
                case ARCHIVED:
                    book.setStatus(requestedStatus);
                    System.out.println("Меняем статус с " + Status.OVERDUED + " на " + requestedStatus);
                    break;
                case AVAILABLE:
                    book.setStatus(requestedStatus);
                    System.out.println("Меняем статус с " + Status.OVERDUED + " на " + requestedStatus);
                    break;
                default:
                    System.out.println("Перевод из статус " + Status.AVAILABLE + " в " + requestedStatus + " невозможен");
            }
        } else {
            System.out.println("Не верный статус");
        }
    }
}
