package classesAndObjects.Library;

public class Director {
    Library library = new Library();

    public void setTime(int hoursStart, int hoursFinish) { //установить время работы библиотеки
        library.setWorkingHours(hoursStart, hoursFinish);
    }


}
