package ru.mirea.task4.ball;

public class BallTest {
    public static void main(String[] args) {
        Ball ball = new Ball(20, 30);
        System.out.println(ball);
        ball.move(10, 20);
        System.out.println(ball);
    }
}
