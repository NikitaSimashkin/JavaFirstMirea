package ru.mirea.task5.furniture;

public class FurnitureTest {

    public static void main(String[] args) {
        Sofa sofa = FurnitureShop.buySofa();
        sofa.doSomething();
        System.out.println(sofa);

        Table table = FurnitureShop.buyTable();
        table.doSomething();
        System.out.println(table);
    }
}
