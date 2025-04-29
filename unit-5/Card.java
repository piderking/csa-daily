public class Card {
    private String suit;
    private String card;

    public Card(String args){

        args = args.toLowerCase();
        // Get Position of Suit (1 letter)
        if (args.contains("s")) suit = "Spades";
        else if (args.contains("d")) suit = "Diamonds";
        else if (args.contains("c")) suit = "Clubs";
        else if (args.contains("h")) suit = "Hearts";


        if (args.contains("a")) card = "Ace";
        else if (args.contains("2")) card = "Two";
        else if (args.contains("3")) card = "Three";
        else if (args.contains("4")) card = "Four";
        else if (args.contains("5")) card = "Five";
        else if (args.contains("6")) card = "Six";
        else if (args.contains("7")) card = "Seven";
        else if (args.contains("8")) card = "Eight";
        else if (args.contains("9")) card = "Nine";
        else if (args.contains("10")) card = "Ten";
        else if (args.contains("j")) card = "Jack";
        else if (args.contains("q")) card = "Queen";
        else if (args.contains("k")) card = "King";
      
    }

    public String getDescription(){
        if (suit == null || card == null){
            return "Unknown";
        }
        return card + " of " + suit;
    }


    /* */
    private boolean first(String str, char suit){
        return !str.substring(str.length()-1).toLowerCase().equals(Character.toLowerCase(suit));
    }


}