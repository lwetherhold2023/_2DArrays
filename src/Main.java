import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // set up Scanner
        Scanner scan = new Scanner(System.in);

        // set up variables
        String actionInput;

        // set up arrays
        DeckOfCards deck = new DeckOfCards();

        // give info
        System.out.println("In this program, you will have a full deck of 52 cards. Enter \"stop\" at any time to quit.");
        Thread.sleep(2000);
        System.out.println("\nHere is your deck of cards:");
        Thread.sleep(1000);
        deck.print(250);

        while(true) {
            // ask for input of action
            System.out.println("\nWould you like to print \"p\", shuffle \"s\", deal \"d\", or count \"c\" the deck of cards?");
            actionInput = scan.next();

            switch(actionInput) {
                case "p":
                    deck.print(100);
                    break;
                case "s":
                    deck.shuffle();
                    deck.print(100);
                    break;
                case "d":
                    System.out.println("\nNote: Dealing cards will only deal the deck as-is. Please remember to shuffle before dealing.");
                    Thread.sleep(2000);
                    System.out.println("\nPlayer A: ");
                    Thread.sleep(500);
                    deck.deal();
                    System.out.println("\nPlayer B: ");
                    Thread.sleep(500);
                    deck.deal();
                    System.out.println("\nPlayer C: ");
                    Thread.sleep(500);
                    deck.deal();
                    System.out.println("\nPlayer D: ");
                    Thread.sleep(500);
                    deck.deal();
                    System.out.println("\nHere is your deck of cards: ");
                    Thread.sleep(1000);
                    deck.printList(250);
                    break;
                case "c":
                    deck.count();
                    break;
                case "stop":
                    System.exit(0);
                    break;
                default:
                    // ask for input of action
                    System.out.println("\nWould you like to print \"p\", shuffle \"s\", deal \"d\", or count \"c\" the deck of cards?");
                    actionInput = scan.next();
            }
        }
    }
}