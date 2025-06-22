// CLI Interface for Exercise 2
import java.util.*;

public class Exercise2SearchCLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Mouse", "Electronics"));
        products.add(new Product(2, "Keyboard", "Electronics"));
        products.add(new Product(3, "Monitor", "Electronics"));
        products.sort(Comparator.comparing(p -> p.productName));

        System.out.print("Enter product name to search: ");
        String name = sc.nextLine();
        Product found = Exercise2Search.binarySearch(products, name);
        if (found != null) System.out.println("Found: " + found.productName);
        else System.out.println("Not Found");
    }
}
