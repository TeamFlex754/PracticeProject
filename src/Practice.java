import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1;
        System.out.println("Enter a number: ");
        num1 = scanner.nextInt();

        if (num1 < 20) {
            System.out.println("The number is less than 20");

        }
        else if (num1 > 30) {
            System.out.println("The number is more than 30");
        }
        else {
            System.out.println("The number is between 20 and 30");
        }
    }
}