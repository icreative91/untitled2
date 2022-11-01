import lesson4hw.Couch;
import org.junit.jupiter.api.Test;

public class ObjectsPracticeCouch {
    @Test
    public void workingWithOrders() {
        Couch firstCouch = new Couch();

        firstCouch.setColour("Black");
        firstCouch.setHeight(2.25);
        firstCouch.setLenght(4.67);
        firstCouch.setMaterial("Leather");
        firstCouch.setWeight(38);

        System.out.println(firstCouch.getColour());
        System.out.println(firstCouch.getHeight());
        System.out.println(firstCouch.getLenght());
        System.out.println(firstCouch.getMaterial());
        System.out.println(firstCouch.getWeight());
    }
}
