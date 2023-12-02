package EnumBigDecimalMath.Taxes;

import EnumBigDecimalMath.Taxes.Income;

import java.math.BigDecimal;

public class TaxCalculator {
    private static final BigDecimal IPN = new BigDecimal("10");
    private static final BigDecimal BOCMC = new BigDecimal("2");
    private static final BigDecimal INVESTMEN_TAX = new BigDecimal("13");
    private static final BigDecimal PROPERTY_TAX = new BigDecimal("0.5");

    public static BigDecimal calculateTax(BigDecimal amount, Income income) {
        switch (income) {
            case SALARY:
                return getSalary(amount);
            case INVESTMENTS:
                return getInvestments(amount);
            case RENT:
                return getRent(amount);
        }
        return null;
    }

    private static BigDecimal getSalary(BigDecimal amount) {
        BigDecimal result;
        BigDecimal sumTax = IPN.add(BOCMC);
        result = amount.multiply(sumTax.divide(new BigDecimal("100")));
        return result;
    }

    private static BigDecimal getInvestments(BigDecimal amount) {
        BigDecimal result;
        result = amount.multiply(INVESTMEN_TAX.divide(new BigDecimal("100")));
        return result;
    }

    private static BigDecimal getRent(BigDecimal amount) {
        BigDecimal result;
        result = amount.multiply(PROPERTY_TAX.divide(new BigDecimal("100")));
        return result;
    }
}
