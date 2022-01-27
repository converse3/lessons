package course1.practic.practic3;

import course1.lessons.lesson7.Format;

public class Cat extends Animal {
    Format format = new Format();
    public Cat(int thirst, int appetite, String name) {
        super(thirst, appetite, name);
    }

    public void die() {
        if (appetite > 100) {
            System.out.println("\n" + format.ANSI_RED + "Кот погиб. Голод превысил 100 единиц." + format.ANSI_RESET);
            this.name = format.ANSI_RED + "DIED CAT" + format.ANSI_RESET;;
        }
    }

    public void drink() {

    }
}
