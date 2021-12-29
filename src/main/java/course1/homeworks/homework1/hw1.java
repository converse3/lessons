package course1.homeworks.homework1;

public class hw1 {

        public static void main(String[] args) {
            System.out.println("Task 1.");
            printThreeWords();
            System.out.println("Task 2.");
            checkSumSign();
            System.out.println("Task 3.");
            printColor();
            System.out.println("Task 4.");
            compareNumbers();
        }

        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        public static void checkSumSign() {
            int a = 10, b = 15;
            int sum;

            sum = a + b;
            if (sum >= 10) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }

        public static void printColor() {
            int value = 33;

            if(value <= 0) {
                System.out.println("Красный");
            } else if (value > 0 && value <= 100) {
                System.out.println("Желтый");
            } else if (value > 100) {
                System.out.println("Зелёный");
            }
        }

        public static void compareNumbers() {
            int a = 24, b = 31;

            if(a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println(" a < b");
            }
        }
    }
