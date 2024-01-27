package Exceptions.CheckingResource;

public class AccessDeniedException extends Exception {
    public AccessDeniedException(String message) {
        super(message);
    }
}
