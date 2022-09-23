package ru.mirea.task5.dog;

public class DogTest {
    public static void main(String[] args) {
        Dog toiterier = new Toiterier(30, 40);
        Dog husky = new Husky(100, 50);
        System.out.println(toiterier);
        System.out.println(husky);
    }
}
