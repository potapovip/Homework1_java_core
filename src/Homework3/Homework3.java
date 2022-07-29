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
//        String filePath = "C:\\java\\java_core\\src\\Homework3\\my_first_file.txt"; путь для домашнего ПК
        String filePath = "C:\\java\\java_core\\src\\Homework3\\my_first_file.txt";
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
//        String pathToReport = "C:\\java\\java_core\\src\\Homework3\\report.txt"; путь для домашнего ПК
        String pathToReport = "C:\\java\\java_core\\src\\Homework3\\report.txt";
        FileWriter fileWriter = new FileWriter(pathToReport);
        fileWriter.write("доходы = " + financial_record.getIncomes()+ "\n" + "расходы = "+ financial_record.getOutcomes());
        fileWriter.close();
        System.out.println("Данные записаны в report.txt");

        //Продвинутый уровень
        //Задача №1
        // Сделать задачу №1 (1 и 2 пункты) из базовой.
        // 1. Создать класс CarFactory, у которого есть два статических метода: создать жигули, создать toyota.
        // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
        // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
        // и вызвать характерные для нее методы.
        System.out.println();
        System.out.println("Задание №2.1:");
//        CarFactory.createZhigul(20);
//        CarFactory.createToyota(20);
//        Avto [] cars = new Avto[2];
//        for (int i = 0; i <= 20; i++) {
//
//        }
        Avto[] cars = new Avto[40];
        for (int i = 0; i <= 19; i++) {
            cars [i] = CarFactory.createToyota();
        }
        for (int i = 20; i <= 39; i++) {
            cars [i] = CarFactory.createZhiguli();
        }
        for (Avto car : cars) {
            if (car instanceof Toyota){

            }
        }








    }
}
