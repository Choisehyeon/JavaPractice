package q5;

public class BuyCoffee {

    public static void main(String[] args) {

        Person personKim = new Person("Kim", 20000);
        Person personLee = new Person("Lee", 30000);

        StarCoffee starAme = new StarCoffee("Americano");
        personKim.buyStar(starAme);
        personKim.showInfo();
        starAme.showInfo();

        CongCoffee congLatte = new CongCoffee("Latte");
        personLee.buyCong(congLatte);
        personLee.showInfo();
        congLatte.showInfo();

    }
}
