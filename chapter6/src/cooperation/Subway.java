package cooperation;

public class Subway {

    public String lineNum;
    public int passengerCount;
    public int money;

    public Subway(String lineNum) {
        this.lineNum = lineNum;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("지하철 " + lineNum + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
    }
}
