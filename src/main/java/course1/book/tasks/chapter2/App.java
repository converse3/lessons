package course1.book.tasks.chapter2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Array array = new Array();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива и нажмите <Enter>: ");
        int i = scan.nextInt();
        int[] arr = new int[i];

        array.fillArr(arr);
        array.printArr(arr);
        array.checkMax(arr);
        array.checkMin(arr);
    }
}
