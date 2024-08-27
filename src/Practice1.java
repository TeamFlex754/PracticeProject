import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // double is used to save income, possibly with a decimal amount.
        double weeklyIncome;

        // prompt the user to enter their income to identify their weekly average tax withholding.
        System.out.println("Enter your income: ");
        weeklyIncome = scanner.nextDouble();

        if (weeklyIncome < 500) {
            System.out.println("Your tax rate is 10%");
        }
        else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
            System.out.println("Your tax rate is 15%");
        }
        else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
            System.out.println("Your tax rate is 20%");
        }
        else {
            System.out.println("Your tax rate is 30%");
        }
    }
}
