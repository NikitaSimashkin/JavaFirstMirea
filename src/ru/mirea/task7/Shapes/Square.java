package ru.mirea.task7.Shapes;

public class Square extends Rectangle{

    public Square(){

    }

    public Square(double side){
        setSide(side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return length;
    }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                ", color=" + color +
                ", filled=" + filled +
                '}';
    }
}
