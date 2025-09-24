public class WordCounter implements LineProcessor {
    private int nbrWords = 0;

    public WordCounter() {
    }

    @Override
    public void processLine(String line) {
        for (String mot : line.trim().split(" ")) {
            nbrWords++;
        }
    }

    public int getNbrWords() {
        return nbrWords;
    }
}
