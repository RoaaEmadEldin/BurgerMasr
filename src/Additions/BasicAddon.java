package Additions;

public class BasicAddon extends Addon{
    public BasicAddon(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
