package course1.book.tasks.chapter1;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter your name and press <ENTER>:");
        name = scanner.nextLine();
        System.out.println("Hello, " + name);
    }
}
