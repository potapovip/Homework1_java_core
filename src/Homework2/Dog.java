package Homework2;

public class Dog {
    String name;
    double weight;

    public Dog(String dogName, double dogWeight){
        this.name = dogName;
        weight = dogWeight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
