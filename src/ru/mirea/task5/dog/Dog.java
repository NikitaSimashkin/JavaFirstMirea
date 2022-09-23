package ru.mirea.task5.dog;

public abstract class Dog {

    public abstract String getBreed();
    public abstract void say();
}

class Husky extends Dog{
    public int width;
    public int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Husky(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getBreed() {
        return getClass().getName();
    }

    @Override
    public void say() {
        System.out.println("Привет, я хаски");
    }

    @Override
    public String toString() {
        return "Husky{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

class Toiterier extends Dog{

    public int width;
    public int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Toiterier(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getBreed() {
        return getClass().getName();
    }

    @Override
    public void say() {
        System.out.println("Здорова, я тойтерьер");
    }

    @Override
    public String toString() {
        return "Toiterier{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
