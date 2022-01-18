package course1.homeworks.homework5;

import java.io.OptionalDataException;
import java.util.Scanner;

public class Employee {
    private String fullName;
    private String post;
    private String mail;
    private long telNum;
    private int salary;
    private int age;

    /**
     * Создание конструктора
     *
     * @param fullName полное имя
     * @param post     должность
     * @param mail     электронная почта
     * @param telNum   номер телефона
     * @param salary   зарплата
     * @param age      возраст
     */
    public Employee(String fullName, String post, String mail, long telNum, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.mail = mail;
        this.telNum = telNum;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Вывод в консоль информации
     */
    public void info() {
        System.out.println("\nFull name = " + fullName // полноя имя
                + "\nPost = " + post // должность
                + "\nMail = " + mail // почта
                + "\nTelephone num = " + telNum // номер телефона
                + "\nSalary = " + salary // зарплата
                + "\nAge = " + age); // возраст
    }

    /**
     * Получение значения age
     *
     * @return возраст
     */
    public int getAge() {
        return age;
    }
}
