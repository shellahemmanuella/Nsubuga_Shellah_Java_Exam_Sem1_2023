package Question1;
import java.util.Scanner;//import the necessary library

public class AverageCalculator {
    public static void main(String[] args) {
        int totalNumbers = 5;
        double sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter " + totalNumbers + " numbers:");

        for (int i = 0; i < totalNumbers; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            double number = scanner.nextDouble();
            sum += number;
        }

        scanner.close();

        double average = sum / totalNumbers;

        System.out.println("The average of the " + totalNumbers + " numbers is: " + average);
    }
}
