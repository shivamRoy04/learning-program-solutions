// JUnit Test
import org.junit.jupiter.api.*;
import java.util.*;

public class Exercise2SearchTest {
    List<Product> products;

    @BeforeEach
    void setUp() {
        products = Arrays.asList(
            new Product(1, "Mouse", "Electronics"),
            new Product(2, "Keyboard", "Electronics"),
            new Product(3, "Monitor", "Electronics")
        );
        products.sort(Comparator.comparing(p -> p.productName));
    }

    @Test
    void testProductFound() {
        Product result = Exercise2Search.binarySearch(products, "Mouse");
        Assertions.assertNotNull(result);
        Assertions.assertEquals("Mouse", result.productName);
    }

    @Test
    void testProductNotFound() {
        Product result = Exercise2Search.binarySearch(products, "Laptop");
        Assertions.assertNull(result);
    }
}
