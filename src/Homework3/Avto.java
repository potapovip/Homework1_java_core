package Homework3;

public abstract class Avto {
    String carBrand;

    public Avto() {
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void startMoving(){
        System.out.println(carBrand + " начала движение");
    }
    public void stopMoving(){
        System.out.println(carBrand + " остановилась");
    }
    public void useHeadlights(){
        System.out.println(carBrand + " включила фары");
    }

}
