package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        pract3rd();
        pract4th();
        pract5th();
        pract6th();
        pract7th();
    }

    private static void pract7th() {
        System.out.println("7 задание: ");
        System.out.println(factorial(10)); // 7 задание
        System.out.println();
    }

    private static void pract6th() {
        System.out.println("6 задание: ");
        int[] array2 = createArraySecond(10); // 6 задание
        outputIntArray(array2);
        Arrays.sort(array2);
        outputIntArray(array2);
        System.out.println();
    }

    private static void pract5th() {
        System.out.println("5 задание: ");
        outputStringArray(harmonicRow(10));
        System.out.println();
    }

    private static void pract4th() {
        System.out.println("4 задание: ");
        String[] strings = new String[]{"one", "two", "three", "four"};
        outputStringArray(strings);
        System.out.println();
    }

    private static void pract3rd() {
        int[] array = createArrayFirst(10);
        System.out.println("3 задание: ");
        System.out.println("for: " + forSum(array));
        System.out.println("while: " + whileSum(array));
        System.out.println("do while: " + doWhileSum(array));
        System.out.println();
    }

    private static String[] harmonicRow(int n) {
        String[] result = new String[n];
        for (int i = 1; i <= n; i++){
            result[i-1] = String.format("%.3f", Math.round((1d/i)*10000)/10000d);
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
