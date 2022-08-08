package Homework4.AdvancedTask2;

public class Watch implements Tickable {
    boolean hasBroken;

    public Watch(boolean hasBroken) {
        this.hasBroken = hasBroken;
    }



    @Override
    public void tick() throws WatchBrokenError{
        if (!hasBroken) {
            System.out.println("Часы тикают");
        }else throw new WatchBrokenError();
    }
}
