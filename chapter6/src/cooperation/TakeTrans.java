package cooperation;

public class TakeTrans {

    public static void main(String[] args) {

        Student james = new Student("James", 5000);
        Student tomas = new Student("Tomas", 10000);
        Student edward = new Student("Edward", 30000);

        Bus bus100 = new Bus(100);
        james.takeBus(bus100);
        james.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway("2호선");
        tomas.takeSubway(subwayGreen);
        tomas.showInfo();
        subwayGreen.showInfo();

        Taxi taxiKakao = new Taxi("13하 1234");
        edward.takeTaxi(taxiKakao);
        edward.showInfo();
        taxiKakao.showInfo();

    }
}
