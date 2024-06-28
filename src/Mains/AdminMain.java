package Mains;

import Additions.BasicAddon;
import Database.Database;
import MenuItems.Burger;

import java.util.Scanner;

public class AdminMain extends GeneralMain{
    public AdminMain(Scanner scanner) {
        super(scanner);
        System.out.println("Welcome to our Restaurant \"BurgerMasr\"\n");
        runAdminMain();
    }

    private void runAdminMain(){
        boolean backToMain = true;
        while (backToMain){
            System.out.println("1. View Menu.\n2. View Additions.\n3. Add New Item to Menu.\n4. Add New Addition.\n5. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1){
                viewMenu();
                System.out.println("\n");
            }
            else if (option == 2){
                viewAdditions();
                System.out.println("\n");
            }
            else if (option == 3){
                addNewItemToMenu();
                System.out.println();
            }
            else if (option == 4){
                addNewAddon();
                System.out.println();
            }
            else{
                backToMain = false;
            }
        }

    }

    private void addNewItemToMenu(){
        System.out.println("New Menu Item:");
        System.out.println("Enter Item Name:");
        String itemName = scanner.nextLine();
        System.out.println("Enter Item Price:");
        double itemPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Confirm: Y/N");
        String option = scanner.nextLine();
        if (option.equals("Y")) {
            Database.addMenuItemToDatabase(new Burger(itemName, itemPrice));
        }
    }

    private void addNewAddon(){
        System.out.println("New Addon:");
        System.out.println("Enter Addon Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Addon Price:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Confirm: Y/N");
        String option = scanner.nextLine();
        if (option.equals("Y")) {
            Database.addAddonToDatabase(new BasicAddon(name, price));
        }
    }
}
