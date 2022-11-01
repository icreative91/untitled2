import lesson4hw.Watch;
import org.junit.jupiter.api.Test;

public class ObjectsPracticeWatch {
    @Test
    public void workingWithWatch() {
        Watch firstWatch = new Watch ();

        firstWatch.setColour("Black gloss");
        firstWatch.setModel("G-shock");
        firstWatch.setKind("Analog");
        firstWatch.setManufacturer("Casio");
        firstWatch.setClockface("tampered gloss");

        System.out.println(firstWatch.getColour());
        System.out.println(firstWatch.getModel());
        System.out.println(firstWatch.getKind());
        System.out.println(firstWatch.getManufacturer());
        System.out.println(firstWatch.getClockface());
        System.out.println("BIIIIIIINGO, well done");

    }
}
