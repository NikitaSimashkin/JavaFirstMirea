package ru.mirea.task7.Shapes;

public class Circle extends Shape {

    protected double radius;

    public Circle(){}

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        setRadius(radius);
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 0)
            this.radius = radius;
    }

    @Override
    double getArea() {
        return  Math.PI * Math.PI * radius;
    }

    @Override
    double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + color +
                ", filled=" + filled +
                '}';
    }
}
