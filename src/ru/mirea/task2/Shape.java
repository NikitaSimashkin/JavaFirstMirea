package ru.mirea.task2;

public abstract class Shape{}

class Square extends Shape{ // 1 задание
    int height;

    Square(int height){
        this.height = height;
    }

    @Override
    public String toString(){
        return "Квадрат со стороной " + height;
    }
}


