import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int n = 0;
        int sum = 0;

        // Calculate the number of digits (n)
        while (originalNumber > 0) {
            originalNumber /= 10;
            n++;
        }

        originalNumber = number;

        // Calculate the sum of digits, each raised to the power of n
        while (originalNumber > 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, n);
            originalNumber /= 10;
        }

        return sum == number;
    }
}
