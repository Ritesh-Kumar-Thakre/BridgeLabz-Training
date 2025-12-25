import java.util.*;
public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        int numOfCards = suits.length * ranks.length;
        String[] deck = initializeDeck(suits, ranks, numOfCards);
        System.out.println("Shuffling Deck...\n");
        shuffleDeck(deck);
        System.out.println("Enter number of players:");
        int players = sc.nextInt();
        System.out.println("Enter number of cards to distribute:");
        int cardsToDistribute = sc.nextInt();
        String[][] distributedCards =distributeCards(deck, players, cardsToDistribute);
        if(distributedCards != null){
            printPlayerCards(distributedCards);
        }
        sc.close();
    }

    // Method for initialize deck
    public static String[] initializeDeck(String[] suits,String[] ranks,int numOfCards){
        String[] deck = new String[numOfCards];
        int index = 0;
        for(String suit : suits){
            for(String rank : ranks){
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle deck using random swap
    public static void shuffleDeck(String[] deck){
        int n = deck.length;
        for(int i = 0; i < n; i++){
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to Distribute n cards to x players
    public static String[][] distributeCards(String[] deck,int players,int cards){
        if(players * cards > deck.length){
            System.out.println("Not enough cards to distribute!");
            return null;
        }
        String[][] playerCards = new String[players][cards];
        int index = 0;
        for(int i = 0; i < players; i++){
            for(int j = 0; j < cards; j++){
                playerCards[i][j] = deck[index++];
            }
        }
        return playerCards;
    }

    // Method to Print player cards
    public static void printPlayerCards(String[][] players){
        System.out.println("\nDistributed Cards:\n");
        for(int i = 0; i < players.length; i++){
            System.out.println("Player " + (i + 1) + ":");
            for(int j = 0; j < players[i].length; j++){
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }
}
