import lesson4hw.Tv;
import org.junit.jupiter.api.Test;

public class ObjectsPracticeTv {
    @Test
    public void workingWithTv() {
        Tv firstTv = new Tv ();

        firstTv.setColour("White");
        firstTv.setHeight(8.57458);
        firstTv.setMaterial("Plastic");
        firstTv.setHeight(154.45);
        firstTv.setLenght(258.85);

        System.out.println(firstTv.getColour());
        System.out.println(firstTv.getMaterial());
        System.out.println(firstTv.getLenght());
        System.out.println(firstTv.getWeight());
        System.out.println("Yooooo yoooo TV");


    }
}
