public abstract class Product {

    // Basic product info shared by all products
    protected int id;
    protected String name;
    protected double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Each product type will return its own category
    public abstract String getCategory();

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}
