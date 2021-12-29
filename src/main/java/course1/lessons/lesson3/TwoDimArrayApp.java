package course1.lessons.lesson3;

import java.util.Arrays;

public class TwoDimArrayApp {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        array[2][2] = 2;
        array[0][3] = 5;
        for(int n = 0; n < array.length; n++) {
            for(int j = 0; j < array.length; j++) {
                System.out.print(array[n][j] + " ");
            }
            System.out.println();
        }

        for(int n = 0; n < array.length; n++) {
            System.out.println(Arrays.toString(array[n]));
        }

        int[] subArray = array[0];

        System.out.println();
        System.out.println(Arrays.toString(subArray));
        System.out.println();
        System.out.println();
        System.out.println();

        int[][] newArray = new int[5][];

        newArray[0] = new int[]{1,2,3};
        newArray[1] = new int[]{1,2,3,4,5};
        newArray[2] = new int[]{1};
        newArray[3] = new int[]{1,1};

        System.out.println(Arrays.toString(newArray));
        for(int n = 0; n < newArray.length; n++) {
            System.out.println(Arrays.toString(newArray[n]));
        }

        int[][] arr = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };

        System.out.println();

        for (int n = 0; n < arr.length; n++) {
            System.out.println(Arrays.toString(arr[n]));
        }

        char[] chars = "Java is good!".toCharArray();
        System.out.println(Arrays.toString(chars));

        System.out.println("Java".charAt(3));
    }


}
