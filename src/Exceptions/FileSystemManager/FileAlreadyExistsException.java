package Exceptions.FileSystemManager;

public class FileAlreadyExistsException extends Exception {
    public FileAlreadyExistsException(String message) {
        super(message);
    }
}
