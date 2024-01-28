package Exceptions.FileSystemManager;

public class DirectoryNotEmptyException extends Exception {
    public DirectoryNotEmptyException(String message) {
        super(message);
    }
}
