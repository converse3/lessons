package course1.book.course.chapter3;

public class Order {
    private int id; // переменная экземпляра класса
    static int bonus; // переменная класса
    public final int MIN_TAX = 8 + (int)(Math.random()*5); // константа экземпляра класса
    public final static int PURCHASE_TAX = 6; // константа класса
    public double calculatePrice(double price, int counter) {
        double amount;
        amount = (price - bonus) * counter;
        double tax = amount * PURCHASE_TAX / 100;
        return amount + tax;
    }
}
