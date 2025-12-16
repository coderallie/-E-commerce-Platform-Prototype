import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creating some products
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(1, "Laptop", 1100.00, 24));
        products.add(new Clothing(2, "T-Shirt", 25.99, "M"));
        products.add(new Grocery(3, "Bread", 3.49, true));
        products.add(new Electronics(4, "Mouse", 29.99, 12));

        // Creating a customer
        Customer customer = new Customer(1001, "Alex");

        // Creating an order
        Order order = new Order();

        // Filter electronics and add them to cart
        products.stream()
                .filter(p -> p.getCategory().equals("Electronics"))
                .forEach(order::addToCart);

        // Search for a product by name
        System.out.println("Search results:");
        products.stream()
                .filter(p -> p.getName().toLowerCase().contains("lap"))
                .forEach(System.out::println);

        // Sort products by price
        System.out.println("\nProducts sorted by price:");
        products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .forEach(System.out::println);

        // Print totals
        System.out.println("\nSubtotal: $" + order.getSubtotal());
        System.out.println("Final total: $" + order.getFinalTotal(0.08));
    }
}
