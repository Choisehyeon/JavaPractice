package q5;

public class Person {

    String personName;
    int money;

    public Person(String personName, int money){
        this.personName = personName;
        this.money = money;
    }

    public void buyCong(CongCoffee cong) {
        cong.buy(4500);
        money -= 4500;
    }

    public void buyStar(StarCoffee star) {
        star.buy(4000);
        money -= 4000;
    }

    public void showInfo() {
        System.out.println(personName + "님의 남은 돈은 " + money + "입니다.");
    }
}
