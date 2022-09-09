package ru.mirea.task3.human.humanParts;

public class Body {
    private final int length;
    private final int width;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Body(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Body{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
