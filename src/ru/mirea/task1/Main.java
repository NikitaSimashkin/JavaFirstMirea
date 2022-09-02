package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = createArrayFirst(10);

        System.out.println(forSum(array)); // 3 задание
        System.out.println(whileSum(array));
        System.out.println(doWhileSum(array));

        String[] strings = new String[]{"one", "two", "three", "four"}; // 4 задание
        outputStringArray(strings);

        int[] array2 = createArraySecond(10); // 6 задание
        outputIntArray(array2);
        Arrays.sort(array2);
        outputIntArray(array2);

        System.out.println(harmonicRow(3)); // 5 задание

        System.out.println(factorial(10)); // 7 задание
    }

    private static double harmonicRow(int n) {
        double result = 0;
        for (int i = 1; i <= n; i++){
            result += 1d/i;
        }
        return result;
    }

    private static int[] createArrayFirst(int n){ // 1 часть шестого задания
        int[] array = new int[n];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }

    private static int[] createArraySecond(int n){ // 2 часть шестого задания
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100) + 1;
        }
        return array;
    }

    private static int forSum(int[] array){
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    private static int whileSum(int[] array){
        int sum = 0;
        int i = 0;
        while (i < array.length){
            sum += array[i];
            i++;
        }
        return sum;
    }

    private static int doWhileSum(int[] array){
        int sum = 0;
        int i = 0;
        do {
            sum += array[i];
            i++;
        } while(i < array.length);
        return sum;
    }

    private static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    private static void outputStringArray(String[] array){
        for (String i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void outputIntArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
