package InClassUml;

public class Shirt extends Clothing{
    private static int inventory;

    public Shirt(int iD, String name, Size size, double price, int inventory) {
        super(iD, name, size, price, inventory);
    }
}
