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
    public void fly () throws FlyException{
        if(countPassengers<0){
            throw new FlyException("Ошибка: пассажиров в самолете меньше 0");

        }
        System.out.println("Самолет летит");
    }
}
