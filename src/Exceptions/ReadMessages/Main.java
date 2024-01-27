package Exceptions.ReadMessages;

import Exceptions.CheckingResource.AccessDeniedException;

public class Main {
    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("fdsf", 123, 19)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Что-то", 2, 13)
        };
    }

    public static void validEvent(Event event) throws RuntimeException {
        if (event.getAge() == 0 || event.getTitle().equals(null) || event.getReleaseYear() == 0) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }
}
