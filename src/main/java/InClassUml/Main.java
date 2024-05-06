package InClassUml;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Product product1 = new Hat("Blue Hat",Size.L,9.99,20);
        Product product2 = new Sweater("Big Sweater",Size.XL,19.99,22);
        Product product3 = new Fries("Deluxe fries",Size.M,5.99,20);
        ArrayList<Product> groceryList = new ArrayList<Product>();
        groceryList.add(product1);
        groceryList.add(product2);
        Cart newCart = new Cart(groceryList);
        User newGuy = new User(newCart);
        newGuy.addToCart(product3);
        System.out.println(groceryList);
        System.out.println(newCart.subTotal());
    }
}
