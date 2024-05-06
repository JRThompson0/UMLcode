package InClassUml;


import java.util.ArrayList;

public class Cart
{
    private ArrayList<Product> arrayList;
    private final float tax = .10f;
    private Special special;
    public Cart(ArrayList<Product> arrayList)
    {
        this.arrayList = arrayList;
    }
    public int  cartQty(){
         return 0;
    }
    public double subTotal()
    {
        double sum = 0.00;
        for(Product currentOne:arrayList)
        {
            sum=sum+currentOne.getPrice();
        }
        return sum;
    }
    public double totalAfterTax(){
         return 0.0;
    }
    public void checkOut(){

    }
    public ArrayList<Product> getList() {
        return arrayList;
    }
    public void setList(ArrayList<Product> arrayList) {
        this.arrayList = arrayList;
    }
    public void addToList(Product product)
    {
        arrayList.add(product);
    }
}
