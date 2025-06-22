// Exercise 1: Inventory Management System
import java.util.*;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
}

class Inventory {
    HashMap<Integer, Product> products = new HashMap<>();

    void addProduct(Product p) {
        products.put(p.productId, p);
    }

    void updateProduct(int productId, Integer quantity, Double price) {
        Product p = products.get(productId);
        if (p != null) {
            if (quantity != null) p.quantity = quantity;
            if (price != null) p.price = price;
        }
    }

    void deleteProduct(int productId) {
        products.remove(productId);
    }
}
