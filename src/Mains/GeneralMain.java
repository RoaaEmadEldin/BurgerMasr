package Mains;

import Additions.Addon;
import Database.Database;
import MenuItems.MenuItem;

import java.util.List;
import java.util.Scanner;

public abstract class GeneralMain {

    protected Scanner scanner;

    public GeneralMain(Scanner scanner) {
        this.scanner = scanner;
    }

    public void viewMenu(){
        System.out.println("Menu:");
        List<MenuItem> menu = Database.getMenu();
        int counter = 1;
        for (MenuItem item: menu){
            System.out.println(counter + ". " + item.getName());
            counter++;
        }
    }

    public void viewAdditions(){
        System.out.println("Additions:");
        List<Addon> additions = Database.getAdditions();
        int counter = 1;
        for (Addon addon: additions){
            System.out.println(counter + ". " + addon.getName());
            counter++;
        }
    }
}
