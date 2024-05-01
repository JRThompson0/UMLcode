package InClassUml;

public class Soda extends Food implements Perishable{
    private static int inventory;

    public Soda(int iD, String name, Size size, double price, int inventory) {
        super(iD, name, size, price, inventory);
    }

    @Override
    public boolean isPerishable() {
        return true;
    }
}
