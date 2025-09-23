public abstract class LineProcessor {
    private String currentLine;

    public LineProcessor(String currentLine) {
        this.currentLine = currentLine;
    }

    public abstract boolean processLine();

    public String getCurrentLine() {
        return currentLine;
    }

    public void setCurrentLine(String currentLine) {
        this.currentLine = currentLine;
    }


}
