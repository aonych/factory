package factoryMethod.polishBikes;

import model.Bike;
import model.BikeType;

import java.util.Arrays;

public class PolishElectricBike extends Bike {

    public PolishElectricBike() {
        setBrand("DHS");
        setType(BikeType.ELECTRIC);
        setWheels("28");
        setFrame("stalowa");
        setEngine(true);
        setParts(Arrays.asList("bell"));
    }

    @Override
    public Bike createBike() {
        return null;
    }

}
