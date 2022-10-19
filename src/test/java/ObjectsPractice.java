import lesson4hw.OrderSecond;
import org.junit.jupiter.api.Test;

public class ObjectsPractice {
    @Test

    public void workingWithOrders() {
        OrderSecond firstOrder = new OrderSecond();

        firstOrder.setTotalPrice(12.34);
        firstOrder.setAddress("Rigas str.22");
        firstOrder.setItemCount(9);

        OrderSecond secondOrder = new OrderSecond();
        secondOrder.setTotalPrice(55.67);
        secondOrder.setAddress("Lubanas str. 43-13");
        secondOrder.setItemCount(3);

        System.out.println("Hello world!");
        System.out.println("1st order");
        System.out.println(firstOrder.getTotalPrice());

        System.out.println("2nd order");
        System.out.println(secondOrder.getTotalPrice());

    }
}

