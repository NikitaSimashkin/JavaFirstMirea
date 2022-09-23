package ru.mirea.task7.Movable;

public class MovableTest {
    public static void main(String[] args) {
        MovableRectangle mr = new MovableRectangle(0, 10, 10, 0, 5, 5);
        mr.moveUp();
        System.out.println(mr);
        mr.moveLeft();
        System.out.println(mr);
        // Все работает
    }
}
