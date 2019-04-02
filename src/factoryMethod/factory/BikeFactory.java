package factoryMethod.factory;

import model.Bike;
import model.BikeType;

public abstract class BikeFactory {

    //metoda fabrykująca
    abstract Bike createBike(BikeType type);

    public Bike orderBike(BikeType type) {
        Bike bike = createBike(type);

        if (bike != null) {
            bike.prepareParts();
        }

        return bike;
    }
}
