package arraylist;

import java.util.ArrayList;

public class StudentArrayList {

    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>(); //-->ArrayList 선언

        array.add(new Student(1001, "James"));
        array.add(new Student(1002, "Tomas"));
        array.add(new Student(1003, "Edward"));

        for(int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            student.showStudentInfo();
        }

        System.out.println("========향상된 for문 사용=========");
        for(Student student : array) {
            student.showStudentInfo();
        }
    }

}
