public class BelgiumLineCounter extends LineProcessor {
    private int nbrBelgium;

    public BelgiumLineCounter(int currentLine) {
        super(currentLine);
    }

    @Override
    public boolean processLine() {
        return false;
    }

    public int getNbrBelgium() {
        return nbrBelgium;
    }
}
