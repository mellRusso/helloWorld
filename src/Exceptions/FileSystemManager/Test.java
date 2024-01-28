package Exceptions.FileSystemManager;

public class Test {
    public static void main(String[] args) throws FileAlreadyExistsException, InvalidPathException, FileDeletionException, FileNotFoundException, DirectoryAlreadyExistsException, DirectoryNotEmptyException, DirectoryNotFoundException {
        FileManager fileManager = new FileManager();

        fileManager.createFile("test.txt"); //создаем файл
        // fileManager.createFile("test.txt"); //пытаемся создать файл с похожим именем

        //fileManager.deleteFile("ddadasd"); //пытаемся удалить файл которого нету
        fileManager.deleteFile("test.txt");

        fileManager.createDirectory("index.dir"); //создаем директорию
        //fileManager.createDirectory("index.dir");//пытаемся создать похожую директорию
        fileManager.deleteDirectory("index.dir");

        fileManager.createFile("index.txt");
        fileManager.createDirectory("test.dir");
        fileManager.moveFile("index.txt", "testl.dir");
    }
}
