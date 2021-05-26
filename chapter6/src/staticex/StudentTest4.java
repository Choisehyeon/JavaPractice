package staticex;

public class StudentTest4 {

    public static void main(String[] args) {

        Student3 studentLee = new Student3("이수경", 2017104033);

        System.out.println(studentLee + "의 카드 번호는 " + Student3.getCardNum());

        Student3 studentKim = new Student3("김범수", 2017104000);

        System.out.println(studentKim + "의 카드 번호는 " + Student3.getCardNum());
    }
}
