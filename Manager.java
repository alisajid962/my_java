//create a single file name Manager""";
class Product {
    protected String product;
    protected double price;
    protected int quantity;
    Product(String product, double price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }
    void display() {
        System.out.println("Product: " + product + " | Price: " + price + " | Quantity: " + quantity);
    }
}
public class Manager {
    Product[] inventory;
    int itemcount;

    Manager(int capacity) {
        this.inventory = new Product[capacity];
        itemcount = 0;
    }
    void addProduct(Product product) {
        if (itemcount < inventory.length) {
            inventory[itemcount] = product;
            itemcount++;
            System.out.println("=== ITEM SUCCESSFULLY ADDED ===");
        } else {
            System.out.println("=== INVENTORY IS FULL ===");
        }
    }
    void displayProduct() {
        if (itemcount == 0) {
            System.out.println("=== INVENTORY IS EMPTY ===");
        } else {
            for (int i = 0; i < itemcount; i++) {
                inventory[i].display();
            }
        }
    }

    public static void main(String[] args) {
        Manager manager = new Manager(5);
        Product mouse = new Product("Mouse", 550, 200);
        Product keyboard = new Product("Keyboard", 1500, 100);
        Product mobile = new Product("Mobile", 25000, 30);

        manager.addProduct(mouse);
        manager.addProduct(keyboard);
        manager.addProduct(mobile);

        manager.displayProduct();
    }
}


    

