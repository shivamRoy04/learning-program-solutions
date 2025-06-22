// DB integration using SQLite for Exercise 2
import java.sql.*;
import java.util.*;

public class Exercise2SearchDB {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:products.db")) {
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS products (id INTEGER, name TEXT, category TEXT)");
            stmt.execute("INSERT INTO products VALUES (1, 'Mouse', 'Electronics'), (2, 'Keyboard', 'Electronics'), (3, 'Monitor', 'Electronics')");

            Scanner sc = new Scanner(System.in);
            System.out.print("Search product: ");
            String name = sc.nextLine();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM products WHERE name = ?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Found: " + rs.getString("name"));
            } else {
                System.out.println("Not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
