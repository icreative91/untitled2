import lesson4hw.Laptop;
import org.junit.jupiter.api.Test;

public class ObjectsPracticeLaptop {
    @Test
    public void workingWithLaptop() {
        Laptop firstLaptop = new Laptop ();

        firstLaptop.setColour("Pink");
        firstLaptop.setMaterial("Metal");
        firstLaptop.setDiagonal(15.6);
        firstLaptop.setPlatform("Windows");
        firstLaptop.setLanguage("Russian");


        System.out.println("My new Laptop have some INFO");
        System.out.println(firstLaptop.getColour());
        System.out.println(firstLaptop.getMaterial());
        System.out.println(firstLaptop.getDiagonal());
        System.out.println(firstLaptop.getPlatform());
        System.out.println(firstLaptop.getLanguage());

    }
}
