package EnumBigDecimalMath.Shop;
import java.math.BigDecimal;

public class Product {
    private ProductСategory productСategory;
    private String productName;
    private BigDecimal price;

    public Product(ProductСategory productСategory, String productName, BigDecimal price) {
        this.productСategory = productСategory;
        this.productName = productName;
        this.price = price;
    }

    public ProductСategory getProductСategory() {
        return productСategory;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
