package Order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items;
    private double totalPrice;

    public Order(OrderItem item) {
        items = new ArrayList<>();
        if (item != null){
            items.add(item);
            this.totalPrice = item.getTotalPrice();
        }


    }

    public List<OrderItem> getOrderItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void addItem(OrderItem item){
        items.add(item);
        totalPrice += item.getTotalPrice();
    }
    public void printReceipt(){
        System.out.println("Receipt:");
        for (OrderItem item: items){
            System.out.println(item.getQuantity() + " " + item.printInformation());
        }
        System.out.println("\nTotal  " + totalPrice);
    }

    public void printOrderDetails(){
        System.out.println("Your Order:");
        for (OrderItem item: items){
            System.out.println(item.getMenuItem().getName());
            for (int i = 0; i < item.additions.size(); i++){
                System.out.print(item.additions.get(i).getName());
                if (i != item.additions.size() - 1){
                    System.out.print(" + ");
                }
            }
            System.out.println('\n');
        }
        System.out.println('\n');
    }
}
