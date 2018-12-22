import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LireReport {
	
	LinkedList<String> lstF
	
	public LireReport (String nomFichier) {
		lireFichier(nomFichier);
	}
	
	String lireFichier(String nomFichier) throws IOException {
		BufferedReader reader = new BufferedReader(
		new FileReader("fichier.txt"));
		String res = "";
		String ligne;
		while ((ligne = reader.readLine()) != null) {
		res += ligne + "\n";
		}
		return res;
		}

}
