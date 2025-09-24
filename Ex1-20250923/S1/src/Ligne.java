import java.util.ArrayList;

public class Ligne {
    public ArrayList<LineProcessor> processors = new ArrayList<>();
    private String line;

    public Ligne(String line) {
        this.line = line;
    }

    public boolean registerProcessor(LineProcessor processor){
        return processors.add(processor);
    }

    public boolean unregisterProcessor(LineProcessor processor){
        return processors.remove(processor);
    }

    public void notifyProcessors(){
        for (LineProcessor processor : processors){
            processor.processLine(line);
        }
    }
}
