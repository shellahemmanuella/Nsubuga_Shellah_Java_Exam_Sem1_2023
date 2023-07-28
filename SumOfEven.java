package Question1;
public class SumOfEven {
    public static void main(String[] args) {
        int limit = 8;
        int sum = 0;

        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0) { // Check if the number is even
                sum += i; // Add the even number to the sum
            }
        }

        System.out.println("Sum of even numbers less than 8 is: " + sum);
    }
}