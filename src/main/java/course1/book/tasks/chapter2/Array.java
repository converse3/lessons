package course1.book.tasks.chapter2;

import java.util.Scanner;

public class Array {
    private int lengthNumber;
    private int max;
    private int min;
    private int sum;
    private Scanner scanner = new Scanner(System.in);
    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void fillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите " + (i+1) + " элемент массива: ");
            arr[i] = scanner.nextInt();
        }
    }

    public void checkMax(int[] arr) {
        final int MAX_NUM = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MAX_NUM && arr[i] > max) {
                max = arr[i];
            }
        }
        lengthNumber = (String.valueOf(max).length());
        System.out.println("Максимальное число: " + max + "\nДлина числа: " + lengthNumber);
        System.out.println();
    }

    public void checkMin(int[] arr) {
        min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        lengthNumber = (String.valueOf(min).length());
        System.out.println("Минимальное число: " + min + "\nДлина числа: " + lengthNumber);
        System.out.println();
    }

    public void middleNum(int[] arr) {
        int buff;
        for (int i = 0; i < arr.length; i++) {
            buff = arr[i] + arr[i + 1];
            sum += buff;
        }
    }
}
