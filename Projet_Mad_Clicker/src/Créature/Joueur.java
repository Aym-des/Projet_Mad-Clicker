/**
 * @author Jorge Barata
 */
package Cr�ature;

import Parametres.Parametres;

public class Joueur {

	private String nom;
	private int dpc;
	private int dps;
	private int niveau;
	private int pieces;
	
	//***** GETTERS & SETTERS *****
	
	/**
	 * @return Le nom du Joueur
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * @param nom Le nom � donner au joueur
	 */

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * @return Les d�gats par clic
	 */

	public int getDpc() {
		return dpc;
	}
	
	/**
	 * @param degatparclic Le nouveau nombre de d�gat par clic
	 */

	public void setDpc(int degatparclic) {
		dpc = degatparclic;
	}
	
	/**
	 * @return Le nombre de d�gats par seconde
	 */

	public int getDps() {
		return dps;
	}
	
	/**
	 * @param degatparsec Le nouveau nombre de d�gat par seconde
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
	 * @param nbpieces Le nouveau nombre de pi�ces donc le joueur dispose
	 */

	public void setPieces(int nbpieces) {
		pieces = nbpieces;
	}
	//*****************************
	
	/**
	 * Constructeur de l'objet Joueur
	 */
	public Joueur(Parametres param){
		nom = param.DEFAULT_NAME;
		niveau = param.DEFAULT_NIVEAU;
		dpc = param.DEFAULT_DPC;
		dps = param.DEFAULT_DPS;
		pieces = param.DEFAULT_PIECES;
	}

}
