package factoryMethod.germanBikes;

import model.Bike;
import model.BikeType;

import java.util.Arrays;

public class GermanCityBike extends Bike {

    public GermanCityBike() {
        setBrand("Merida");
        setType(BikeType.CITY);
        setWheels("26");
        setFrame("stalowa");
        setEngine(false);
        setParts(Arrays.asList("front basket"));
    }

    @Override
    public Bike createBike() {
        return null;
    }
}
