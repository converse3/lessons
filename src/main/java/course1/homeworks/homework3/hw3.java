package course1.homeworks.homework3;

import java.util.Arrays;

public class hw3 {
    public static void main(String[] args) {
        // ----------------------------------------------
        // задание 1
        System.out.println("Task 1: ");
        int[] array = {1, 0, 0, 1, 1, 0, 1, 1};

        System.out.println("Initial state: ");
        printArray(array);
        System.out.println();
        System.out.println();

        changeArray(array);
        System.out.println("Finished condition: ");
        printArray(array);

        System.out.println();
        System.out.println();

        // ------------------------------------------
        // задание 2
        System.out.println("Task 2:");
        int[] arr = new int[100];

        for (int n = 0; n < arr.length; n++) {
            arr[n] = n + 1;
        }

        System.out.println("Result is: ");
        printArray(arr);

        // разделение
        System.out.println();
        System.out.println();

        // ------------------------------------------
        // задание 3
        System.out.println("Task 3: ");
        int[] newArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Initial state: ");
        printArray(newArr);

        // разделение
        System.out.println();
        System.out.println();

        for (int n = 0; n < newArr.length; n++) {
            if (newArr[n] < 6) {
                newArr[n] *= 2;
            }
        }

        System.out.println("Finished condition: ");
        printArray(newArr);

        // разделение
        System.out.println();
        System.out.println();

        // ---------------------------------------------
        // задание 4
        System.out.println("Task 4: ");
        int[][] myArr = new int[3][3];

        // вывод массива в консоль
        System.out.println("Initial state: ");
        for (int n = 0; n < myArr.length; n++) {
            System.out.println(Arrays.toString(myArr[n]));
        }

        System.out.println(); // разделение

        // создание диагоналей
        for (int n = 0; n < myArr.length; n++) {
            myArr[n][n] = 1;
            myArr[myArr.length - 1 - n][n] = 1;
        }

        // вывод массива в консоль
        System.out.println("Finished condition: ");
        for (int n = 0; n < myArr.length; n++) {
            System.out.println(Arrays.toString(myArr[n]));
        }
        System.out.println();

        // ------------------------------------------------
        // задание 5
        System.out.println("Task 5: ");
        int[] newArray = createArray(5, 2);
        System.out.println("New created array: ");
        printArray(newArray);
        System.out.println();
        System.out.println();

        // ------------------------------------------------
        // задание 6
        System.out.println("Task 6: ");
        System.out.println("Array: ");
        int[] arrNew = {93, 16, 94, 35, 5, 27};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int n = 0; n < arrNew.length; n++) {
            if (arrNew[n] > max) {
                max = arrNew[n];
            } else if (arrNew[n] < min) {
                min = arrNew[n];
            }
        }
        printArray(arrNew);
        System.out.println();
        System.out.println();
        System.out.println("Max value is - " + max);
        System.out.println("Min value is - " + min);

        // ------------------------------------------------

    }

    public static void printArray(int[] array) {
        for (int n = 0; n < array.length; n++) {
            System.out.print(array[n] + " ");
        }
    }

    // для 1 задания
    public static void changeArray(int[] array) {
        for (int n = 0; n < array.length; n++) {
            if (array[n] == 1) {
                array[n] = 0;
            } else {
                array[n] = 1;
            }
        }
    }

    // для 5 задания
    public static int[] createArray(int len, int initialValue) {
        int[] newArray = new int[len];
        for (int n = 0; n < newArray.length; n++) {
            newArray[n] = initialValue;
        }
        return newArray;
    }
}