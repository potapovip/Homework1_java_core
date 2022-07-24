public class Workers {
    private String name;
    private int journal;
    private Storehouse storehouse;

    public Workers(String nameOfWorker, int journalOfWorker, Storehouse storehouse) {
        this.name = nameOfWorker;
        this.journal = journalOfWorker;
        this.storehouse = storehouse;


    }

    public String getName() {
        return name;
    }

    public int getJournal() {
        return journal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJournal(int journal) {
        this.journal = journal;
    }

    public void takeVodka(int ammountVodka) {
        if (storehouse.getQuantity() > 0) {
            storehouse.setQuantity(storehouse.getQuantity() - ammountVodka);
            setJournal(getJournal() + ammountVodka);
            System.out.println("Ура я испортил водку!");
        }
    }

}
