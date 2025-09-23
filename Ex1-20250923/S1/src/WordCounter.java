public class WordCounter extends LineProcessor {
    private int nbrWords = 0;
    public WordCounter(String currentLine) {
        super(currentLine);
    }

    @Override
    public boolean processLine() {
        return false;
    }

    public int getNbrWords() {
        return nbrWords;
    }
}
