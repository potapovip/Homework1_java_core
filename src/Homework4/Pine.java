package Homework4;

public class Pine extends Tree implements Smellable{
    boolean gotCones;
    public Pine(){
        this.gotCones = true;
    }

    @Override
    public void smell() {
        System.out.println("сосна : умеет пахнуть");
    }
}
