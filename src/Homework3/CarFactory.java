package Homework3;

public class CarFactory {
    private static int toyotaCount = 0;
    private static int zhigulisCount = 0;


    //    public static void createToyota(int carsQuantity) {
//    Toyota[] toyotas = new Toyota[carsQuantity];
//        for (int i = 0; i <= carsQuantity; i++) {
//            toyotas[i] = new Toyota();
//            toyotaCount++;
//        }
//    }
//    public static void createZhigul (int carsQuantity){
//        Zhiguli[] zhigulis = new Zhiguli[carsQuantity];
//        for (int i = 0; i <= carsQuantity; i++) {
//            zhigulis[i] = new Zhiguli();
//            zhigulisCount++;
//        }
//    }
    public static Toyota createToyota () {
       return new Toyota();
    }
    public static Zhiguli createZhiguli () {
       return new Zhiguli();
    }
}
