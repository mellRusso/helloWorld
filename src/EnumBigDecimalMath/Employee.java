package EnumBigDecimalMath;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private BigDecimal regularHours;
    private BigDecimal overtimeHours;

    Employee(String name, BigDecimal regularHours, BigDecimal overtimeHours) {
        this.name = name;
        this.regularHours = regularHours;
        this.overtimeHours = overtimeHours;
    }

    public void calculatorHours(WorkTime workType, BigDecimal hours) {
        if (workType == WorkTime.REGULAR) {
            regularHours = regularHours.add(hours);
        } else {
            overtimeHours = overtimeHours.add(hours);
        }
    }

    public BigDecimal getRegularHours() {
        return regularHours;
    }

    public BigDecimal getOvertimeHours() {
        return overtimeHours;
    }

    public BigDecimal calculatorOvertime(int day, BigDecimal hours) {
        int regular = day * 8;
        BigDecimal overtime = new BigDecimal(regular).subtract(hours);
        return overtime;
    }
}
