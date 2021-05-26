package singletonex;

public class Car {

    private static int serialNum = 10000;
    private int CarNum;

    public Car() {
        serialNum++;
        CarNum = serialNum;
    }

    public void setCarNum(int carNum) {
        CarNum = carNum;
    }

    public int getCarNum() {
        return CarNum;
    }


}
