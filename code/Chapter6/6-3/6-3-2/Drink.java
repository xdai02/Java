public class Drink extends Product {
    private String size;

    public Drink(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drink: " + super.toString() + " " + size;
    }
}
