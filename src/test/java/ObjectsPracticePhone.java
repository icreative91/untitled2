import lesson4hw.Phone;
import org.junit.jupiter.api.Test;

public class ObjectsPracticePhone {
    @Test
    public void workingWithPhone() {
        Phone firstPhone = new Phone ();

        firstPhone.setColour("Tempered BLack");
        firstPhone.setHeight(1.58);
        firstPhone.setWidth(4.58);
        firstPhone.setS("4S");



        System.out.println(firstPhone.getColour());
        System.out.println(firstPhone.getHeight());
        System.out.println(firstPhone.getWidth());
        System.out.println("Dima Hello");

    }
}
