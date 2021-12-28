package course1.practic;
import java.util.Scanner;

public class practic2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sayHello();
        RegUnit();

        System.out.println("Your status: ");
        System.out.println("1 - Busy");
        System.out.println("2 - Available");
        System.out.println("3 - At lunch");

        int status = scanner.nextInt();
        CheckStatus(status);
    }

    public static void sayHello() {
        System.out.println("Welcome to database v0.0.1");
    }

    public static void RegUnit() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of unit: ");
        String uName = scanner.nextLine();

        double uCode = 1+Math.random()*999;
        uCode = Math.rint(uCode);

        System.out.println("Your code is " + uCode + uName);

    }

    public static void CheckStatus(int status) {
        switch (status) {
            case 1: {
                System.out.println("Your status is - Busy. You are is not available for calls");
                break;
            } case 2: {
                System.out.println("Your status is - Available. You are available for calls");
                break;
            } case 3: {
                System.out.println("Your status is - At lunch. You are is not available for calls");
                break;
            } default: {
                System.out.println("Status is not defined. You are is not available for calls");
            }
        }
    }
}
