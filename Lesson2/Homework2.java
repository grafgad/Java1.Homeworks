package Lesson2;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
/*
        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
        7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
*/
        /*changeDigits();
        fillEmptyArray();
        digitAddition();
        diagonalArray();
        minAndMax();*/
        equalArray();
        moveArray();
    }


        public static void changeDigits(){
            int[] digits = {1,1,1,0,0,0,1,0};
            System.out.print("Первое задание. Задан массив на " + digits.length + " чисел: ");
            System.out.println(Arrays.toString(digits));
            for (int i = 0; i < digits.length; i++) {
                int terna = (digits[i] > 0) ? 0 : 1;
                digits[i] = terna;
                /* int a = digits[i];
                switch (a) {
                    case 1:
                        digits[i] = 0;
                        break;
                    case 0:
                        digits[i] = 1;
                        break;
                    default:
                        digits[i] = 2;
                }*/
            }
            System.out.println("Преобразованный массив: " + Arrays.toString(digits));
        }


        public static void fillEmptyArray (){
            System.out.println("Второе задание.");
            int [] emptyArray = new int[8];
            for (int i = 0; i < emptyArray.length; i++) {
                emptyArray [i] = i*3;
            }
            System.out.println(Arrays.toString(emptyArray));
        }


        public static void digitAddition(){
            System.out.println("Третье задание.");
            int [] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println(Arrays.toString(numbers));
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 6){
                    numbers[i] = (numbers [i] * 2);
                }
            }
            System.out.println(Arrays.toString(numbers));
        }

        public static void diagonalArray(){
            System.out.println("Четвертое задание.");
            int SIZE = 5;
            int [][] squareArray = new int[SIZE][SIZE];
            for (int i = 0; i < squareArray.length; i++) {
                for (int j = 0; j < squareArray.length; ++j) {
                    squareArray[i][i] = 1;
                    squareArray[i][SIZE-1-i] = 1;
                    System.out.printf("%3d", squareArray[i][j]);
               }
                System.out.println();
            }
        }

        public static void minAndMax(){
            System.out.println("Пятое задание");
            int size = 7;
            int [] array = new int[size];
                for (int i = 0; i < array.length; i++) {
                    array [i] = (int) (Math.random()*100);
                }
            System.out.println(Arrays.toString(array));

            int minDigit = array [size-1];
            int maxDigit = array [size-1];
                for (int i = 0; i < array.length; i++) {
                    if (minDigit > array[i]) {
                        minDigit = array[i];
                    }
                    else if (maxDigit < array[i]){
                        maxDigit = array [i];
                    }
                }
            System.out.println("minDigit = " + minDigit);
            System.out.println("maxDigit = " + maxDigit);
        }


        public static boolean equalArray() {
            System.out.println("Шестое задание");
            int[] array = {2, 2, 2, 5, 2, 2, 10, 1};
            int leftPart = 0;
            int rightPart = 0;
            for (int i = 0; i < array.length; i++) {
                rightPart += array[i];
            }
            for (int j = 0; j < array.length; j++) {
                if (leftPart != rightPart){
                    leftPart = leftPart + array[j];
                    rightPart = rightPart - array[j];
                }
                else if (leftPart == rightPart){
                    System.out.println("Найдены границы павенства: \n" + leftPart + " = " + rightPart);
                    break;
                }
            }
            if (leftPart != rightPart) {
                System.out.println("Границы равенства не найдены.");
                return false;
            }
            return true;
        }


        public static int moveArray(){
            System.out.println("Седьмое задание");
            int [] array = {4,5,6,7,8,9,10};
            int n = -3;
            if (n >0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < array.length; j++) {
                        int a = array[j];
                        array[j] = array[array.length - 1];
                        array[array.length - 1] = a;
                    }
                }
            }
            if (n < 0) {
                for (int i = 0; i > n; i--) {
                    for (int j = array.length-1; j >= 0 ; j--) {
                        int a = array[j];
                        array[j] = array[array.length - 1];
                        array[array.length - 1] = a;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
            return 0;
        }



}
