package q6;

public class Card {

    private static int serialNum = 12304859;
    public int cardNum;

    public Card() {
        serialNum++;
        cardNum = serialNum;

    }

}
