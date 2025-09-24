public class LineCounter implements LineProcessor {
    private int lineCounter = 0;

    public LineCounter() {
    }

    public int getLineCounter() {
        return lineCounter;
    }

    @Override
    public void processLine(String line) {
        lineCounter++;
    }
}
