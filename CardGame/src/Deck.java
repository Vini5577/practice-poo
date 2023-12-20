import java.util.Random;

public class Deck extends Card {

    Player player = new Player();

    public Deck(int amount, int amountPlayer) {
        setAmount(amount);
        player.setAmoutPlayer(amountPlayer);
    }

    public int shuffle() {
        Random rand = new Random();

        return rand.nextInt(getAmount());
    }

    public String distribute() {
        int amountCards = getAmount() / (player.getAmoutPlayer() + 1);
        System.out.println(player.getAmoutPlayer() + 1);
        System.out.println(getAmount());
        return "Cada jogador começa com " + amountCards + " cartas";
    }

}
