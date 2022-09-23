package ru.mirea.task6;

public class Earth implements Nameable, Priceable{

    @Override
    public String getName() {
        return "Земля";
    }

    @Override
    public long getPrice() {
        return 99999999999999L;
    }
}
