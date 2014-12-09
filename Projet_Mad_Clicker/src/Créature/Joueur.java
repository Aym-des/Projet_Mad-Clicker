/**
 * @author Jorge Barata
 */
package Créature;

public class Joueur {

	private String nom;
	private static int dpc;
	private static int dps;
	private static int niveau;
	private static int pieces;
	
	//***** GETTERS & SETTERS *****
	
	/**
	 * @return Le nom du Joueur
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * @param nom Le nom à donner au joueur
	 */

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * @return Les dégats par clic
	 */

	public int getDpc() {
		return dpc;
	}
	
	/**
	 * @param degatparclic Le nouveau nombre de dégat par clic
	 */

	public void setDpc(int degatparclic) {
		dpc = degatparclic;
	}
	
	/**
	 * @return Le nombre de dégats par seconde
	 */

	public int getDps() {
		return dps;
	}
	
	/**
	 * @param degatparsec Le nouveau nombre de dégat par seconde
	 */

	public void setDps(int degatparsec) {
		dps = degatparsec;
	}
	
	/**
	 * @return Le niveau du joueur
	 */

	public int getNiveau() {
		return niveau;
	}
	
	/**
	 * @param lvl Le nouveau niveau du joueur
	 */

	public void setNiveau(int lvl) {
		niveau = lvl;
	}
	
	/**
	 * @return Le nombre de pieces dont le joueur dispose
	 */
	
	public int getPieces() {
		return pieces;
	}
	
	/**
	 * @param nbpieces Le nouveau nombre de pièces donc le joueur dispose
	 */

	public void setPieces(int nbpieces) {
		pieces = nbpieces;
	}
	//*****************************
	
	/**
	 * Constructeur sans argument de l'objet Joueur
	 */
	public Joueur(){
		this.nom = "";
		setDpc(1);
		setDps(0);
		setNiveau(1);
		setPieces(0);
	}

}
