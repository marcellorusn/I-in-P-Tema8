public class Commercial extends Project {
    int nrEchipe;
    long fonduriMarketing;

    public Commercial(String titlu, String obiectiv, long fonduri, Member manager, int nrEchipe) {
        super(titlu, obiectiv, fonduri, manager);
        this.nrEchipe = nrEchipe;
        this.fonduriMarketing = fonduri / 2;
    }

    @Override
    public double getRisk() {
        return (nrEchipe * 3.0) / count / getFonduri() - fonduriMarketing;
    }
}