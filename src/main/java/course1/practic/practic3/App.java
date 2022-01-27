package course1.practic.practic3;

public class App {
    public static void main(String[] args) {
        Animal cat = new Cat(13, 23,"Greka");
        Plate plate = new Plate(52);

        plate.info();
        cat.info();
        cat.eat(plate);
        cat.info();
        plate.info();


    }
}
