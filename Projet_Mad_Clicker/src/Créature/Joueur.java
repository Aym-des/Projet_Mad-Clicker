/**
 * @author Jorge Barata
 */
package Créature;

import Parametres.Parametres;

public class Joueur {

	private String nom;
	private int dpc;
	private int dps;
	private int niveau;
	private int pieces;
	private int nbVictimes;
	private int nbclics;
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
	 * @param degatparclic Le nouveau nombre de dégat par clic
	 */

	public void setDpc(int degatparclic) {
		dpc = dpc + degatparclic;
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
		
		if(nbpieces == 0){
			pieces = 0;
		}
		else{
		pieces = pieces + nbpieces;
		}
	}
	/**
	 * @return Le montant de l'experience du joueur
	 */
	public int getExperience(){
		return this.experience;
	}
	
	public void setExperience(int nbxp){
		if(nbxp == 0){
			experience = 0;
		}
		else{
			experience = experience + nbxp;
		}
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
		this.nbVictimes = this.nbVictimes + nb;
	}
	/**
	 * 
	 * @return Le nombre de clics effectués par le joueur
	 */
	public int getNbclics(){
		return this.nbclics;
	}
	/**
	 * 
	 * @param nb Le nombre  a rajouter au nombre de clics deja effectuer par le joueur
	 */
	public void setNbclics(int nb){
		this.nbclics = this.nbclics + nb;
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
		experience = param.DEFAULT_EXPERIENCE;
		nbVictimes = param.DEFAULT_NB_VICTIMES;
		nbclics = param.DEFAULT_NB_CLICS;
	}

}
