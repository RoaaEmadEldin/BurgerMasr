package Additions;

abstract public class Addon {
    protected String name;
    protected double price;

    public Addon(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract public double getPrice(); // There can be a discount applied to an addon in the future
    public void setPrice(double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

