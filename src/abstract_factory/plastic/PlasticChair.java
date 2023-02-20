package abstract_factory.plastic;

import abstract_factory.furniture.Chair;

public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create plastic chair");
    }
}
