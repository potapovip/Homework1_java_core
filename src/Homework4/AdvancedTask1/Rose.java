package Homework4.AdvancedTask1;

public class Rose extends Plant implements Blossomable, Smellable{
    @Override
    public void smell() {
        System.out.println("роза: умееть пахнуть");
    }

    @Override
    public void blossom() {
        System.out.println("роза: умеет цвести");
    }
}
