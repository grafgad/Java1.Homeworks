package lesson1;

/*      1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
        2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода. Помните про типы данных и их приведение
        4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
*/
public class MainHomework1 {
    public static void main(String[] args) {
        dataTypes();
        mathematics();
        sumVar();
        numbers();
        negativeNumber();
        helloName();
        leapYear();
    }


    public static void dataTypes(){
        byte a = 123;
        short b = -15000;
        int c = 12;
        long d = -20000L;
        float e = 84.59f;
        double f = -659.17;
        char g = 1100;
        boolean h = false;
        System.out.println("Второе задание");
        System.out.println(a);
    }
    public static void mathematics(){
        System.out.println("Третье задание");
        formula(5,7,9,4);
        formula(15,87,29,44);
        formula(9,15,45,9);

    }

    public static void formula(int a, int b, double c, int d){
        double e = a*(b+(c/d));
        System.out.println(e);
    }


    public static void sumVar(){
        System.out.println("Четвертое задание");
        sum(7, 8);
        sum(9 ,6);
        sum(4, 6);
        sum(3,5);
        sum(7 ,1);
    }

    public static boolean sum(int a, int b) {
        if (a + b <= 20 & a + b >= 10) {
            System.out.println(a + b + "  -- Цикл завершен");
            return true; // a+b = true;
        } else {
            System.out.println("Данные не соответствуют условиям задачи.  -- Цикл завершен");
            return false; // a+b = false
        }
    }


    public static void numbers(){
        System.out.println("Пятое задание");
        numberCheck(5);
        numberCheck(-9);
        numberCheck(45);
        numberCheck(0);
        numberCheck(-16);
        numberCheck(35);
        numberCheck(-3);
    }

    public static void numberCheck(int a){
        if (a >= 0) {
            System.out.println(a +" положительное число");
        }
        else {
            System.out.println(a +" отрицательное число");
        }
    }


    public static void negativeNumber(){
        System.out.println("Шестое задание");
        checkNumber(-52);
        checkNumber(76);
        checkNumber(-45);
        checkNumber(-3);
        checkNumber(8);
        checkNumber(3);
    }

    public static boolean checkNumber(int a){
        if (a < 0) {
            System.out.println(a + " отрицательное число. Проверка завершена.");
            return true;
        }
        else {
            System.out.println("Число положительное.");
            return false;
        }
    }


    public static void helloName(){
        System.out.println("Седьмое задание");
        printName ("Katie");
        printName ("Anna");
        printName ("Mike");
        printName ("Timmy");
    }

    public static void printName(String a) {
        System.out.println("Hello, " + a + "!");
    }

    
    public static void leapYear(){
        System.out.println("Восьмое задание");
        checkYear (2020);
        checkYear (2000);
        checkYear (1900);
        checkYear (1533);
        checkYear (1600);
        checkYear (1949);
        checkYear (1812);
        checkYear (300);
    }

    /*public static void checkYear (int a) {
        if (a % 400 == 0) {
            System.out.println(a + " - Это високосный год (400).");
        }
        else if (a % 100 ==0) {
        System.out.println(a + " - год не високосный (100).");
        }
        else if (a % 4 == 0) {
            System.out.println(a + " - это високосный год (4).");
        }
        else {
            System.out.println(a + " - Год не високосный");
        }
    }*/

    public static boolean checkYear (int a) {
        return a % 400 == 0 || (a % 4 == 0 && a % 100 != 0);
    }


}
