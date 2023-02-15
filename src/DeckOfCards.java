import java.util.*;

public class DeckOfCards {
    // set up variables
    private int count = 0;

    // set up arrays
    private Card[][] deck = new Card[4][13];
    private String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
    private int[] values = {1, 2, 3, 4, 5, 6 ,7, 8, 9, 10, 11, 12, 13};
    private String[] valuesString = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    // DeckOfCards class constructor
    // set up deck
    public DeckOfCards() {
        // load deck with info
        for (int row=0; row < deck.length; row++) {
            for (int col=0; col < deck[row].length; col++) {
                // set up Card objects
                Card card = new Card(suits[row], valuesString[col], values[col]);
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
    }

    // shuffle the class and randomize the order
    public void shuffle() {
        /* src: https://www.digitalocean.com/community/tutorials/shuffle-array-java
        List<Card[]> deckList = Arrays.asList(deck);
        Collections.shuffle(deckList);
        deckList.toArray(deck);
        System.out.println(Arrays.toString(deck));*/

        /* src: https://stackoverflow.com/questions/20190110/2d-int-array-shuffle
        List<Card[]> pair = new ArrayList<Card[]>();
        pair.addAll(Arrays.asList(deck));
        Collections.shuffle(pair);*/

        // src: https://stackoverflow.com/questions/20190110/2d-int-array-shuffle

        Random random = new Random();

        for (int i = deck.length - 1; i > 0; i--) {
            for (int j = deck[i].length - 1; j > 0; j--) {
                int m = random.nextInt(i + 1);
                int n = random.nextInt(j + 1);

                Card temp = deck[i][j];
                deck[i][j] = deck[m][n];
                deck[m][n] = temp;
            }
        }

        // print the deck
        for (int row=0; row < deck.length; row++) {
            for (int col=0; col < deck[row].length; col++) {
                System.out.print(deck[row][col] + "\t");
                System.out.println();
            }
        }

    }

    // deal a card
    public void deal() {

    }

    // report the number of cards left in the deck
    public void count() {

    }
}
