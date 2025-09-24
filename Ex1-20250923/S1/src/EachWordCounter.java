import java.util.HashMap;
import java.util.Map;

public class EachWordCounter implements LineProcessor {
    Map<String,Integer> wordCountMap = new HashMap<>();

    public EachWordCounter() {
    }

    @Override
    public void processLine(String line) {
        for (String mot : line.trim().split("[ ,;:.!?]")) {
            wordCountMap.merge(mot, 1, Integer::sum);
        }
    }

    @Override
    public String toString() {
        return "EachWordCounter{" +
                "wordCountMap=" + wordCountMap +
                '}';
    }
}
