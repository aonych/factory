package factoryMethod.polishBikes;

import model.Bike;
import model.BikeType;

import java.util.Arrays;

public class PolishMountainBike extends Bike {

    public PolishMountainBike() {
        setBrand("Devron");
        setType(BikeType.MOUNTAIN);
        setWheels("28");
        setFrame("tytanowa");
        setEngine(false);
        setParts(Arrays.asList("led lamp"));
    }

    @Override
    public Bike createBike() {
        return null;
    }
}
