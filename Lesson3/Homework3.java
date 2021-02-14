package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {


        /*
        2 * Создать массив из слов
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
        apple – загаданное
        apricot - ответ игрока
        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        Для сравнения двух слов посимвольно можно пользоваться:
        String str = "apple";
        char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово.
        Используем только маленькие буквы.
         */
    guessWord();
    }

    private static void guessWord() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random digit = new Random();
        int hiddenWordRandomIndex = digit.nextInt(words.length);
        String hiddenWord = words[hiddenWordRandomIndex];

        System.out.println("Угадайте загаданный плод:");

        Scanner sc = new Scanner(System.in);
        String userAnswer = sc.nextLine();
        userAnswer = userAnswer.toLowerCase();

        char [] answerForm = new char[15];
        char [] userAnswer1 = new char[15];
        char [] hiddenWord1 = new char[15];
        for (int i = 0; i < 15; i++) {
            answerForm[i] = '#';
            userAnswer1[i] = '#';
            hiddenWord1[i] = '#';
        }

        for (int j = 0; j < hiddenWord.length(); j++) {
            hiddenWord1[j] = hiddenWord.charAt(j);
        }

        for (;;){
            for (int k = 0; k < userAnswer.length(); k++) {
                userAnswer1[k] = userAnswer.charAt(k);
                char a = userAnswer1[k];
                char b = hiddenWord1[k];
                if (a == b) {
                    answerForm[k] = a;
                }
            }

            if (userAnswer.equals(hiddenWord)) {
                System.out.println("Поздравляю, Вы угадали! Игра окончена.");
                break;
            }

            System.out.println("Угаданные буквы ниже откроются:");
            System.out.print(answerForm);
            System.out.println("\nПопробуйте угадать снова.");

            String nextUserAnswer = sc.nextLine();
            nextUserAnswer = nextUserAnswer.toLowerCase();
            userAnswer = nextUserAnswer;



        }
        sc.close();

    }
}
