package library;
import java.util.*;

public class Bibliotheque {

	private List<Livre> livres = new ArrayList<>();
	
	public void ajouter(Livre l) { livres.add(l); }
	
	public List<Livre> rechercherParAuteur(String auteur) {
		List<Livre> res = new ArrayList<>();
		for (Livre l : livres)
			if (l.toString().contains(auteur)) res.add(l);
		return res;
	}
}