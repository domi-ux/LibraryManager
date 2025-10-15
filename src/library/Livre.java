
package library;

public class Livre {
	private String titre;
	private String auteur;
	private boolean emprunte;
	public Livre(String titre, String auteur) {
		this.titre = titre;
		this.auteur = auteur;
		this.emprunte = false;
		}
	public void emprunter() { emprunte = true; }
	public void retourner() { emprunte = false; }
	@Override
	public String toString() {
		return titre + " - " + auteur + (emprunte ? " (emprunté)" : "");
		}

}
