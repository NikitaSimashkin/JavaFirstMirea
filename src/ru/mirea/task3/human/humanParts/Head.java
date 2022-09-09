package ru.mirea.task3.human.humanParts;

class Head {
    private final int size;

    public int getSize() {
        return size;
    }

    public Head(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Head{" +
                "size=" + size +
                '}';
    }
}
