package factoryMethod.polishBikes;

import model.Bike;
import model.BikeType;

import java.util.Arrays;

public class PolishCityBike extends Bike {

    public PolishCityBike() {
        setBrand("Devron");
        setType(BikeType.CITY);
        setWheels("28");
        setFrame("aluminiowa");
        setEngine(false);
        setParts(Arrays.asList("back basket"));
    }

    @Override
    public Bike createBike() {
        return null;
    }
}
