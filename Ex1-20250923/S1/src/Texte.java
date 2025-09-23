import java.util.ArrayList;

public class Texte {
    public ArrayList<LineProcessor> processors = new ArrayList<>();

    public Texte() {
    }

    public boolean registerProcessor(LineProcessor processor){
        return processors.add(processor);
    }

    public boolean unregisterProcessor(LineProcessor processor){
        return processors.remove(processor);
    }

    public boolean notifyProcessors(){
        for (LineProcessor processor : processors){
            boolean processResult = processor.processLine();
            if (!processResult){
                return false;
            }
        }
        return true;
    }

}
