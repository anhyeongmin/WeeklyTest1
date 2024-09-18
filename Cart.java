package src;
import java.math.BigDecimal;

public class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public BigDecimal calculateDeliveryCharge() {
        int totalWeight = 0;
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Product product : products) {
            totalWeight += product.getWeight();
            BigDecimal discount = product.getDiscountAmount();
            totalPrice = totalPrice.add(product.getPrice().subtract(discount));
        }

        System.out.println("Total Price (After Discounts): " + totalPrice);

        // 초기 배송비 설정
        BigDecimal deliveryCharge = BigDecimal.ZERO;

        // 무게에 따른 배송비 계산
        if (totalWeight < 3) {
            deliveryCharge = new BigDecimal(1000);
        } else if (totalWeight < 10) {
            deliveryCharge = new BigDecimal(5000);
        } else {
            deliveryCharge = new BigDecimal(10000);
        }

        // 총 가격이 30000 이상이면 배송비 1000원 할인
        if (totalPrice.compareTo(new BigDecimal(30000)) >= 0) {
            deliveryCharge = deliveryCharge.subtract(new BigDecimal(1000));
        }

        // 총 가격이 100000 이상이면 배송비 무료
        if (totalPrice.compareTo(new BigDecimal(100000)) >= 0) {
            deliveryCharge = BigDecimal.ZERO;
        }

        return deliveryCharge;
    }
}
