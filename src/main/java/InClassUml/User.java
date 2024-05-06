package InClassUml;

public class User {
    private  int ID;//final
    private static int sharedID;
    private Cart cart;


    public User(Cart initializeCart)
    {
        ID=sharedID;
        sharedID++;
        this.cart=initializeCart;
    }
    public void addToCart(Product product)
    {
            this.cart.addToList(product);
    }
    public void addToCart(Product product,int qty)
    {
        while (qty>0)
        {
            this.cart.addToList(product);
            qty--;
        }
    }

    private void removeFromCart(Product product,int qty){

    }


}
