// GUI Interface for Exercise 2
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Exercise2SearchGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Product Search");
        JTextField searchField = new JTextField(15);
        JButton searchBtn = new JButton("Search");
        JLabel resultLabel = new JLabel("");

        List<Product> products = Arrays.asList(
            new Product(1, "Mouse", "Electronics"),
            new Product(2, "Keyboard", "Electronics"),
            new Product(3, "Monitor", "Electronics")
        );
        products.sort(Comparator.comparing(p -> p.productName));

        searchBtn.addActionListener(e -> {
            String name = searchField.getText();
            Product result = Exercise2Search.binarySearch(products, name);
            if (result != null) resultLabel.setText("Found: " + result.productName);
            else resultLabel.setText("Not Found");
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Product:"));
        panel.add(searchField);
        panel.add(searchBtn);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
