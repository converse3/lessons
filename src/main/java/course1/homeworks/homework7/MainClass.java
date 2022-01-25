package course1.homeworks.homework7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 10);
        Cat cat1 = new Cat("Murzik", 15);
        Cat cat2 = new Cat("Boris", 12);
        Plate plate = new Plate(20);
        Plate plate1 = new Plate(10);

        Cat[] cats = {cat, cat1, cat2};

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
            System.out.println();
        }
        plate.info();
        plate.addFood(15);
        plate.info();
    }
}
