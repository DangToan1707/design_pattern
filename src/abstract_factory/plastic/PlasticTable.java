package abstract_factory.plastic;

import abstract_factory.furniture.Table;

public class PlasticTable implements Table {
    @Override
    public void create() {
        System.out.println("Create plastic table");
    }
}
