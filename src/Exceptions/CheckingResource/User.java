package Exceptions.CheckingResource;

public class User {
    private String login;
    private String email;
    private String password;
    private int age;

    public User(String login, String email, String password, int age) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
