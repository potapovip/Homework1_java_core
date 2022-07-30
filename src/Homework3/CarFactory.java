package Homework3;

public class CarFactory {


        public static Toyota[] createToyota2 (int carsQuantity) {
    Toyota[] toyotas = new Toyota[carsQuantity];
        for (int i = 0; i < carsQuantity; i++) {
            toyotas[i] = new Toyota();
        }
        return toyotas;
    }
    public static Zhiguli[] createZhiguli2 (int carsQuantity) {
    Zhiguli[] zhigulis = new Zhiguli[carsQuantity];
        for (int i = 0; i < carsQuantity; i++) {
            zhigulis[i] = new Zhiguli();
        }
        return zhigulis;
    }

    public static Toyota createToyota () {
        return new Toyota();
    }
    public static Zhiguli createZhiguli () {
       return new Zhiguli();
    }
}
