import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {

        // Базовый уровень
        // Задание №1
        System.out.println("Задание №1:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "a ");
        }
        System.out.println();


        // Задание №2
        System.out.println();
        System.out.println("Задание №2:");
        int childAge = 18;
        if (childAge <= 6) {
            System.out.println("Пошел в сад");
        } else if (childAge > 6 && childAge <= 11) {
            System.out.println("Пошел в младшую школу");

        } else if (childAge > 11 && childAge <= 17) {
            System.out.println("Пошел в среднюю школу");

        } else System.out.println("Пошел в университет");


        // Задание №3
        System.out.println();
        System.out.println("Задание №3:");
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
        System.out.println();
        System.out.println("Задание №4:");
        Dog pluto = new Dog("pluto", 18);
        Cat musya = new Cat("Musya", 3);
        System.out.println(musya.getName());
        musya.setAge(5);
        System.out.println(musya.getAge());
        System.out.println(pluto.getName());

        // Продвинутый уровень
        // Задание №1:
        System.out.println();
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

        // Задание №2:
        System.out.println();
        System.out.println("Задание №2.2:");
        int[] arr = new int[]{4, 3, 2, 1, 0, 0, 4, 4, 4, 4};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

        // Задание №3:
        System.out.println();
        System.out.println("Задание №2.3:");
        // Дано:
        boolean hasFuel = true;
        boolean hasElectricsProblem = true;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = false;

        double cost = 0;
        double discount1 = 1;
        double discount2 = 1;
        int problemCount = 0;

        if (!hasFuel && !(hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem)) {
            cost = +1000;
        } else {
            if (hasMotorProblem) {
                cost += 10000;
                problemCount += 1;
            }
            if (hasElectricsProblem) {
                cost += 5000;
                problemCount += 1;
            }
            if (hasTransmissionProblem) {
                cost += 4000;
                problemCount += 1;
            }
            if (hasWheelsProblem) {
                cost += 2000;
                problemCount += 1;
            }
            if (problemCount > 1) {
                discount1 -= 0.1;
            }
            if ((hasElectricsProblem || hasMotorProblem) && hasTransmissionProblem) {
                discount2 -= 0.2;
            }
        }
        System.out.printf("%.2f", (cost * discount1) * discount2);
        System.out.println();

// Задание №4:
        System.out.println();
        System.out.println("Задание №2.4:");
        Storehouse storehouse = new Storehouse();
        Workers worker1 = new Workers("Ivan", 0, storehouse);
        Workers worker2 = new Workers("Petr", 0, storehouse);
        Workers worker3 = new Workers("Misha", 0, storehouse);
        worker1.takeVodka(2);
        worker1.takeVodka(2);
        worker2.takeVodka(10);
        System.out.println(worker1.getJournal());
        System.out.println(worker2.getJournal());
        System.out.println(storehouse.getQuantity());


    }
}
