package abstract_factory.wood;

import abstract_factory.furniture.Chair;

public class WoodChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create wood chair");
    }
}
