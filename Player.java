import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private double balance;
    private List<Card> hand;

    public Player(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public List<Card> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getBestHand(List<Card> communityCards) {
        // Logic to determine the best hand
        // Placeholder: Just return the first card in the hand for now
        return hand.get(0).toString();
    }

    @Override
    public String toString() {
        return name + ": $" + String.format("%.2f", balance) + " - " + hand.get(0) + " " + hand.get(1);
    }
}