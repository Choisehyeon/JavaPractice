package cooperation;

public class Bus {

    public int busNum;
    public int passengerCount;
    public int money;

    public Bus(int busNum) {
        this.busNum = busNum;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("버스 " + busNum + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
    }
}
