package q4;

public class DogTest {
    public static void main(String[] arg) {
        Dog[] dogArr1 = new Dog[5];

        dogArr1[0] = new Dog("뽀미", "말티즈");
        dogArr1[1] = new Dog("해피", "요크셔테리어");
        dogArr1[2] = new Dog("보리", "웰시코기");
        dogArr1[3] = new Dog("케넨", "닥스훈트");
        dogArr1[4] = new Dog("아펠", "슈나우저");

        for(int i = 0; i < dogArr1.length; i++) {
            System.out.println(dogArr1[i].showDogInfo());
        }

        System.out.println("=========향상된 for문=========");

        for( Dog dog : dogArr1) {
            System.out.println(dog.showDogInfo());
        }
    }

}
