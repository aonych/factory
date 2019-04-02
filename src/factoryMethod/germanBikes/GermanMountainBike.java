package factoryMethod.germanBikes;

import model.Bike;
import model.BikeType;

import java.util.Arrays;

public class GermanMountainBike extends Bike {

    public GermanMountainBike() {
        setBrand("DHS");
        setType(BikeType.MOUNTAIN);
        setWheels("28");
        setFrame("tytanowa");
        setEngine(false);
        setParts(Arrays.asList("lamp"));
    }

    @Override
    public Bike createBike() {
        return null;
    }
}
