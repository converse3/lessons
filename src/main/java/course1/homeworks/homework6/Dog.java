package course1.homeworks.homework6;

public class Dog extends Animal {
    final int MAX_RUN_DOG = 500;
    final int MAX_SWIM_DOG = 10;
    public Dog(int isRun, int isSwim) {
        super(isRun, isSwim);
        this.isSwim = isSwim;
    }

    public void run(int isRun) {
        if (isRun > MAX_RUN_DOG) {
            isRun = MAX_RUN_DOG;
            this.isRun = isRun;
        } else {
            System.out.println("Собака пробежала " + this.isRun + " метров.");
            return;
        }
        System.out.println("Собака пробежала " + this.isRun + " метров.");
        System.out.println("Собака не может дальше бежать.");
    }

    public void swim(int isSwim) {
        if (isSwim > MAX_SWIM_DOG) {
            isSwim = MAX_SWIM_DOG;
            this.isSwim = isSwim;
        } else {
            System.out.println("Собака проплыла " + this.isSwim + " метров.");
            return;
        }
        System.out.println("Собака проплыла " + this.isSwim + " метров.");
        System.out.println("Собака не может дальше плыть.");
    }
}
