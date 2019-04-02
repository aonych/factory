package factoryMethod.polishBikes;

import model.Bike;
import model.BikeType;

import java.util.Arrays;

public class PolishCrossBike extends Bike {

    public PolishCrossBike() {
        setBrand("Arkus");
        setType(BikeType.CROSS);
        setWheels("28");
        setFrame("aluminiowa");
        setEngine(false);
        setParts(Arrays.asList("lamp"));
    }

    @Override
    public Bike createBike() {
        return null;
    }
}
