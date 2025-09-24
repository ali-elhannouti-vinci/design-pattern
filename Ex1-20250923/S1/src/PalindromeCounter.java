public class PalindromeCounter implements LineProcessor {
    private int nbrPalindromes = 0;

    public PalindromeCounter() {
    }

    @Override
    public void processLine(String line) {
        for (String mot : line.trim().split(" ")) {
            StringBuffer temp = new StringBuffer(mot);
            if (mot.equals(temp.reverse().toString())) {
                nbrPalindromes++;
            }
        }
    }

    public int getNbrPalindromes() {
        return nbrPalindromes;
    }
}
