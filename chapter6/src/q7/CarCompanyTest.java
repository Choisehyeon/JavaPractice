package q7;

public class CarCompanyTest {

    public static void main(String[] args) {

        CardCompany company = CardCompany.getInstance();
        Card card1 = company.createCard();
        Card card2 = company.createCard();
        System.out.println(card1.getCardNum());
        System.out.println(card2.getCardNum());

    }
 }
