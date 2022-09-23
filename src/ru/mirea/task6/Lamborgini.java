package ru.mirea.task6;

public class Lamborgini implements Nameable, Priceable{

    @Override
    public String getName() {
        return "Ламборгини";
    }

    @Override
    public long getPrice() {
        return 1_000_000_000;
    }
}
