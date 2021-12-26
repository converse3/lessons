package course1.lesson2;

/**
 * создать поле 6х6 и заполнить его *
 */

public class DemoApp {
    public static void main(String[] args) {
        for(int n = 0; n < 6; n++) {
            for(int j = 0; j < 6; j++) {
                if (n == j) {
                    System.out.print(" ");
                } else if (n < j) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
