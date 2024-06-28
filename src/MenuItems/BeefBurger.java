package MenuItems;

import Database.Database;

public class BeefBurger extends Burger{
    public BeefBurger() {
        super();
        this.name = "Beef Burger";
        this.price += Database.getBasicIngredientPrice("Beef");
    }
}
