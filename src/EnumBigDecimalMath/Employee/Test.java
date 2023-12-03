package EnumBigDecimalMath.Employee;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Petr", new BigDecimal("0"), new BigDecimal("0"));

        employee.calculatorHours(WorkTime.REGULAR, new BigDecimal("8")); //фиксирует количество обычных часов
        employee.calculatorHours(WorkTime.OVERTIME, new BigDecimal("4.3")); //фиксирует количество сверхурочных часов

        System.out.println("Обычные часы: " + employee.getRegularHours());
        System.out.println("Сверхурочные часы: " + employee.getOvertimeHours());

        BigDecimal overtime = employee.calculatorOvertime(8, new BigDecimal("43")); //высчитывает сверхурочные часы исходя из количество отработанных дней и общего количество отработанных часов
        System.out.println(overtime);
    }
}
