package course1.lessons.lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TaskApp {

    public static int[] array = new int[]{1, 0, 1, 1};

    public static void reverseArray() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else array[i] = 1;
        }
    }
    public static void printMap() {
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        reverseArray();
        printMap();
    }


}
