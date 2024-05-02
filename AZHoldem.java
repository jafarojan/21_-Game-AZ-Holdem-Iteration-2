import java.util.Scanner;

// Jafar Ojan
public class AZHoldem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            // Prompt for number of players
            System.out.print("How many players? ");
            int numPlayers = scanner.nextInt();

            // Create game with given number of players
            Game game = new Game(numPlayers);

            // Start the game
            game.start();

            // Prompt to play another game
            System.out.print("Play another game? (y/n) ");
        } while (scanner.next().equalsIgnoreCase("y"));

        scanner.close();
    }
}
