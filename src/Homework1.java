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
        System.out.println('\n');
        //Задача №3
        char[] alphabetArr = new char[]{'a', 'b', 'c', 'd', 'e'};
        String alhabet = new String(alphabetArr);
        System.out.println(alhabet);
        alphabetArr[3] = 'h';
        String alphabetH = new String(alphabetArr);
        System.out.println(alphabetH + '\n');
        //Продвинутый уровень
        //Задача №1
        String simpleText = "234";
        String somteText = "some_text";
        System.out.println(Integer.parseInt(simpleText) + somteText.length());
        System.out.println();
        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int a = 3;
        int b = 5;
        int result = (a + b) * (a + b);
        System.out.println(result);
        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        int[] arrayA = new int[]{1, 2, 5, 7, 10};
        int[] arrayB = new int[]{2, 3, 2, 17, 15};
        int[] arrayR = new int[arrayA.length + arrayB.length];

        System.out.println(Arrays.toString(arrayR));


    }
}
