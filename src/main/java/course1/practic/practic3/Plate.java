package course1.practic.practic3;

import course1.lessons.lesson7.Format;

public class Plate {
    Format format = new Format();
    protected int food;
    protected boolean purity;

    public Plate(int food) {
        this.food = food;
        this.purity = true;
    }

    public boolean decreaseFood(int n) {
        if (food > n) {
            System.out.println(format.ANSI_GREEN + "\nКот успешно поел." + format.ANSI_RESET);
            food -= n;
            return true;
        }
        System.out.println(format.ANSI_RED+"\nКот не поел. Недостаточно еды."+format.ANSI_RESET);
        return false;
    }

    public void info() {
        System.out.println("\nКоличество еды в тарелке - " + food + " единиц."
                            + "\nЧистота тарелки - " + purity);
    }

    public int getFood() {
        return food;
    }

    public boolean isPurity() {
        return purity;
    }
}
