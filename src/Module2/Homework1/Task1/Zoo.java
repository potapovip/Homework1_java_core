package Module2.Homework1.Task1;

public class Zoo <F extends Flyable, S extends Swimable, B extends Bitable > {
private F flyableAnimal;
private S swimableAnimal;
private B bitableAnimal;

    public Zoo(F flyableAnimal, S swimableAnimal, B bitableAnimal) {
        this.flyableAnimal = flyableAnimal;
        this.swimableAnimal = swimableAnimal;
        this.bitableAnimal = bitableAnimal;
    }

    public Zoo() {
    }

    public F getFlyableAnimal() {
        return flyableAnimal;
    }

    public void setFlyableAnimal(F flyableAnimal) {
        this.flyableAnimal = flyableAnimal;
    }

    public S getSwimableAnimal() {
        return swimableAnimal;
    }

    public void setSwimableAnimal(S swimableAnimal) {
        this.swimableAnimal = swimableAnimal;
    }

    public B getBitableAnimal() {
        return bitableAnimal;
    }

    public void setBitableAnimal(B bitableAnimal) {
        this.bitableAnimal = bitableAnimal;
    }
    //Зоопарк имеет методы - void feedFlyable(),void feedSwimable(),void feedBitable(). Логика внутри метода:
    //Печать на экран "летающее животное ест", вызов у животного метода fly() и тд.
    public void feedFlyable(){
        System.out.println( "летающее животное ест");
        flyableAnimal.fly();
    }
    public void feedSwimable(){
        System.out.println("плавающее животное ест");
        swimableAnimal.swim();
    }
    public void feedBitable(){
        System.out.println("кусающее животное ест");
        bitableAnimal.bite();
    }
}

