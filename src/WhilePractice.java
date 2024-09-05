import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean playingGame = true;

        while (playingGame) {
            System.out.println("Do you want to keep playing? (yes/no)");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("yes")) {
                playingGame = true;
            } else {
                playingGame = false;
            }
        }
        System.out.println("Game ended.");

    }
}
