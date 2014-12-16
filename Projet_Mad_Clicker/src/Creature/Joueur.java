/**
 * @author Jorge Barata
 */
package Creature;

import Parametres.Parametres;

public class Joueur {

	private String nom;
	private int dpc;
	private int dps;
	private int niveau;
	private int pieces;
	private int nbVictimes;
	private int experience;
	
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
	 * @param degatparclic Le nombre de dégats par clics dont le joueur disposera
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
	 * @param nbpieces Le nombre de pieces dont le joueur disposera
	 */

	public void setPieces(int nbpieces) {
		pieces = nbpieces;
	}
	/**
	 * @return Le montant de l'experience du joueur
	 */
	public int getExperience(){
		return this.experience;
	}
	
	/**
	 * @param nbxp Le nombre d'expérience qu'aura le joueur
	 */
	public void setExperience(int nbxp){
			experience = nbxp;
	}
	/**
	 * 
	 * @return Le nombre de victimes du joueur
	 */
	public int getNbVictimes(){
		return this.nbVictimes;
	}
	/**
	 * 
	 * @param nb Le nombre à rajouter au nombre actuel de victimes
	 */
	public void setNbVictimes(int nb){
		this.nbVictimes = nb;
	}
	
	//*****************************
	
	/**
	 * Constructeur Sans paramètres de la classe Joueur
	 */
	public Joueur(){
		nom = "Nouveau Joueur";
		niveau = 0;
		dpc = 0;
		dps = 0;
		pieces = 0;
		experience = 0;
		nbVictimes = 0;
	}
	
	/**
	 * Constructeur utilisé par défaut de l'objet Joueur
	 * @param param Les parametres utilisés pour initialiser les attributs du joueur
	 */
	public Joueur(Parametres param){
		nom = param.DEFAULT_NAME;
		niveau = param.DEFAULT_NIVEAU;
		dpc = param.DEFAULT_DPC;
		dps = param.DEFAULT_DPS;
		pieces = param.DEFAULT_PIECES;
		experience = param.DEFAULT_EXPERIENCE;
		nbVictimes = param.DEFAULT_NB_VICTIMES;
	}
	
	
	

}
