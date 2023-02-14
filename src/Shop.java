import java.util.*;

public class Shop {
    private int stock;
    private int revenue;
    private Random rand;

    public Shop() {
        this.stock = 0;
        this.revenue = 0;
        this.rand = new Random();
    }

    public void buy(int amount) {
        this.stock += amount;
    }

    public void sell() {
        if (this.stock > 0) {
            int sales = this.rand.nextInt(this.stock) + 1;
            this.stock -= sales;
            this.revenue += sales;
            System.out.println("Successful sale of " + sales + " items. Current stock: " + this.stock + ", Current revenue: " + this.revenue);
        } else {
            System.out.println("No items in stock. Unable to sell.");
        }
    }
}
