package staticex;

public class StudentTest3 {

    public static void main(String[] args) {
        System.out.println(Student2.getSerialNum());
        Student2 studentLee = new Student2();
        studentLee.setStudentName("이지원");
        System.out.println(Student2.getSerialNum());
        System.out.println(studentLee.studentName + " 학번:" + studentLee.studentID);

        Student2 studentKim = new Student2();
        studentKim.setStudentName("김수경");
        System.out.println(Student2.getSerialNum());
        System.out.println(studentKim.studentName + " 학번:" + studentKim.studentID);
    }
}
