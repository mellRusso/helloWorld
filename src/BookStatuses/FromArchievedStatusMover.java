package BookStatuses;

public class FromArchievedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.ARCHIVED) {
            switch (requestedStatus) {
                case AVAILABLE:
                    book.setStatus(requestedStatus);
                    System.out.println("Меняем статус с " + Status.ARCHIVED + " на " + requestedStatus);
                    break;
                default:
                    System.out.println("Перевод из статус " + Status.ARCHIVED + " в " + requestedStatus + " невозможен");
            }
        } else {
            System.out.println("Не верный статус");
        }
    }
}
