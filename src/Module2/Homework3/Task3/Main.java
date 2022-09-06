package Module2.Homework3.Task3;

import java.util.HashMap;

public class Main {
    //Задача №3
    //1. Создать класс CarBroken
    //2. Создать экземпляра класса HashMap<CarBroken, Integer>
    //3. Переопределить hashcode и equals так, чтобы при вставке любого CarBroken в HashMap,
    //всегда CarBroken попадал в один бакет.
    public static void main(String[] args) {
        CarBroken carBroken = new CarBroken();
        CarBroken carBroken1 = new CarBroken();
        CarBroken carBroken2 = new CarBroken();
        CarBroken carBroken3 = new CarBroken();
        CarBroken carBroken4 = new CarBroken();
        CarBroken carBroken5 = new CarBroken();
        CarBroken carBroken6 = new CarBroken();
        HashMap<CarBroken, Integer> carBrokenIntegerHashMap = new HashMap<>();
        carBrokenIntegerHashMap.put(carBroken,1);
        carBrokenIntegerHashMap.put(carBroken2,1);
        carBrokenIntegerHashMap.put(carBroken3,1);
        carBrokenIntegerHashMap.put(carBroken4,1);
        carBrokenIntegerHashMap.put(carBroken5,1);
        carBrokenIntegerHashMap.put(carBroken6,1);
        System.out.println(carBrokenIntegerHashMap);
    }
}
