package factoryMethod.germanBikes;

import model.Bike;
import model.BikeType;

import java.util.Arrays;

public class GermanKidsBike extends Bike {

    public GermanKidsBike() {
        setBrand("Merida");
        setType(BikeType.KIDS);
        setWheels("20");
        setFrame("stalowa");
        setEngine(false);
        setParts(Arrays.asList("bell"));
    }

    @Override
    public Bike createBike() {
        return null;
    }
}
