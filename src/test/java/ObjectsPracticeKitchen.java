import lesson4hw.Kitchen;
import org.junit.jupiter.api.Test;

public class ObjectsPracticeKitchen {
    @Test
    public void workingWithGarden() {
        Kitchen firstKitchen = new Kitchen ();

        firstKitchen.setColour("White");
        firstKitchen.setPlatesDishes(58);
        firstKitchen.setLenght(4.58);
        firstKitchen.setMaterial("Wood");
        firstKitchen.setMagnets(12);

        System.out.println(firstKitchen.getColour());
        System.out.println(firstKitchen.getPlatesDishes());
        System.out.println(firstKitchen.getLenght());
        System.out.println(firstKitchen.getMaterial());
        System.out.println(firstKitchen.getMagnets());

    }
}
