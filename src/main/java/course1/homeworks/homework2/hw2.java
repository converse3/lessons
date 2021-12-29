package course1.homeworks.homework2;

public class hw2 {
    public static void main(String[] args) {
        System.out.println("Task 1: ");
        System.out.println(checkSum(15, 4));

        System.out.println("Task 2: ");
        checkNum(0);

        System.out.println("Task 3: ");
        System.out.println(checkNum2(3));

        System.out.println("Task 4: ");
        printString("Hello", 2);

        System.out.println("Task 5: ");
        System.out.println("Not completed.");

    }
    // задание 1
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if(sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // задание 2
    public static void checkNum(int a) {
        if(a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // задание 3
    public static boolean checkNum2(int a) {
        if(a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    // задание 4
    public static void printString(String str, int a) {
        for(int n = 0; n < a; n++) {
            System.out.println(str);
        }
    }
}
