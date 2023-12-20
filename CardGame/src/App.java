public class App {
    public static void main(String[] args) throws Exception {

        Deck deck = new Deck(30, 2);

        deck.shuffle();
        System.out.println(deck.shuffle());

        
        System.out.println(deck.distribute());
    }
}
