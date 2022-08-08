package Homework4.AdvancedTask1;

public class Fir extends Tree implements Smellable {
    boolean gotCones;

    public Fir() {
        this.gotCones = true;
    }

    public void smell(){
        System.out.println("ель : умееть пахнуть");
    }
}
