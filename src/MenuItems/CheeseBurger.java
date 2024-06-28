package MenuItems;

import Database.Database;

public class CheeseBurger extends BeefBurger{
    public CheeseBurger() {
        super();
        this.name = "Cheese Burger";
        this.price += Database.getBasicIngredientPrice("Cheese");
    }
}
