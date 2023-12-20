package BookStatuses;

public class FromAvailableStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.AVAILABLE) {
            switch (requestedStatus) { //только Borrowed и arhived
                case ARCHIVED:
                    book.setStatus(Status.ARCHIVED);
                    System.out.println("Меняем статус с " + Status.AVAILABLE + " на " + requestedStatus);
                    break;
                case BORROWED:
                    book.setStatus(Status.BORROWED);
                    System.out.println("Меняем статус с " + Status.AVAILABLE + " на " + requestedStatus);
                    break;
                default:
                    System.out.println("Перевод из статус " + Status.AVAILABLE + " в " + requestedStatus + " невозможен");
            }
        }
    }
}
