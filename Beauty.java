package src;
import java.math.BigDecimal;

public class Beauty extends Product {
    public Beauty(String name, BigDecimal price, int weight) {
        super(name, price, weight);
    }

    @Override
    public BigDecimal getDiscountAmount() {
        return new BigDecimal(10000); // 고정 할인 금액
    }
}
