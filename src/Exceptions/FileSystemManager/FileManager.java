package Exceptions.FileSystemManager;

import Exceptions.CheckingResource.AccessDeniedException;

import java.util.HashMap;

public class FileManager {
    private HashMap<String, String> files = new HashMap<>();
    HashMap<String, String> directory = new HashMap<>();

    public void createFile(String nameFile) throws FileAlreadyExistsException, InvalidPathException {
        if (files.containsKey(nameFile)) {
            throw new FileAlreadyExistsException("Файл уже существует");
        } else if (isAvailability(nameFile)) {
            throw new InvalidPathException("Путь к файлу недоступен либо неверен");
        }
        files.put(nameFile, "Какое-то содержимое файла");
        System.out.println("Вы создали файл");
    }

    public boolean isAvailability(String nameFile) { //доступность к файлу
        return false;
    }

    public void deleteFile(String nameFile) throws FileNotFoundException, FileDeletionException {
        if (!files.containsKey(nameFile)) {
            throw new FileNotFoundException("Файла не существует");
        } else if (protectFromDeletion(nameFile)) {
            throw new FileDeletionException("Файл зищещен от удаления");
        }
        directory.remove(nameFile);
        System.out.println("Файл был удален");
    }

    public boolean protectFromDeletion(String nameFile) {
        return false;
    }

    public void moveFile(String nameFile, String nameDirectory) throws FileNotFoundException, DirectoryNotFoundException, FileAlreadyExistsException {
        if (!files.containsKey(nameFile)) {
            throw new FileNotFoundException("Файл не найден");
        } else if (!directory.containsKey(nameDirectory)) {
            throw new DirectoryNotFoundException("Директория не существует");
        } else if (directory.containsValue(nameFile)) {
            throw new FileAlreadyExistsException("Файл уже существует в директории");
        }
        System.out.println("Ваш файл " + nameFile + " перемещен в директорию " + nameDirectory);
    }

    public void createDirectory(String nameDirectory) throws DirectoryAlreadyExistsException, DirectoryNotEmptyException {
        if (directory.containsKey(nameDirectory)) {
            throw new DirectoryAlreadyExistsException("Директория с таким именем уже существует");
        }
        directory.put(nameDirectory, "Какая-то там директория");
        System.out.println("Директория была создана");
    }

    public void deleteDirectory(String nameDirectory) throws DirectoryNotEmptyException {
        if (directory.isEmpty()) {
            throw new DirectoryNotEmptyException("Директорию удалить нельзя!");
        }
        directory.remove(nameDirectory);
        System.out.println("Директория была удалена");
    }
}
