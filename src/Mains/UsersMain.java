package Mains;

import Database.Database;
import MenuItems.MenuItem;
import Order.Order;
import Order.OrderItem;

import java.util.Scanner;

public class UsersMain extends GeneralMain {
    public UsersMain(Scanner scanner) {
        super(scanner);
        System.out.println("Welcome to our Restaurant \"BurgerMasr\"\n");
        runUserMain();
    }

    private boolean isOrderConfirmed(Order order, OrderItem burger){
        order.addItem(burger);
        order.printOrderDetails();
        System.out.println("1. Confirm \n2. Back to Menu");
        int option = scanner.nextInt();
        scanner.nextLine();
        if (option == 1){
            order.printReceipt();
            System.out.println("1. Back to Menu \n2. Exit");
            option = scanner.nextInt();
            scanner.nextLine();
            return option == 1;
        }
        else return false;
    }


    private void runUserMain(){
        boolean backToMenu = true;
        Order order = new Order(null);
        while (backToMenu){
            viewMenu();
            System.out.println("Please select option:");
            int option = scanner.nextInt();
            scanner.nextLine();
            MenuItem menuItem = Database.getMenuItemByIndex(option - 1);
            OrderItem burger = new OrderItem(menuItem, 1);
            System.out.println("Do you like to add any additions?\n  1.Yes\n  2.No");
            option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1){
                viewAdditions();
                System.out.println("Please select options, enter -1 if you have finished:");
                option = scanner.nextInt();
                scanner.nextLine();
                while (option != -1 && option < Database.getAdditions().size() + 1){
                    burger.addAddition(Database.getAddonByIndex(option - 1));
                    option = scanner.nextInt();
                    scanner.nextLine();
                }
            }
            backToMenu = isOrderConfirmed(order, burger);


        }
    }
}
