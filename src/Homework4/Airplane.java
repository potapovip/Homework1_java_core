package Homework4;

public class Airplane implements Flyable{
    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }
    public void fly (){
        System.out.println("Самолет летит");
    }
}
