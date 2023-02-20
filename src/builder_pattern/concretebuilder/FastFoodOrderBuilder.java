package builder_pattern.concretebuilder;

import builder_pattern.builder.OrderBuilder;
import builder_pattern.product.Order;
import builder_pattern.product.type.BreadType;
import builder_pattern.product.type.OrderType;
import builder_pattern.product.type.SauceType;
import builder_pattern.product.type.VegetableType;

public class FastFoodOrderBuilder implements OrderBuilder {
    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;

    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    @Override
    public OrderBuilder orderBread(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    @Override
    public OrderBuilder orderSauce(SauceType sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    @Override
    public OrderBuilder orderVegetable(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
        return this;
    }

    @Override
    public Order build() {
        return new Order(orderType, breadType, sauceType, vegetableType);
    }

}
