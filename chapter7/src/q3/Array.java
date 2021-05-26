package q3;

public class Array {

    public static void main(String[] args) {

        int[] arr = new int[5];


        for(int i = 1; i <= 10; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i % 2 == 0) {
                    arr[j] = i;
                    break;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
