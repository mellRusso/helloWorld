package BookStatuses;

public class Book {
    private String title;
    private Status status = Status.AVAILABLE;
    public void setStatus(Status status) {
        this.status = status;
    }
    public Status getStatus() {
        return status;
    }
    Book(String nameBook) {
        this.title = title;
    }
}
