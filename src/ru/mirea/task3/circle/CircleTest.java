package ru.mirea.task3.circle;

public class CircleTest {

    public static void main(String[] args) {
        Circle circle = new Circle(-5);
        circle.setRadius(10);
        System.out.println(circle.getRadius());
        System.out.println(circle.getLength());
        System.out.println(circle.getSquare());
    }
}
