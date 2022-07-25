public class Storehouse {
    private int quantity;

    public Storehouse() {
        this.quantity = 100;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void minusVodka (int takenVodka){
        setQuantity(getQuantity()-takenVodka);
    }
}
