public class Workers {
    String name;
    int journal;

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
}
