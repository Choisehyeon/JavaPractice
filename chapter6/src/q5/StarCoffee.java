package q5;

public class StarCoffee {

    String menuName;
    int money;
    int passengerCount;

    public StarCoffee(String menuName) {
        this.menuName = menuName;
    }

    public void buy(int money) {
        this.money = money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("별다방에 출입한 사람은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
    }
}
