package Exceptions.CheckingResource;

import java.util.Scanner;

public class Main {
    public static User[] getUsers() {
        User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
        User user2 = new User("qwer", "qwer@gmail.com", "test", 17);
        User user3 = new User("wanderer", "wander@gmail.com", "wanderTest", 18);
        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPass().equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("User under 18 years old");
        }
    }

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        User user = Main.getUserByLoginAndPassword(login, password);
        Main.validateUser(user);

        System.out.println("Доступ предоставлен");
    }

}
