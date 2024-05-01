package InClassUml;


import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> arrayList;
    private final float tax = .10f;
    private Special special;

    public Cart(ArrayList<Product> arrayList) {
        this.arrayList = arrayList;
    }

    public int  cartQty(){
         return 0;
    }
    public double subTotal(){
         return 0.0;
    }
    public double totalAfterTax(){
         return 0.0;
    }
    public void checkOut(){

    }

}
