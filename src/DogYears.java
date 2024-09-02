import java.util.Scanner;

public class DogYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogAgeYears;

        System.out.println("Enter dog's age (in years): ");
        dogAgeYears = scanner.nextInt();

        switch (dogAgeYears) {
            case 3:
                System.out.println("That's 21 human years.");
                break;
            case 5:
                System.out.println("That's 35 human years");
                break;
            default:
                System.out.println("Human years unknown.");
                break;
        }
    }
}
