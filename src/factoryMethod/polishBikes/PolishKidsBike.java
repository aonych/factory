package factoryMethod.polishBikes;

import model.Bike;
import model.BikeType;

import java.util.Arrays;

public class PolishKidsBike extends Bike {

    public PolishKidsBike() {
        setBrand("Kellys");
        setType(BikeType.KIDS);
        setWheels("22");
        setFrame("aluminiowa");
        setEngine(false);
        setParts(Arrays.asList("basket"));
    }

    @Override
    public Bike createBike() {
        return null;
    }
}
