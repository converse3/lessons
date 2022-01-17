package course1.lessons.lesson5;

public class Car {

    public static int wheelsNumber = 0;

    // fields
    private String model;
    private String modelFull;
    private int year;
    private boolean wasCrashed;
    private String[] properties;

    // constructor
    public Car(String model, String modelFull, int year, boolean wasCrashed) {
        this.model = model;
        this.modelFull = modelFull;
        this.year = year;
        this.wasCrashed = wasCrashed;
    }

    public Car(String model, String modelFull, int year) {
        this(model, modelFull, year, false);
    }


    /**
     * Выводит на экран информацию о машине
     */
    public void info() {
        System.out.println( "\nModel = " + model
                + "\nModel Full = " + modelFull
                + "\nYear = " + year
                + "\nwasCrashed = " + wasCrashed);
    }

    public void printModel() {
        System.out.println(model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelFull() {
        return modelFull;
    }

    public int getYear() {
        return year;
    }

    public boolean isWasCrashed() {
        return wasCrashed;
    }

    public void setModelFull(String model) {
        this.modelFull = model;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Error");
        }
    }

    public void setWasCrashed(boolean wasCrashed) {
        this.wasCrashed = wasCrashed;
    }

    /**
     * Авто попал в аварию
     */
    public void crash() {
        System.out.println("Car was crashed");
        wasCrashed = true;
    }

    public void repair() {
        if (wasCrashed) {
            wasCrashed = false;
            System.out.println("Car was repaired");
        } else {
            System.out.println("Nothing to repair");
        }
    }

    public void printModelNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(model);
        }
    }

    public static void staticInfo() {

    }
}
