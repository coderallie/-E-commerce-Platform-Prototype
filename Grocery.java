public class Grocery extends Product {

    private boolean perishable;

    public Grocery(int id, String name, double price, boolean perishable) {
        super(id, name, price);
        this.perishable = perishable;
    }

    @Override
    public String getCategory() {
        return "Grocery";
    }
}
