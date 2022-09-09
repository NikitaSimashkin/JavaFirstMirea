package ru.mirea.task3.human;

import ru.mirea.task3.human.humanParts.Human;

public class HumanTest {

    public static void main(String[] args) {
        Human h = Human.createDefaultHuman();
        System.out.println(h);
    }
}
