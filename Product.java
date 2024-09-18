package src;
import java.math.BigDecimal;

public abstract class Product implements Promotion {
    protected String name;
    protected BigDecimal price;
    protected int weight;

    public Product(String name, BigDecimal price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
}
