package Arrays.Finance;

public class ExpensesManager {
    double[] expenses; //создаем массив который будет хранить траты за неделю.

    ExpensesManager() { //создаем конструктор в котором происходит инициализация массива
        expenses = new double[7];
    }

    double saveExpense(double moneyBeforeSalary, int day, double expense) {
        //метод принимающий день и сумму траты за этот день! после отнимает сумму траты с общей суммы и показывает сколько осталось!
        moneyBeforeSalary = moneyBeforeSalary - expense; //отнимаем от общей суммы сумму траты!
        expenses[day - 1] = expenses[day - 1] + expense; //сохранение траты в массив
        System.out.println("Значение сохранено! Ваш текущий баланс в тенге: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) { //если меньше 1000 то стоит начать экономить!
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary; //возвращаем остаток на счете
    }

    double findMaxExpense() { //метод позволяющий найти максимальную трату за неделю!
        double maxExpense = 0; //инициализируем
        for (int i = 0; i < expenses.length; i++) { //пробегаемся по массиву с тратами
            if (expenses[i] > maxExpense) { //если нынешний эллемент массива больше максимальной траты сохраняем
                maxExpense = expenses[i]; //таким образом находим наибольшее значение в массиве
            }
        }
        return maxExpense; //возвращаем его
    }

    void printAllExpenses() { //выводим список список трат за неделю!
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " тенге");
        }
    }


}
