package course1.lessons.lesson3;

import java.util.Arrays;

public class ArrayApp {

    public static int variable = 100;

    public static void main(String[] args) {
        int[] array = new int[5]; // новая память
        // int[] array2 = array; - не новая память
        array[2] = 199;
        array[array.length - 1] = 100;

        for (int n = 0; n < array.length; n++) {
            array[n] = 100 + n * 100;
        }

        int[] arr = {1, 3, 4, 5, 6};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arr));

        String[] strings = new String[10];

        Arrays.fill(strings,"a");

        System.out.println(Arrays.toString(strings));

        boolean[] booleans = {};
        System.out.println(Arrays.toString(booleans));

        int integer = 100;
        integer = method1(integer);
        System.out.println("integer = " + integer);

        int[] integers = {1,2,3,4,5,6};
        method2(integers);
        System.out.println(Arrays.toString(integers));

    }

    public static int method1(int a) {
        return variable + 10;
    }

    public static void method2(int[] a) {
        a[2] = 100500;
    }

    public static void printArray(int[] array) {
        for (int n = 0; n < array.length; n++) {
            System.out.print(array[n] + " ");
        }
        System.out.println();
    }

    public static int getAvg(int[] array) {
        int sum = 0;
        for (int n = 0; n < array.length; n++) {
            sum += array[n];
        }
        return sum / array.length;
    }
}
