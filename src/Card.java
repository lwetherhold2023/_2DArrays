public class Card {
    // set up variables
    private String suit = "";
    private String valueString = "";
    private int value = 0;

    // Card class constructor - default
    public Card() {
        this.suit = "";
        this.valueString = "";
        this.value = 0;
    }

    // Card class constructor - alternate
    // set up Card
    public Card(String suit, String valueString, int value) {
        this.suit = suit;
        this.valueString = valueString;
        this.value = value;
    }

    // set suit
    public void setSuit(String suit) {
        this.suit = suit;
    }

    // get suit
    public String getSuit() {
        return this.suit;
    }

    // set value
    public void setValue(int value) {
        this.value = value;
    }

    // get value
    public int getValue() {
        return this.value;
    }

    // set value string
    public void setValueString(String valueString) {
        this.valueString = valueString;
    }

    // get value string
    public String getValueString() {
        return this.valueString;
    }

    // output toString method
    public String toString() {
        return "Card: " + getSuit() + " (" + getValueString() + ") of " + getValue();
    }
}
