package Homework1;

import java.util.Arrays;
import java.util.Locale;

public class Homework1 {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        System.out.println("Задача 1.1 :");
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String text1 = hi.trim() + world.toLowerCase() + newLine;
        System.out.println(text1.repeat(3));

        //Задача №2
        System.out.println("Задача 1.2 :");
        int weight = 90;
        double height = 1.87; //можно и через флоат, но тогда не верное кол-во цифр после запятой
        System.out.printf("%.7f", weight / (height * height));
        System.out.println('\n');

        //Задача №3
        System.out.println("Задача 1.3 :");
        char[] alphabetArr = new char[]{'a', 'b', 'c', 'd', 'e'};
        String alphabet = new String(alphabetArr);
        System.out.println(alphabet);
        alphabetArr[3] = 'h';
        String alphabetH = new String(alphabetArr);
        System.out.println(alphabetH + '\n');

        //Продвинутый уровень
        //Задача №1
        System.out.println("Задача 2.1 :");
        String simpleText = "234";
        String somteText = "some_text";
        System.out.println(Integer.parseInt(simpleText) + somteText.length());
        System.out.println();

        //Задача №2
        System.out.println("Задача 2.2 :");
        int a = 3;
        int b = 5;
        int result = (a + b) * (a + b);
        System.out.println(result);
        System.out.println();

        //Задача №3
        System.out.println("Задача 2.3 :");
        int[] arrayA = new int[]{1, 2, 5, 7, 10};
        int[] arrayB = new int[]{2, 3, 2, 17, 15};
        int[] arrayR = new int[arrayA.length + arrayB.length + arrayB.length];
        int count = 0;
        for (int i = 0; i < arrayA.length; i++) {
            arrayR[i] = arrayA[i];
            count++;
        }
        for (int j : arrayB) {
            arrayR[count++] = j;
        }
        for (int i = 0; i < arrayA.length; i++) {
            arrayR[count++] = arrayA[i] * arrayB[i];
        }
        System.out.println(Arrays.toString(arrayR));
        System.out.println();

        //Задача №4
        System.out.println("Задача 2.4 :");
        String frase = "Hello world!";
        String changedFrase = frase.replace('l', 'r').toUpperCase(Locale.ROOT);
        System.out.println(changedFrase.substring(0, 8));


    }
}
