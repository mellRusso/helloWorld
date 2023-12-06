package EnumBigDecimalMath.TasksForMath;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.round(4.5)); //задача 1
        System.out.println("Наименьшее число: " + findumber(3, 5)[0] + " Наибольшее число: " + findumber(3, 5)[1]);
        System.out.println(sqrt(81));
        System.out.println(calculateСircumference(30));
        System.out.println(findLogarithm(2));
        System.out.println(hypotinuseCalculation(2, 2));
        System.out.println(findAreaTriangle(6, 6, 6));
        System.out.println("///////");
        solvingQuadraticEquation(2, -9, 7);
        System.out.println(findDistanceTwoPoints(-1, 3, 6, 2));
        System.out.println(findFactorial(7));
        int[] s = {7, 8, 6, 9, 10, 13, 18, 1};
        System.out.println(Arrays.toString(sort(s)));
        System.out.println(calculateСontribution(3, 100000));
    }

    public static int[] findumber(int a, int b) { //задача 2 ||максимум и минимум двух чисел
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int[] arrayNumber = {min, max};
        return arrayNumber;
    }

    public static double sqrt(int a) { //задача 3 || вычесление квадратного корня
        return Math.sqrt(a);
    }

    public static double powNumber(int a, int b) { //Задача 4 || возведение числа в n степень
        return Math.pow(a, b);
    }

    public static double calculateСircumference(int radius) { //Задача 5 || нахождение периметра окружности
        double p = 2 * Math.PI * radius;
        return p;
    }

    public static double findLogarithm(int a) { //Задача 5 || нахождение натурального логарифма
        double b = 0.000001;
        double result = 0;
        while (true) {
            if (result >= a) {
                return b;
            }
            result = Math.pow(Math.E, b);
            b += 0.000001;
        }
    }

    public static double hypotinuseCalculation(int a, int b) { //Задача 6 Вычисления гипотенузы
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }

    public static double degreesRadians(double a) { //Задача 7 из градусов в радианы
        return Math.toDegrees(a);
    }

    public static double radiansDegrees(double a) { //Задача 7  из радиана в градусы
        return Math.toRadians(a);
    }

    public static double findAreaTriangle(int a, int b, int c) { //Задача 8  Рассчет площади треугольника по трем сторонам
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static double findLog10(double a) { //Задача 9 Нахождение логарифма по основанию 10
        return Math.log10(a);
    }

    public static double findNaturalLog(double a) { //Задача 9 Нахождение натурального логарифма
        return Math.log(a);
    }

    public static double searchTrigonometricValues(int a) { //Задача 10 Рассчет тригонометрических значений для заданного угла
        double b = degreesRadians(a); //перевод в радианы
        double sin = Math.sin(b);
        double cos = Math.cos(b);
        double tan = Math.tan(b);
        return sin;
    }

    public static void solvingQuadraticEquation(int a, int b, int c) { //Задача 11 Квадратное уравнение
        double x = 0;
        double x2 = 0;
        if(a != 0) {
            double D = Math.sqrt(Math.pow(b, 2) - (4*a*c));
            System.out.println(D);
            if(D > 0) {
                x = ((-b) + D)/(2*a);
                x2 = ((-b) - D)/(2*a);
                System.out.println("Первый корень: " + x + " Второй корень: " + x2);
            } else if (D == 0) {
                x = (-b)/(2*a);
                System.out.println(x);
            } else if (D < 0) {
                System.out.println("Корней нет");
            }
        }
    }

    public static double findDistanceTwoPoints(int x1, int x2, int y1, int y2) { //Задача 12 Расстояние между двумя точками на плоскости
        double D = Math.sqrt((Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
        return D;
    }

    public static long findFactorial(long a) { //Задача 13 Нахождение факториала числа
        long result = 1;
        for(int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public static int[] sort(int[] a) { //Задача 14 Сортировка выбором
        int g = 0;
        for(int i = 0; i < a.length; i++) {
            int min = i;
            for(int j = i+1; j < a.length; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            if(min != i) {
                g = a[i];
                a[i] = a[min];
                a[min] = g;
            }
        }
        return a;
    }
    public static double calculateСontribution(int months, double amountMoney) { //Задача 15 Рассчет вклада
        double percent = 8; //годовые
        double profitForMonth = 0;
        double sumMonth = 0;
        for(int i = 0; i < months; i++) {
            profitForMonth = amountMoney*((percent/100)/365) * 30;
            amountMoney = amountMoney + profitForMonth;
            sumMonth += profitForMonth;
        }
        return sumMonth;
    }
}
