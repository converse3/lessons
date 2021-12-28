package course1.practic;
import java.util.Scanner;

public class practic1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orderNumber = 1535744;

        Register();
        CheckOrder(orderNumber);

    }

    public static void Register() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Your age is not accepted");
            System.exit(0);
        } else {
            System.out.println("Your age is accepted");
        }
    }

    public static void CheckOrder(int orderNumber) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your order number: ");
        int userOrderNumber = scanner.nextInt();

        System.out.print("When did you order the product (how days ago): ");
        int date = scanner.nextInt();

        if(userOrderNumber == orderNumber) {
            if(date < 7) {
                System.out.println("Your order is being prepared for shipment.");
            } else if (date >= 7 && date <= 14) {
                System.out.println("Your order has been sent to your region.");
            } else {
                System.out.println("Your order in your region.");
            }
        }
    }
}
