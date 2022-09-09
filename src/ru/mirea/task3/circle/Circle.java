package ru.mirea.task3.circle;

public class Circle {
    private int radius = 0;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0) {
            radius = 0;
            System.out.println("Радиус не может быть отрицательным, его значение установлено в 0");
        }


        this.radius = radius;
    }

    public Circle(int radius) {
        setRadius(radius);
    }

    public int getLength(){
        return (int)(2 * Math.PI * radius);
    }

    public int getSquare(){
        return (int)(Math.PI * Math.PI * radius);
    }
}
