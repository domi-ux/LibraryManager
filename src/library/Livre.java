
package library;
	//New modif 1
public class Livre {
	private String titre;
	private String ecrivain;
	private boolean emprunte;
	public Livre(String titre, String auteur) {
		this.titre = titre;
		this.ecrivain = auteur;
		this.emprunte = false;
		}
	public void emprunter() { emprunte = true; }
	public void retourner() { emprunte = false; }
	@Override
	public String toString() {
		return titre + " - " + ecrivain + (emprunte ? " (emprunté)" : "");
		}

}
