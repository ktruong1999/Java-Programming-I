
public class HW3_3PickACard {
    public static void main(String[] args) {
        double card = Math.random() * 52;

        int r = (int) card % 13;
        int s = (int) card / 13;

        String rank = "";
        String suit = "";

        switch (s) {
            case (0):
                suit = "Clubs";
                break;
            case (1):
                suit = "Diamonds";
                break;
            case (2):
                suit = "Hearts";
                break;
            case (3):
                suit = "Spades";
                break;
            case (4):
                suit = "???";
                break;
        }

        switch (r) {
            case (1):
                rank = "Ace";
                break;
            case (2):
                rank = "2";
                break;
            case (3):
                rank = "3";
                break;
            case (4):
                rank = "4";
                break;
            case (5):
                rank = "5";
                break;
            case (6):
                rank = "6";
                break;
            case (7):
                rank = "7";
                break;
            case (8):
                rank = "8";
                break;
            case (9):
                rank = "9";
                break;
            case (10):
                rank = "10";
                break;
            case (11):
                rank = "Jack";
                break;
            case (12):
                rank = "Queen";
                break;
            case (13):
                rank = "King";
                break;
        }

        System.out.println("Your card is the " + rank + " of " + suit);

    }
}

/*
 * OUTPUT
 * 
 * Your card is the 3 of Hearts
 * 
 * Your card is the 4 of Clubs
 */