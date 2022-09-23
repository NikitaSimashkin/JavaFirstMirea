package ru.mirea.task7.Shapes;

public class Rectangle extends Shape {

    protected double width = 0;
    protected double length = 0;

    public Rectangle(){}

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >= 0)
            this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length >= 0)
            this.length = length;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color=" + color +
                ", filled=" + filled +
                '}';
    }
}
