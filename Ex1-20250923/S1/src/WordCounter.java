public class WordCounter extends LineProcessor {
    private int nbrWords = 0;
    public WordCounter(int currentLine) {
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
