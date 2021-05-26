package staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이지원");
        System.out.println(studentLee.serialNum);
        studentLee.serialNum++;

        Student studentKim = new Student();
        studentKim.setStudentName("김수경");
        System.out.println(studentKim.serialNum);
        System.out.println(studentLee.serialNum);
    }
}
