package EnumBigDecimalMath.Taxes;

import EnumBigDecimalMath.Taxes.Income;
import EnumBigDecimalMath.Taxes.TaxCalculator;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal salary = TaxCalculator.calculateTax(new BigDecimal("100000"), Income.SALARY); //вычет налогов по зарплате
        System.out.println("C зарплаты высчитывается: " + salary + " тенге");

        BigDecimal investments = TaxCalculator.calculateTax(new BigDecimal("1000000"), Income.INVESTMENTS); //налог на инвестиции
        System.out.println("Налог с инвестиций составил: " + investments);

        BigDecimal rent = TaxCalculator.calculateTax(new BigDecimal("150000000"), Income.RENT); //на недвижимость
        System.out.println("Налогн на недвижимость: " + rent);
    }
}
