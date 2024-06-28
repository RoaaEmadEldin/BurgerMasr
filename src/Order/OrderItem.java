package Order;

import Additions.Addon;
import MenuItems.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private MenuItem item;
    private int quantity;
    private double totalPrice;

    protected List<Addon> additions;


    public OrderItem(MenuItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        this.totalPrice = item.getPrice() * quantity;
        additions = new ArrayList<>();
    }

    public MenuItem getMenuItem() {
        return item;
    }

    public List<Addon> getAdditions() {
        return additions;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void addAddition(Addon addon){
        additions.add(addon);
        totalPrice += addon.getPrice();
    }

    public String printInformation() {
        StringBuilder itemInfo = new StringBuilder();
        itemInfo.append(item.getName());
        itemInfo.append("  ");
        itemInfo.append(item.getPrice());
        for (Addon addon: additions){
            itemInfo.append("\n1 Extra");
            itemInfo.append(addon.getName());
            itemInfo.append("  ");
            itemInfo.append(addon.getPrice());
        }
        return itemInfo.toString();
    }
}
