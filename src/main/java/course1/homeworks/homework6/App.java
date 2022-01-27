package course1.homeworks.homework6;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat(197, 3);
        Dog dog = new Dog(529, 11);

        cat.run(cat.isRun);
        cat.swim(cat.isSwim);


        border();

        dog.run(dog.isRun);
        dog.swim(dog.isSwim);
    }

    /**
     * Отступ
     */
    public static void border() {
        System.out.println("--------------------------");
    }
}
