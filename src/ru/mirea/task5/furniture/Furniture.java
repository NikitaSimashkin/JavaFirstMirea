package ru.mirea.task5.furniture;

import org.w3c.dom.ls.LSOutput;

public abstract class Furniture {
    protected String material;

    public abstract String getType();
    public abstract void doSomething();
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material = material;
    }
}

class Sofa extends Furniture{
    private final int height;

    public Sofa(String material, int height){
        this.material = material;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String getType() {
        return "Sofa";
    }

    @Override
    public void doSomething() {
        System.out.println("Do something from sofa");
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "material='" + material + '\'' +
                ", height=" + height +
                '}';
    }
}

class Table extends Furniture{
    private final int square;

    public Table(String material, int square){
        this.material = material;
        this.square = square;
    }

    public int getSquare() {
        return square;
    }

    @Override
    public String getType() {
        return "Table";
    }

    @Override
    public void doSomething() {
        System.out.println("Do something from table");
    }

    @Override
    public String toString() {
        return "Table{" +
                "material='" + material + '\'' +
                ", square=" + square +
                '}';
    }
}
