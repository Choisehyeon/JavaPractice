package q5;

import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {

        ArrayList<Dog> dogList = new ArrayList<Dog>();

        dogList.add(new Dog("뽀미", "말티즈"));
        dogList.add(new Dog("보리", "요크셔테리어"));
        dogList.add(new Dog("해피", "닥스훈트"));

        for(int i = 0; i < dogList.size(); i++) {
            Dog dog  = dogList.get(i);
            System.out.println(dog.showDogInfo());
        }

        System.out.println("=========향상된 for문========");

        for(Dog dog: dogList) {
            System.out.println(dog.showDogInfo());
        }

    }
}
