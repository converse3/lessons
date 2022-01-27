package course1.homeworks.homework6;

public class Cat extends Animal {
    final int MAX_RUN_CAT = 200;
    final int MAX_SWIM_CAT = 0;
    public Cat(int isRun, int isSwim) {
        super(isRun, isSwim);
        this.isRun = isRun;
        this.isSwim = isSwim;
    }

    public void run(int isRun) {
        if (isRun > MAX_RUN_CAT) {
            this.isRun = MAX_RUN_CAT;
        } else {
            System.out.println("Кот пробежал " + this.isRun + " метров.");
            return;
        }
        System.out.println("Кот пробежал " + this.isRun + " метров.");
        System.out.println("Кот не может больше бежать");
    }

    public void swim(int isSwim) {
        if (isRun > MAX_SWIM_CAT) {
            isSwim = 0;
            this.isSwim = isSwim;
        } else {
            System.out.println("Кот проплыл " + this.isSwim + " метров.");
            return;
        }
        System.out.println("Кот проплыл " + this.isSwim + " метров.");
        System.out.println("Кот не умеет плавать.");
    }
}
