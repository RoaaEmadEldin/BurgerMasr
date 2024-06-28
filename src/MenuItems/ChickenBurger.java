package MenuItems;

import Database.Database;

public class ChickenBurger extends Burger{

    public ChickenBurger() {
        super();
        this.name = "Chicken Burger";
        this.price += Database.getBasicIngredientPrice("Chicken");
    }

//    @Override
//    public String printInformation(){
//        return super.printInformation();
//    }
}
