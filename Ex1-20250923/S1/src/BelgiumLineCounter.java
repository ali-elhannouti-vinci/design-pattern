public class BelgiumLineCounter implements LineProcessor {
    private int nbrBelgium = 0;

    public BelgiumLineCounter() {
    }

    @Override
    public void processLine(String line) {
        if (line.contains("Belgique")) {
            nbrBelgium++;
        }
    }

    public int getNbrBelgium() {
        return nbrBelgium;
    }
}
