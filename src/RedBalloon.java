import java.util.InputMismatchException;
import java.util.Scanner;

public class RedBalloon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRed;
        boolean isBalloon;

        // Prompt for balloon input
        while (true) {
            System.out.print("Is it a balloon? (true/false): ");
            try {
                isBalloon = scanner.nextBoolean();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter true or false.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Prompt for red color input
        while (true) {
            System.out.println("Is it red? (true/false): ");
            try {
                isRed = scanner.nextBoolean();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter true or false.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Output based on input
        if (isBalloon && !isRed) {
            System.out.println("Balloon");
        } else if (isBalloon && isRed) {
            System.out.println("Red balloon");
        } else {
            System.out.println("Not a balloon");
        }
    }
}
