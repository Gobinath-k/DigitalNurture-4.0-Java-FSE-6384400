
public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Mouse", 20, 299.99);
        Product p2 = new Product(102, "Keyboard", 15, 499.49);

        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.displayInventory();

        manager.updateProduct(101, "Wireless Mouse", 25, 349.99);
        manager.deleteProduct(102);

        System.out.println("Updated Inventory:");
        manager.displayInventory();
    }
}
