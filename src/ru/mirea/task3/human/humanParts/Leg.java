package ru.mirea.task3.human.humanParts;

public class Leg {

    private final int length;

    public Leg(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "length=" + length +
                '}';
    }
}
