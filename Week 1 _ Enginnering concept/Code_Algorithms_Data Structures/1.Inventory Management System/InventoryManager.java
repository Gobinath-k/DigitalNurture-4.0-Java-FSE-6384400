import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

 
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

   
    public void updateProduct(int productId, String name, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.setProductName(name);
            p.setQuantity(quantity);
            p.setPrice(price);
        } else {
            System.out.println("Product ID not found.");
        }
    }


    public void deleteProduct(int productId) {
       Product removedProduct = inventory.remove(productId);
         if (removedProduct == null) {
            System.out.println("Product ID not found.");
        } 
        else {
            System.out.println("Deleted: " + removedProduct.getProductName());
        }

    }

    public void displayInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
