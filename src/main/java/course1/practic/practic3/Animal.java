package course1.practic.practic3;

import course1.lessons.lesson7.Format;

public class Animal {
    Format format = new Format();
    protected boolean satiety;

    protected int appetite;
    protected int thirst;

    protected String name;
    protected int health;

    public Animal(int thirst, int appetite, String name) {
        this.satiety = false;
        this.appetite = appetite;
        this.name = name;
        this.health = 100;
        this.thirst = thirst;
    }

    public void info() {
        String isSatiety;
        if (satiety) {
            isSatiety = format.ANSI_GREEN +"Кот не голоден." + format.ANSI_RESET;
        } else {
            isSatiety = format.ANSI_RED + "Кот голоден." + format.ANSI_RESET;
        }

        System.out.println("\nКличка - " + "`" + getName() + "`"
                + "\nЗдоровье - " + getHealth() + " единиц;"
                + "\nСытость - " + isSatiety
                + "\nГолод - " + getAppetite() + " единиц.");
    }

    public int getThirst() {
        return thirst;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            this.satiety = true;
            this.appetite = 0;
        }
    }

    public void die() {
        if (appetite > 100) {
            System.out.println( "\n" + format.ANSI_RED + "Кот погиб. Голод превысил 100 единиц." + format.ANSI_RESET);
            this.name = format.ANSI_RED + "DIED CAT" + format.ANSI_RESET;
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public int getAppetite() {
        return appetite;
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
