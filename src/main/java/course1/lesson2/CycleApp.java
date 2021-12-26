package course1.lesson2;

public class CycleApp {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i > 6) {
                break;
            }
            PrintUtil.printFormatted("string" + i);
        }
        System.out.println(getDividedByThree());

    }

    public static int getDividedByThree() {
        for (int i = 2; i < 10; i += 2) {
            if (i % 3 == 0) {
                return i;
            }
        }
        return 0;
    }
}
