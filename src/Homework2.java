import java.util.Arrays;

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

        // Задание №2:
        System.out.println("Задание №2.2:");
        int[] arr = new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2;
        }
        System.out.println(Arrays.toString(arr));

        // Задание №3:
        System.out.println("Задание №2.3:");
        // Дано:
        boolean hasFuel = false;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = false;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.
        double cost = 0;
        double discount = 1;

        if (!hasFuel) {
            cost += 1000;
        }
        if (hasMotorProblem) {
            cost += 10000;
        }
        if (hasElectricsProblem) {
            cost += 5000;
        }
        if (hasTransmissionProblem) {
            cost += 4000;
        }
        if (hasWheelsProblem) {
            cost += 2000;
        }
        if (hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem) {
            discount -= 0.1;
        }
        if (hasElectricsProblem && hasMotorProblem && hasTransmissionProblem) {
            discount -= 0.2;
        }
        System.out.printf("%.2f", cost * discount);

// Задание №3:
        System.out.println("Задание №2.4:");
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.
        Workers worker1 = new Workers("Ivan", 0);
        Workers worker2 = new Workers("Petr", 0);
        Workers worker3 = new Workers("Misha", 0);
        Storehouse availableVodka = new Storehouse(50);


    }
}
