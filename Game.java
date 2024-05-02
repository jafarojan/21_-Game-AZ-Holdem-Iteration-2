public class Game {
    private Deck deck;
    private int numberOfPlayers;

    public Game(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        deck = new Deck();
    }

    public void start() {
        System.out.println("The game has started with " + numberOfPlayers + " players!");
        // Add more game logic here
    }
}