package array;

public class StudentArray {
    public static void main(String[] args) {
        Student[] array = new Student[3];

        array[0] = new Student(1001, "James");
        array[1] = new Student(1002, "Tomas");
        array[2] = new Student(1003, "Edward");

        for(int i = 0; i < array.length; i++){
            array[i].showStudentInfo();
        }
    }
}
