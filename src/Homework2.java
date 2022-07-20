public class Homework2 {
    public static void main(String[] args) {

        // Базовый уровень
        // Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
        System.out.println("Задание №1:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "a ");
        }
        System.out.println();
        System.out.println("Задание №2:");

        // Задание №2
        int childAge = 18;
        if (childAge <= 6) {
            System.out.println("Пошел в сад");
        } else if (childAge > 6 && childAge <= 11) {
            System.out.println("Пошел в младшую школу");

        } else if (childAge > 11 && childAge <= 17) {
            System.out.println("Пошел в среднюю школу");

        } else System.out.println("Пошел в университет");
        System.out.println("Задание №3:");

        // Задание №3
        boolean chicken = false;
        boolean vegetables = true;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;

        if (chicken && vegetables && sour && toast) {
            System.out.println("Приготовлен салат Цезарь");
        } else if (vegetables && sausage && chicken && eggs) {
            System.out.println("Приготовлен салат Оливье");
        } else if (vegetables) {
            System.out.println("Приготовлен овощной салат");
        } else System.out.println("Ингридиентов недостаточно");

        // Задание №4
        System.out.println("Задание №4:");
        Dog pluto = new Dog("pluto", 18);
        Cat musya = new Cat("Musya", 3);
        System.out.println(musya.getName());
        musya.setAge(5);
        System.out.println(musya.getAge());
        System.out.println(pluto.getName());

        // Продвинутый уровень
        // Задание №1:
        System.out.println("Задание №2.1:");
        double increment = 0.01123;
        double result = 0;
        int count = 0;
        if (increment > 0) {
            for (double i = 0; i < 1000000; i = i + increment) {
                result = result + increment;
                count++;
            }
            System.out.println(count);
        }
//        while (result < 1000000) {
//            if (increment > 0) {
//                result = result + increment;
//                count++;
//            } else break;
//        }
//        if (increment > 0) {
//            System.out.println(count);
//        }
    }
}
