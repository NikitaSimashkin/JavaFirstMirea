package ru.mirea.task3.human.humanParts;

public class Hand {
    private final int length;

    public Hand(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "length=" + length +
                '}';
    }
}
