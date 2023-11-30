package EnumBigDecimalMath.Currensy;
import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal convert1 = CurrencyConverter.convertCurrency(new BigDecimal("50001"), Currency.KZT, Currency.EUR); //переводим тенге в евро
        System.out.println(convert1);
        BigDecimal convert2 = CurrencyConverter.convertCurrency(new BigDecimal("50"), Currency.USD, Currency.KZT); //переводим тенге в доллар
        System.out.println(convert2);
    }
}
