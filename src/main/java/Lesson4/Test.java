package Lesson4;

public class Test {

    // Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
    //- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
    //- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.

    public static void compare(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    public static void math(double a, double b) {
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        if (b == 0) {
            System.out.println("На ноль делить нельзя!");
        } else {
            System.out.println(a + " / " + b + " = " + (a / b));
        }

    }

    //Написать программу, которая принимает на вход две строки (c и d) и сравнивает их.
    // В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"

    public static void compareString(String c, String d) {
        if (c.equals(d)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    //Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]
    // необходимо написать программу, которая выведет в консоль все чётные числа.

    public static void evenNumbers() {
        int[] arry = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int j : arry) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }

    }
}
