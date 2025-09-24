import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AnalyseurDeTexte {
    public static void main(String[] args) throws IOException {
		BufferedReader lecteurAvecBuffer = null;
		String ligne;
		try {
			lecteurAvecBuffer = new BufferedReader(new FileReader(args[0]));
		} catch (FileNotFoundException e) {
			System.out.println("Erreur d'ouverture");
		}
        LineProcessor belgiumLineCounter= new BelgiumLineCounter();
        LineProcessor lineCounter= new LineCounter();
        LineProcessor palindromeCounter= new PalindromeCounter();
        LineProcessor wordCounter= new WordCounter();
        LineProcessor regexCounter = new RegexCounter();
        LineProcessor eachWordCounter = new EachWordCounter();

		while ((ligne = lecteurAvecBuffer.readLine()) != null) {
            Ligne ligneSubject = new Ligne(ligne);
            ligneSubject.registerProcessor(belgiumLineCounter);
            ligneSubject.registerProcessor(lineCounter);
            ligneSubject.registerProcessor(palindromeCounter);
            ligneSubject.registerProcessor(wordCounter);
            ligneSubject.registerProcessor(regexCounter);
            ligneSubject.registerProcessor(eachWordCounter);
            ligneSubject.notifyProcessors();
		}
		lecteurAvecBuffer.close();
		System.out.println("Il y avait " + ((LineCounter)lineCounter).getLineCounter() + " lignes.");
		System.out.println("Il y avait " + ((WordCounter)wordCounter).getNbrWords() + " mots.");
		System.out.println("Il y avait " + ((PalindromeCounter)palindromeCounter).getNbrPalindromes() + " palindromes.");
		System.out.println("Il y avait " + ((BelgiumLineCounter)belgiumLineCounter).getNbrBelgium() + " lignes contenant Belgique.");
        System.out.println("Il y avait " + ((RegexCounter)regexCounter).getNbrLineMatchingRegex() + " lignes contenant au moins 1 nombre.");
        System.out.println("Il y avait " + ("Map montrant le nombre de fois que chaque mot apparait dans le texte : " + (EachWordCounter)eachWordCounter).toString());

	}
}
