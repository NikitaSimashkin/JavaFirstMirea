package ru.mirea.task6;

public class Main {

    public static void main(String[] args) {
        Lamborgini lamba = new Lamborgini();
        Earth earth = new Earth();

        System.out.println(lamba.getName());
        System.out.println(lamba.getPrice());

        System.out.println(earth.getName());
        System.out.println(earth.getPrice());
    }
}
