package Exceptions.FileSystemManager;

public class DirectoryAlreadyExistsException extends Exception {
    public DirectoryAlreadyExistsException(String message) {
        super(message);
    }
}
