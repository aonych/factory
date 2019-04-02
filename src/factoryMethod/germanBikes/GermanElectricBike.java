package factoryMethod.germanBikes;

import model.Bike;
import model.BikeType;

import java.util.Arrays;

public class GermanElectricBike extends Bike {

    public GermanElectricBike() {
        setBrand("Kellys");
        setType(BikeType.ELECTRIC);
        setWheels("29");
        setFrame("tytanowa");
        setEngine(true);
        setParts(Arrays.asList("led lamp"));
    }

    @Override
    public Bike createBike() {
        return null;
    }
}
