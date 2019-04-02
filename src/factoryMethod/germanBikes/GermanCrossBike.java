package factoryMethod.germanBikes;

import model.Bike;
import model.BikeType;

import java.util.Arrays;

public class GermanCrossBike extends Bike {

    public GermanCrossBike() {
        setBrand("Kellys");
        setType(BikeType.CROSS);
        setWheels("29");
        setFrame("stalowa");
        setEngine(false);
        setParts(Arrays.asList("bell"));
    }

    @Override
    public Bike createBike() {
        return null;
    }
}
