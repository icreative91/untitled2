import lesson4hw.Skates;
import org.junit.jupiter.api.Test;

public class ObjectsPracticeSkates {
    @Test
    public void workingWithLaptop() {
        Skates firstSkates = new Skates ();

        firstSkates.setColour("Black and White");
        firstSkates.setInlineSkates("Yes");
        firstSkates.setIceskates("No");
        firstSkates.setMaterial("Composite");
        firstSkates.setModel("VaporXXXX");

        System.out.println("I have bought a new one 1 week before");
        System.out.println(firstSkates.getColour());
        System.out.println(firstSkates.getMaterial());
        System.out.println("My new Ice hockey skates");
        System.out.println(firstSkates.getModel());


    }
}
