package Homework4;

public class Duck implements Flyable {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    public void fly() throws FlyException {
        if(isInjured) {
            throw new FlyException("Ошибка: утка ранена");

        }
        System.out.println("Утка летит");
    }
}
