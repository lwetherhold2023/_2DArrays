public class Main {
    public static void main(String[] args) {
        // set up Card objects
        Card card = new Card("", "", 0);

        // set up arrays
        String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
        int[] values = {1, 2, 3, 4, 5, 6 ,7, 8, 9, 10, 11, 12, 13};
        String[] valuesString = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        DeckOfCards deck = new DeckOfCards(card);
    }
}