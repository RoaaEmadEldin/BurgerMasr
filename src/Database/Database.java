package Database;

import Additions.Addon;
import Additions.BasicAddon;
import BasicIngredients.BasicIngredient;
import MenuItems.BeefBurger;
import MenuItems.CheeseBurger;
import MenuItems.ChickenBurger;
import MenuItems.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Database {

    // Constants
    private static final BasicIngredient[] Constants = {
            new BasicIngredient("Bread", 10.0),
            new BasicIngredient("Beef", 60.0),
            new BasicIngredient("Chicken", 80.0),
            new BasicIngredient("Cheese", 10.0)
    };
    private static final List<MenuItem> Menu = new ArrayList<>() {
        {
            add(new BeefBurger());
            add(new ChickenBurger());
            add(new CheeseBurger());
        }
    };

    private static final List<Addon> Additions = new ArrayList<>() {
        {
            add(new BasicAddon("Ketchup", 10.0));
            add(new BasicAddon("Mayonnaise", 10.0));
            add(new BasicAddon("Tomatoes", 5.0));
            add(new BasicAddon("Cheese", 15.0));
        }
    };



    public static void addMenuItemToDatabase(MenuItem menuItem){
        Menu.add(menuItem);
    }
    public static List<MenuItem> getMenu(){
        return Menu;
    }

    public static void addAddonToDatabase(Addon newAddon){
        Additions.add(newAddon);
    }

    public static List<Addon> getAdditions(){
        return Additions;
    }

    public static double getBasicIngredientPrice(String ingredientName){
        for (BasicIngredient ingredient: Constants){
            if (ingredient.getName().equals(ingredientName)){
                return ingredient.getPrice();
            }
        }
        return 0;
    }

    public static MenuItem getMenuItemByIndex(int index){
        return Menu.get(index);
    }

    public static Addon getAddonByIndex(int index){
        return Additions.get(index);
    }
}
