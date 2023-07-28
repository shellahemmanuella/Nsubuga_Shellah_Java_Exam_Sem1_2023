package Question2;
import java.util.HashMap;//importing the necessary libraries
import java.util.Map;

public class Restaurant {
    private Map<String, Double> menu;
    private Map<String, Double> ratings;

    public Restaurant() {
        this.menu = new HashMap<>();
        this.ratings = new HashMap<>();
    }

    public void addItem(String itemName, double price, double rating) {
        menu.put(itemName, price);
        ratings.put(itemName, rating);
    }

    public void removeItem(String itemName) {
        menu.remove(itemName);
        ratings.remove(itemName);
    }

    public double calculateAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }

        double totalRating = 0.0;
        for (double rating : ratings.values()) {
            totalRating += rating;
        }

        return totalRating / ratings.size();
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // Add some items to the menu
        restaurant.addItem("Burgers Big", 8.99, 4.5);
        restaurant.addItem("Pizza Small", 10.99, 4.2);
        restaurant.addItem("Salads", 6.99, 3.8);
        restaurant.addItem("Icecream", 9.0, 5.5);

        // Calculate the average rating
        double averageRating = restaurant.calculateAverageRating();
        System.out.println("Average Rating: " + averageRating);

        // Remove an item from the menu
        restaurant.removeItem("Pizza Small");

        // Calculate the updated average rating
        averageRating = restaurant.calculateAverageRating();
        System.out.println("Updated Average Rating: " + averageRating);
    }
}