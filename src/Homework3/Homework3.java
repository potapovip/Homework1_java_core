package Homework3;



import java.io.*;
import java.util.Random;


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
        Financial_record financial_record = new Financial_record(500, 300);
        String pathToReport = "C:\\java\\yury_courses\\Homework1_java_core\\src\\Homework3\\report.txt"; //путь для домашнего ПК
//        String pathToReport = "C:\\java\\java_core\\src\\Homework3\\report.txt";
        FileWriter fileWriter = new FileWriter(pathToReport);
        fileWriter.write("доходы = " + financial_record.getIncomes() + "\n" + "расходы = " + financial_record.getOutcomes());
        fileWriter.close();
        System.out.println("Данные записаны в report.txt");

        //Продвинутый уровень
        //Задача №1
        System.out.println();
        System.out.println("Задание №2.1:");
        Avto[] cars = new Avto[40];
        System.arraycopy(CarFactory.createToyota2(20), 0, cars, 0, 20);
        System.arraycopy(CarFactory.createZhiguli2(20), 0, cars, 20, 20);


//        for (int i = 0; i <= 19; i++) {
//            cars [i] = CarFactory.createToyota();
//        }
//        for (int i = 20; i <= 39; i++) {
//            cars [i] = CarFactory.createZhiguli();
//        }
        for (Avto car : cars) {
            if (car instanceof Toyota) {
                Toyota car1 = (Toyota) car;
                car1.turnMusikOn();
            } else if (car instanceof Zhiguli) {
                Zhiguli car1 = (Zhiguli) car;
                car1.Broke();
            }
        }

        //Задача №2
        System.out.println();
        System.out.println("Задание №2.2:");
        Random random = new Random(1);
        Financial_record[] financial_record2 = new Financial_record[10];
        for (int i = 0; i < financial_record2.length; i++) {
            financial_record2[i] = new Financial_record(random.nextInt(10000), random.nextInt(10000));
        }
        fileWriter = new FileWriter(pathToReport);

        for (Financial_record record : financial_record2) {
            fileWriter.write(record.serialize());
        }
        fileWriter.close();
        int totalIncomes = 0;
        int totalOutcomes = 0;
        fileReader = new FileReader(pathToReport);
        BufferedReader reader = new BufferedReader(fileReader);
        while (reader.ready()) {
            String s = reader.readLine();
            if (!s.isEmpty()) {
                String[] split = s.split(";");
                int incomes = Integer.parseInt(split[0]);
                int outcomes = Integer.parseInt(split[1]);
                totalIncomes += incomes;
                totalOutcomes += outcomes;
            }
        }
        System.out.println("общие доходы - " + totalIncomes + "\n"+
                "общие расходы - " +
                totalOutcomes);

    }
}
