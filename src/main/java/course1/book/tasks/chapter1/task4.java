package course1.book.tasks.chapter1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        String realAnswer = "Barsik";
        System.out.println("Enter your pet name:");
        password = scanner.nextLine();

        if (password.equals(realAnswer)) {
            System.out.println("Correct.");
        } else {
            System.out.println("Not correct answer");
        }
    }
}
