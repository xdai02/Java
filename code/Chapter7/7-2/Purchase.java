public class Purchase {
    public static void main(String[] args) {
        Product product = new Product("Cheeseburger", 50);

        try {
            for (int i = 0; i < 60; i++) {
                product.purchase();
            }
        } catch (OutOfStockException e) {
            e.printStackTrace();
        }
    }
}
