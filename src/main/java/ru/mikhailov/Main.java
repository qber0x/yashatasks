package ru.mikhailov;

public class Main {
    public static void main(String[] args) {
        System.out.println("Все элементы массива:");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 11) + 5;
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Максимальное значение из массива: " + max);
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Минимальное зачение массива: " + min);
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        int result = sum/array.length;
        System.out.println("Среднее арифметическое массива: " + result);
    }
}