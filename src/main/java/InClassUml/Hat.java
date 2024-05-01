package InClassUml;

public class Hat extends Clothing{
    private static int inventory;

    public Hat(int iD, String name, Size size, double price, int inventory) {
        super(iD, name, size, price, inventory);
    }
}
