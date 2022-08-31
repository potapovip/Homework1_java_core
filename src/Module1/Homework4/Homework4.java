package Module1.Homework4;

import Module1.Homework4.AdvancedTask1.*;
import Module1.Homework4.AdvancedTask2.*;
import Module1.Homework4.SimpleTask1.Airplane;
import Module1.Homework4.SimpleTask1.Duck;
import Module1.Homework4.SimpleTask1.FlyException;
import Module1.Homework4.SimpleTask1.Flyable;

public class Homework4 {
    public static void main(String[] args)  {
//Базовый уровень
        //Задача №1
        System.out.println("Задача №1.1:");

        Duck duck2 = new Duck(false);
        Duck duck1 = new Duck(true);
        Airplane airplane1 = new Airplane(10);
        Airplane airplane2 = new Airplane(-1);
        Flyable[] flyables = {duck2, duck1, airplane1, airplane2};
        for (Flyable flyable : flyables) {
            try {
                flyable.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("Задача №2.1:");
        //Продвинутый уровень
        //Задача №1
        Fern fern = new Fern();
        Fir fir = new Fir();
        Pine pine = new Pine();
        Rose rose = new Rose();
        Smellable[] smellables = {fir, pine,rose};
        Blossomable[] blossomables = {fern,rose};
        for (Smellable smellable : smellables) {
            smellable.smell();
        }
        for (Blossomable blossomable : blossomables) {
            blossomable.blossom();
        }

        System.out.println();
        System.out.println("Задача №2.2:");
        //Задача №2
        //2. Создать следующую структуру из классов и интерфейсов
        // магазин (обладает работниками)
        // работник (обладает часами - (часы одни))
        // часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
        // Бренд (обладает массивом магазинов)
        // Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
        // у каждого работника по часам. У одного работника часы сломаны, у второго нет.
        // После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
        // обработать ошибку сломанных часов.
        // Ожидание вывода на экран:
        // Часы тикают
        // Ошибка: Часы сломались.
        Watch brokenWatch = new Watch(true);
        Watch watch = new Watch(false);
        Worker worker1 = new Worker(watch);
        Worker worker2 = new Worker(brokenWatch);
        Worker [] workersShop1 ={worker1};
        Worker [] workersShop2 = {worker2};
        Shop shop1 =new Shop (workersShop1);
        Shop shop2 =new Shop (workersShop2);
        Shop [] shops = {shop1,shop2};
        Brand wallmart = new Brand(shops);

        for (Shop shop : wallmart.getShops()) {
            for (Worker shopWorker : shop.getWorkers()) {
                Watch workerWotch = shopWorker.getWatch();
                try {
                    workerWotch.tick();
                } catch (WatchBrokenError watchBrokenError) {
                    System.out.println("Ошибка: Часы сломались.");
                }
            }

        }


    }
}
