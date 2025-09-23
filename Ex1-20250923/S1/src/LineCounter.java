public class LineCounter extends LineProcessor {
    private int lineCounter = 0;
    public LineCounter(int currentLine) {
        super(currentLine);
    }

    @Override
    public boolean processLine() {
        return false;
    }

    public int getLineCounter() {
        return lineCounter;
    }
}
