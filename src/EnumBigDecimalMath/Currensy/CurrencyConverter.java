package EnumBigDecimalMath.Currensy;
import java.math.BigDecimal;
public class CurrencyConverter {
    private static final BigDecimal EUR_TO_USD = new BigDecimal("1.10");
    private static final BigDecimal EUR_TO_KZT = new BigDecimal("504.40");
    private static final BigDecimal USD_TO_KZT = new BigDecimal("459.17");
    private static final BigDecimal USD_TO_EUR = new BigDecimal("0.91");
    private static final BigDecimal KZT_TO_USD = new BigDecimal("0.0022");
    private static final BigDecimal KZT_TO_EUR = new BigDecimal("0.0020");

    public static BigDecimal convertCurrency(BigDecimal amount, Currency from, Currency to) {
        BigDecimal result;
        if (from == to) {
            result = amount;
        } else {
            BigDecimal rate = getExchangeRate(from, to);
            result = amount.multiply(rate);
        }
        return result;
    }

    private static BigDecimal getExchangeRate(Currency from, Currency to) {
        switch (from) {
            case EUR:
                return getEUR(to);
            case USD:
                return getUSD(to);
            case KZT:
                return getKZT(to);
        }
        return null;
    }

    private static BigDecimal getEUR(Currency to) {
        switch (to) {
            case USD:
                return EUR_TO_USD;
            case KZT:
                return EUR_TO_KZT;
        }
        return null;
    }

    private static BigDecimal getUSD(Currency to) {
        switch (to) {
            case EUR:
                return USD_TO_EUR;
            case KZT:
                return USD_TO_KZT;
        }
        return null;
    }

    private static BigDecimal getKZT(Currency to) {
        switch (to) {
            case EUR:
                return KZT_TO_EUR;
            case USD:
                return KZT_TO_USD;
        }
        return null;
    }
}
