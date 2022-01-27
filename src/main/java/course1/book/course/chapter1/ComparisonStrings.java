package course1.book.course.chapter1;

public class ComparisonStrings {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "Java";
        s2 = s1;
        System.out.println("Сравнение ссылок " + (s1 == s2)); // результат true
        // создание нового объекта
        s2 = new String("Java");
        System.out.println("Сравнение ссылок " + (s1 == s2)); // результат false
        System.out.println("Сравнение значений " + s1.equals(s2)); // результат true
    }
}
