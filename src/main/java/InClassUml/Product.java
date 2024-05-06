package InClassUml;

public abstract class Product
{
    private final int iD;
    private static int sharedID;
    private Size size;
    private String name;
    private double price;
    private int inventory;

    public Product(String name, Size size, double price, int inventory)
    {
        this.size = size;
        this.iD = sharedID;
        this.price = price;
        this.name = name;
        this.inventory = inventory;
        sharedID++;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getInventory() {
        return inventory;
    }
    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
