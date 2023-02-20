package builder_pattern;

import builder_pattern.concretebuilder.FastFoodOrderBuilder;
import builder_pattern.product.Order;
import builder_pattern.product.type.BreadType;
import builder_pattern.product.type.OrderType;
import builder_pattern.product.type.SauceType;

public class Client {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.ON_SITE).orderBread(BreadType.OMELETTE)
                .orderSauce(SauceType.SOY_SAUCE).build();
        System.out.println(order);
    }
}
