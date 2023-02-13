public class DeckOfCards {
    // set up variables
    private int count = 0;

    // set up arrays
    private Card[][] deck = new Card[4][13];

    // DeckOfCards class constructor
    // set up deck
    public DeckOfCards(Card card) {
        // load deck with info
        for (int row=0; row < deck.length; row++) {
            for (int col=0; col < deck[row].length; col++) {
                deck[row][col] = card;
                count++;
            }
        }

        // print the deck
        for (int row=0; row < deck.length; row++) {
            for (int col=0; col < deck[row].length; col++) {
                System.out.print(deck[row][col] + "\t");
                System.out.println();
            }
        }

        System.out.println("Card Count: " + count);
    }

    // shuffle the class and randomize the order
    public void shuffle(Card card) {

    }

    // deal a card
    public void deal() {

    }

    // report the number of cards left in the deck
    public void count() {

    }
}
