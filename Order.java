import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Order {

    // This list acts as the shopping cart
    private List<Product> cart = new ArrayList<>();

    public void addToCart(Product product) {
        cart.add(product);
    }

    // Calculates subtotal using a stream
    public double getSubtotal() {
        return cart.stream()
                .mapToDouble(p -> p.getPrice())
                .sum();
    }

    // Applies tax using a lambda
    public double getTotalWithTax(double taxRate) {
        Function<Double, Double> taxFunc =
                total -> total + (total * taxRate);

        return taxFunc.apply(getSubtotal());
    }

    // Simple shipping rule using lambda
    public double getShippingCost() {
        Function<Integer, Double> shippingFunc =
                count -> count >= 4 ? 0.0 : 7.99;

        return shippingFunc.apply(cart.size());
    }

    public double getFinalTotal(double taxRate) {
        return getTotalWithTax(taxRate) + getShippingCost();
    }

    public List<Product> getCart() {
        return cart;
    }
}
