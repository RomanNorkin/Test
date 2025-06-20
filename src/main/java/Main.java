package Lesson4;

public class Main {

    public static void main(String[] args) {
        int a = 13;
        int b = 10;
        String c = "Привет";
        String d = "Пока";

        System.out.println("Задание 2.1\nСравнение переменных a и b:\n");
        Test.compare(a, b);

        System.out.println("\nОперации сложения, вычитания, деления и умножения:\n");
        Test.math(a, b);

        System.out.println("\nЗадание 2.2\nСравнение строк c и d:\n");
        Test.compareString(c, d);

        System.out.println("\nЗадание 2.3\nВывести из массива [1, 2, 3, 4, 5, 6, 7, 8, 9,10] только четные числа:\n");
        Test.evenNumbers();
    }
}
