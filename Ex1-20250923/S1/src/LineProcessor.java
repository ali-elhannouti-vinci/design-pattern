public abstract class LineProcessor {
    private int currentLine;

    public LineProcessor(int currentLine) {
        this.currentLine = currentLine;
    }

    public abstract boolean processLine();

    public int getCurrentLine() {
        return currentLine;
    }

    public void setCurrentLine(int currentLine) {
        this.currentLine = currentLine;
    }


}
