public class PalindromesCounter extends LineProcessor {
    private int nbrPalindromes = 0;
    public PalindromesCounter(String currentLine) {
        super(currentLine);
    }

    @Override
    public boolean processLine() {
        return false;
    }

    public int getNbrPalindromes() {
        return nbrPalindromes;
    }
}
