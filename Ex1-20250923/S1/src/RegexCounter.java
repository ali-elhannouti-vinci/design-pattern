import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCounter implements LineProcessor {

    private int nbrLineMatchingRegex = 0;
    public RegexCounter() {
    }

    @Override
    public void processLine(String line) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()){
            nbrLineMatchingRegex++;
        }
    }

    public int getNbrLineMatchingRegex() {
        return nbrLineMatchingRegex;
    }
}
