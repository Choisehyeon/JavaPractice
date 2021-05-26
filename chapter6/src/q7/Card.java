package q7;

public class Card {

    private static int serialNum = 12304859;
    private int cardNum;


    public Card() {
        serialNum++;
        cardNum = serialNum;
    }

    public int getCardNum() {
        return cardNum;
    }
}
