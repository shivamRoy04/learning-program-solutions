// Exercise 6: Library Management System
import java.util.*;

class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}

class Exercise6_Library {
    static Book linearSearch(List<Book> books, String title) {
        for (Book b : books) {
            if (b.title.equals(title)) return b;
        }
        return null;
    }

    static Book binarySearch(List<Book> books, String title) {
        int low = 0, high = books.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books.get(mid).title.compareTo(title);
            if (cmp == 0) return books.get(mid);
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
}
