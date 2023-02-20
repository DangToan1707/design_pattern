package abstract_factory;

import abstract_factory.furniture.Chair;
import abstract_factory.furniture.Table;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();

    public abstract Table createTable();
}
