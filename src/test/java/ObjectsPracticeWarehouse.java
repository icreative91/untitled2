import lesson4hw.Warehouse;
import org.junit.jupiter.api.Test;

public class ObjectsPracticeWarehouse {
    @Test
    public void workingWithWarehouse() {
        Warehouse firstWarehouse = new Warehouse ();

        firstWarehouse.setCapaticy(78952.5);
        firstWarehouse.setEntrance(5);
        firstWarehouse.setRamp(24);
        firstWarehouse.setWidth(852);
        firstWarehouse.setLenght(458);

        System.out.println(firstWarehouse.getCapaticy());
        System.out.println(firstWarehouse.getEntrance());
        System.out.println(firstWarehouse.getRamp());
        System.out.println(firstWarehouse.getWidth());
        System.out.println(firstWarehouse.getLenght());

    }
}
