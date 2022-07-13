import java.sql.Array;
import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String text1 = hi.trim() + world + newLine;
        System.out.println(text1.repeat(3));
        //Задача №2
        int weith = 90;
        double height = 1.87; //можно и через флоат, но тогда не верное кол-во цифр после запятой
        System.out.printf("%.7f", weith / (height * height));
        System.out.println();
        //Задача №3
        char[] alphabetArr = new char[]{'a','b','c','d','e'};
        String alhabet = new String(alphabetArr);
        System.out.println(alhabet);
        alphabetArr[3] = 'h';
        String alphabetH = new String(alphabetArr);
        System.out.println(alphabetH);
        System.out.println();
    }
}
