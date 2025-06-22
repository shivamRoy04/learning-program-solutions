
import java.util.*;

public class Exercise2Search {
    public static Product binarySearch(List<Product> products, String name) {
        int low = 0, high = products.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            Product midProduct = products.get(mid);
            int cmp = midProduct.productName.compareTo(name);
            if (cmp == 0) return midProduct;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
}
