package ru.mirea.task7.Shapes;

import org.w3c.dom.css.RGBColor;

import java.awt.*;

abstract class Shape {
    protected String color = "FFFFFF";
    protected boolean filled = false;

    public Shape(){

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                ", filled=" + filled +
                '}';
    }
}
