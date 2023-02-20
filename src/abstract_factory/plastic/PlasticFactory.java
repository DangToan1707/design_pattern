package abstract_factory.plastic;

import abstract_factory.furniture.Chair;
import abstract_factory.FurnitureAbstractFactory;
import abstract_factory.furniture.Table;

public class PlasticFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
