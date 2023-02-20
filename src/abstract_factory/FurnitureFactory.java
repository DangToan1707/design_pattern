package abstract_factory;

import abstract_factory.plastic.PlasticFactory;
import abstract_factory.wood.WoodFactory;

public class FurnitureFactory {
    // Returns a concrete factory object that is an instance of the
    // concrete factory class appropriate for the given architecture.
    public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
        switch (materialType) {
            case PLASTIC:
                return new PlasticFactory();
            case WOOD:
                return new WoodFactory();
            default:
                throw new UnsupportedOperationException("This furniture is unsupported ");
        }
    }
}
