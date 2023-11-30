package EnumBigDecimalMath.Shop;
import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal laptopPrice = new BigDecimal("300");
        BigDecimal shortsPrise = new BigDecimal("20");
        Product product = new Product(ProductСategory.ELECTRONICS, "laptop", laptopPrice);
        Product product1 = new Product(ProductСategory.CLOTH, "shorts", shortsPrise);
        SaleRecord saleRecord = new SaleRecord();

        //если товар продан
        saleRecord.setArrayProduct(product); //записываем информацию о проданном товаре в массив
        saleRecord.setArrayProduct(product1);
        saleRecord.displayProduct(); //выводим информацию о проданном товаре

        BigDecimal i = saleRecord.amountOfRevenue();
        System.out.println("Выручка: " + i);
    }
}
