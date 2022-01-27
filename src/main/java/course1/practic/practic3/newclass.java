package course1.practic.practic3;

public class newclass {
    public static void main(String[] args) {
        int arr[] = {243, 15, 332};
        middleNum(arr);
    }

    public static void middleNum(int[] arr) {
        int array[] = new int[arr.length];
        int lengthNumber;
        int sum = 0;
        int res1 = 0;
        double result;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            array[i] = lengthNumber = (String.valueOf(arr[i]).length());
        }
        System.out.println(sum);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            res1 += array[i];
        }
        result = res1 / array.length;
        System.out.println(result);
    }
}
