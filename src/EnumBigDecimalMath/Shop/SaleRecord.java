package EnumBigDecimalMath.Shop;
import java.math.BigDecimal;

public class SaleRecord {
    Product[] arrayProduct = new Product[5];
    int indexArrayProduct;
    BigDecimal revenue = new BigDecimal("0");

    public void setArrayProduct(Product product) {
        arrayProduct[indexArrayProduct++] = product;
    }

    public void displayProduct() {
        for (Product pro : arrayProduct) {
            if (pro != null) {
                System.out.println("Категория: " + pro.getProductСategory() + " Наименование: " + pro.getProductName() + " Цена: " + pro.getPrice());
            }
        }
    }

    public BigDecimal amountOfRevenue() {
        for(int i = 0; i < arrayProduct.length; i++) {
            if(arrayProduct[i] != null) {
                revenue = revenue.add(arrayProduct[i].getPrice());
            }
        }
        return revenue;
    }
}
