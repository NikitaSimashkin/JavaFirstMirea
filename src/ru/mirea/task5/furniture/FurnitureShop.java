package ru.mirea.task5.furniture;

public class FurnitureShop {
    
    private FurnitureShop(){}
    
    public static Sofa buySofa(){
        return new Sofa("Wood", (int)(Math.random()*100) + 1);
    }

    public static Table buyTable(){
        return new Table(
                "Wood", (int)(Math.random()*100) + 1);
    }
}
