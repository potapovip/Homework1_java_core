package Homework3;


import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Homework3 {
    public static void main(String[] args) throws IOException {
        //Базовый уровень
        //Задача №1
        System.out.println("Задание №1:");
        Toyota toyota = new Toyota("toyota");
        Zhiguli zhiguli = new Zhiguli("Zhiguli");
        zhiguli.startMoving();
        zhiguli.stopMoving();
        zhiguli.useHeadlights();
        zhiguli.Broke();
        toyota.turnMusikOn();


        //Задача №2
        System.out.println();
        System.out.println("Задание №2:");

        String filePath = "C:\\java\\yury_courses\\Homework1_java_core\\src\\Homework3\\my_first_file.txt";
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
        String pathToReport = "C:\\java\\yury_courses\\Homework1_java_core\\src\\Homework3\\report.txt";
        FileWriter fileWriter = new FileWriter(pathToReport);
        fileWriter.write("доходы = " + financial_record.getIncomes()+ "\n" + "расходы = "+ financial_record.getOutcomes());
        fileWriter.close();
        System.out.println("Данные записаны в report.txt");

    }
}
