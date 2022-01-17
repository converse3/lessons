package course1.lessons.lesson5;

public class DemoApp {
    public static void main(String[] args) {
        Car car = new Car("Dodge", "Charger",2020);

        car.info();
        car.printModel();

        car.repair();
        car.info();




        String carModel = car.getModel();

    }
}
