package builder_pattern.builder;

import builder_pattern.product.Order;
import builder_pattern.product.type.BreadType;
import builder_pattern.product.type.OrderType;
import builder_pattern.product.type.SauceType;
import builder_pattern.product.type.VegetableType;

public interface OrderBuilder {

    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();
}
