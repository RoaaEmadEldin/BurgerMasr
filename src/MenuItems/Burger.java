package MenuItems;

import Database.Database;

public class Burger extends MenuItem{

    public Burger() {
        super("Burger", Database.getBasicIngredientPrice("Bread"));
    }

    public Burger(String name, double price) {
        super(name, price);
    }
}

