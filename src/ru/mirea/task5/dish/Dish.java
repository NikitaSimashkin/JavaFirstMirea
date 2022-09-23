package ru.mirea.task5.dish;

public abstract class Dish {

    public abstract int getMaxTemperature();
    public abstract String getType();
}

class Cap extends Dish{
    private int height;

    public int getHeight() {
        return height;
    }

    public Cap(int height) {
        this.height = height;
    }

    @Override
    public int getMaxTemperature() {
        return 30;
    }

    @Override
    public String getType() {
        return "Cup";
    }

    @Override
    public String toString() {
        return "Cap{" +
                "height=" + height +
                '}';
    }
}

class Plate extends Dish{
    private int radius;

    public Plate(int radius) {
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    @Override
    public int getMaxTemperature() {
        return 30;
    }

    @Override
    public String getType() {
        return "Plate";
    }

    @Override
    public String toString() {
        return "Plate{" +
                "radius=" + radius +
                '}';
    }
}
