package Question1;
import java.util.ArrayList;

public class AnimalArrayList {
    public static void main(String[] args) {
        // Create an ArrayList to store animals (strings)
        ArrayList<String> animalsList = new ArrayList<>();

        // Add some animals to the ArrayList
        animalsList.add("cow");
        animalsList.add("Goat");
        animalsList.add("Buffalo");
        animalsList.add("Tiger");
        animalsList.add("Lion");

        // Print out the collection
        System.out.println("Animals in the ArrayList:");
        for (String animal : animalsList) {
            System.out.println(animal);
        }
    }
}
