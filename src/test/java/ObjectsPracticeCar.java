import lesson4hw.Car;
import lesson4hw.Couch;
import org.junit.jupiter.api.Test;

public class ObjectsPracticeCar {
    @Test
    public void workingWithCars() {
        Car firstCar = new Car();

        firstCar.setTotalPrice(1500);
        firstCar.setColour("Green");
        firstCar.setModel("Rav4");
        firstCar.setWeight(2054);
        firstCar.setManufacturer("Toyota");

        System.out.println(firstCar.getTotalPrice());
        System.out.println(firstCar.getColour());
        System.out.println(firstCar.getModel() );
        System.out.println(firstCar.getTopSpeed());
        System.out.println(firstCar.getManufacturer());

   }
}
