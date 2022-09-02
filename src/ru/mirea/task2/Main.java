package ru.mirea.task2;

import java.util.Arrays;

public class Main { // 5 задание; Main у меня класс-тестер дл Shape и Dog

    public static void main(String[] args) {
        System.out.println(new Square(10));
        outputDogs(getDogs());
    }

    public static Dog[] getDogs(){
        Dog[] result = new Dog[4];
        result[0] = new Dog("Sharik", 1);
        result[1] = new Dog("Barsik", 5);
        result[2] = new Dog("Jack", 6);
        result[3] = new Dog("Nikita", 10);
        return result;
    }

    public static void outputDogs(Dog[] dogs){
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
