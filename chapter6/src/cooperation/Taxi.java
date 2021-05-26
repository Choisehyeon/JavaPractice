package cooperation;

public class Taxi {

    public String taxiNum;
    public int passengerCount;
    public int money;

    public Taxi(String taxiNum) {
        this.taxiNum = taxiNum;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("택시 " + taxiNum + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
    }

}
