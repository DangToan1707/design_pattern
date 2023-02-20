package abstract_factory.wood;

import abstract_factory.furniture.Table;

public class WoodTable implements Table {

    @Override
    public void create() {
        System.out.println("Create wood table");
    }
}
