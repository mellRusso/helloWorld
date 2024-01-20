package LessonExceptions;

public class Person {
    String name;
    int dnaCode;

    @Override
    public String toString() {
        return "Person{ " +
                "name: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name == person.name;
    }

    @Override
    public int hashCode() {
        return dnaCode;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();


    }
}
