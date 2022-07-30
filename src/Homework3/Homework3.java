package Homework3;


import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class Homework3 {
    public static void main(String[] args) throws IOException {
        //Базовый уровень
        //Задача №1
        System.out.println("Задание №1:");
        Toyota toyota = new Toyota();
        Zhiguli zhiguli = new Zhiguli();
        zhiguli.startMoving();
        zhiguli.stopMoving();
        zhiguli.useHeadlights();
        zhiguli.Broke();
        toyota.turnMusikOn();


        //Задача №2
        System.out.println();
        System.out.println("Задание №2:");
        String filePath = "C:\\java\\yury_courses\\Homework1_java_core\\src\\Homework3\\my_first_file.txt"; //путь для домашнего ПК
//        String filePath = "C:\\java\\java_core\\src\\Homework3\\my_first_file.txt";
        FileReader fileReader = new FileReader(filePath);
        BufferedReader BufferedReader = new BufferedReader(fileReader);
        String text = "";
        while (fileReader.ready()) {
            char read = (char) fileReader.read();
            text = (read == '\r') ? text.concat(" ") : (read == '\n') ? text.concat("") : text.concat(read + "");
        }
//        String line = "";
//        while (BufferedReader.ready()){
//            line = BufferedReader.readLine();
//            System.out.print(line + " ");
//        }
        BufferedReader.close();
        fileReader.close();
        System.out.println(text);

        //Задача №3
        System.out.println();
        System.out.println("Задание №3:");

        Financial_record financial_record = new Financial_record(500,300);
        String pathToReport = "C:\\java\\yury_courses\\Homework1_java_core\\src\\Homework3\\report.txt"; //путь для домашнего ПК
//        String pathToReport = "C:\\java\\java_core\\src\\Homework3\\report.txt";
        FileWriter fileWriter = new FileWriter(pathToReport);
        fileWriter.write("доходы = " + financial_record.getIncomes()+ "\n" + "расходы = "+ financial_record.getOutcomes());
        fileWriter.close();
        System.out.println("Данные записаны в report.txt");

        //Продвинутый уровень
        //Задача №1
        System.out.println();
        System.out.println("Задание №2.1:");
        Avto[] cars = new Avto[40];
        System.arraycopy(CarFactory.createToyota2(20), 0,  cars, 0,  20);
        System.arraycopy(CarFactory.createZhiguli2(20), 0, cars, 20, 20);

//        CarFactory.createToyota2(20);
//        CarFactory.createZhiguli2(20);
//        for (int i = 0; i <= 19; i++) {
//            cars [i] = CarFactory.createToyota();
//        }
//        for (int i = 20; i <= 39; i++) {
//            cars [i] = CarFactory.createZhiguli();
//        }
        for (Avto car : cars) {
            if (car instanceof Toyota){
               Toyota car1 = (Toyota) car;
               car1.turnMusikOn();
            }else if(car instanceof Zhiguli) {
                Zhiguli car1 = (Zhiguli) car;
                car1.Broke();
            }
        }
        System.out.println();
        System.out.println("Задание №2.2:");
        //Задача №2
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать 10 отчетов, с разными доходами и расходами (используй random)
        // 4. Записать в файл "report.txt" все данные из отчетов.
        // 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)

    }
}
