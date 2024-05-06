package InClassUml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Array;
import java.util.ArrayList;

class CartTest
{
    @Test
    void subTotal()
    {
        Product product1 = new Hat("Blue Hat",Size.L,9.99,20);
        Product product2 = new Sweater("Big Sweater",Size.XL,19.99,22);
        Product product3 = new Fries("Deluxe fries",Size.M,4.99,20);
        ArrayList<Product> arrayList = new ArrayList<Product>();
        arrayList.add(product1);
        arrayList.add(product2);
        arrayList.add(product3);
        Cart daCart = new Cart(arrayList);
        Assertions.assertEquals(34.97,daCart.subTotal());
    }
}