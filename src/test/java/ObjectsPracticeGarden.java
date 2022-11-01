import lesson4hw.Garden;
import org.junit.jupiter.api.Test;

public class ObjectsPracticeGarden {
    @Test
    public void workingWithGarden() {
        Garden firstGarden = new Garden ();

        firstGarden.setGrassColour("Green");
        firstGarden.setGrass("Sport");
        firstGarden.setLenght(159.85);
        firstGarden.setWidth(45.78);
        firstGarden.setFence("Wood");

        System.out.println(firstGarden.getGrassColour());
        System.out.println(firstGarden.getGrass());
        System.out.println(firstGarden.getLenght());
        System.out.println(firstGarden.getWidth());
        System.out.println(firstGarden.getFence());

    }
}
