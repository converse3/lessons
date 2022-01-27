package course1.homeworks.homework7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке: " + food + " еды.");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        Cat satiety;
        if (food < n) {
            System.out.println("Еды недостаточно. Кот не поел.");
            return false;
        } else {
            System.out.println("Еды хватило. Кот поел.");
            food -= n;
            return true;
        }
    }

    public void addFood(int n) {
        food += n;
        System.out.println("Добавлено " + n + " еды.");
    }
}