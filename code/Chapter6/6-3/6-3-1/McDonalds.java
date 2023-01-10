public class McDonalds {
    public static void main(String[] args) {
        Food food = new Food("Cheeseburger", 5.45, 302);
        Drink drink = new Drink("Coke", 3.7, "Large");

        System.out.printf(
                "Food: %s ($%.2f) %d Kcal\n",
                food.getName(), food.getPrice(), food.getCalories()
        );
        System.out.printf(
                "Drink: %s ($%.2f) %s\n",
                drink.getName(), drink.getPrice(), drink.getSize()
        );
    }
}
