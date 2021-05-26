package staticex;

public class Student3 {

    private static int cardNum;
    int studentID;
    String studentName;

    public Student3(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        cardNum = studentID + 100;
    }

    public static void setCardNum(int cardNum) {
        Student3.cardNum = cardNum;
    }

    public static int getCardNum() {
        return cardNum;
    }
}
