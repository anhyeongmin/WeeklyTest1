package src;
import java.math.BigDecimal;

public class Grocery extends Product {
    public Grocery(String name, BigDecimal price, int weight) {
        super(name, price, weight);
    }

    @Override
    public BigDecimal getDiscountAmount() {
        return new BigDecimal(2000); // 고정 할인 금액
    }
}
