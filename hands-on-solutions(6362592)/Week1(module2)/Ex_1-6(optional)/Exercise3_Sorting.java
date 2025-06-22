// Exercise 3: Sorting Customer Orders
import java.util.*;

class Order {
    int orderId;
    String customerName;
    double totalPrice;

    Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }
}

class Exercise3_Sorting {
    static void bubbleSort(List<Order> orders) {
        int n = orders.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (orders.get(j).totalPrice > orders.get(j+1).totalPrice) {
                    Collections.swap(orders, j, j+1);
                }
            }
        }
    }

    static List<Order> quickSort(List<Order> orders) {
        if (orders.size() <= 1) return orders;
        Order pivot = orders.get(0);
        List<Order> less = new ArrayList<>();
        List<Order> greater = new ArrayList<>();
        for (int i = 1; i < orders.size(); i++) {
            if (orders.get(i).totalPrice <= pivot.totalPrice)
                less.add(orders.get(i));
            else
                greater.add(orders.get(i));
        }
        List<Order> sorted = new ArrayList<>();
        sorted.addAll(quickSort(less));
        sorted.add(pivot);
        sorted.addAll(quickSort(greater));
        return sorted;
    }
}
