public class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void purchase() throws OutOfStockException {
        if (stock <= 0) {
            throw new OutOfStockException(name + " is out of stock.");
        }
        stock--;
    }
}
