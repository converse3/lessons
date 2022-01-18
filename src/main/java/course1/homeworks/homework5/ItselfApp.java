package course1.homeworks.homework5;

public class ItselfApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5]; // массив объектов
        // описание объектов массива
        employees[0] = new Employee("Grigoryev Ivan", "Handyman",
                "grigiv@example.com", 89782954891L, 22490, 38); // сотрудник 1

        employees[1] = new Employee("Ivanova Tatyana", "Engineer",
                "ivanova@list.ru", 89186498275L, 130000, 41); // сотрудник 2

        employees[2] = new Employee("Tarkov Oleg", "Cleaner",
                "tarkol@mail.ru", 89871628917L, 15000, 29); // сотрудник 3

        employees[3] = new Employee("Dostoevskiy Fedor", "Writer",
                "dostfedya@gmail.com", 89247925810L, 93000, 56); // сотрудник 4

        employees[4] = new Employee("Koryabina Anastasia", "Lawyer",
                "koryabina.anastasia@mail.ru", 89006723873L, 75000, 41); // сотрудник 5


        /**
         * Вывод в консоль информации об объектах массива
         */
        for (int i = 0; i < employees.length; i++) {
            employees[i].info();
        }

        border();

        /**
         * Проверка возраста и вывод в консоль объектов с параметром age > 40
         */
        for (int i = 0; i < employees.length; i++) {
            int age = employees[i].getAge();
            if (age > 40) {
                employees[i].info();
            }
        }
    }

    /**
     * Создал границу между заданиями
     */
    public static void border() {
        System.out.println("\n-----------------------------------------------------------");
    }
}
