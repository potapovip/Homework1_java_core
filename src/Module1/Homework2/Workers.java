package Module1.Homework2;

public class Workers {
    private String name;
    private int journal;
    private Storehouse storehouse;


    public Workers(String nameOfWorker, int journalOfWorker) {
        this.name = nameOfWorker;
        this.journal = journalOfWorker;
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

    public void takeVodka(int ammountVodka, Storehouse storehouse) {
        storehouse.minusVodka(ammountVodka);
        journal += ammountVodka;
        System.out.println("Ура я испортил водку!");

    }

}
