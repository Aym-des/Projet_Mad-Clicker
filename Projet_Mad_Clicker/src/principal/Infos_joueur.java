/**
 * 
 */
package principal;

/**
 * @author Aymeric
 *La classe Infos_joueur cotient les information relative au joueur sous forme de chaines de caractères.
 */

////////////////////////////////////////////////
// A voir si vraiment nécéssaire !!!
//En effet, Vu que pour afficher il faut d'office passer la chaine manuelement
//Pourquoi ne pas implementer directement ces setters  dans la classes JFramepartie final????
//Ca réduirait peut etre le nombre d'instruction a chaque changement d'une des valeur 

//Enlever les commentaires des attributs PRIVATE et PROTECTED --> Inutiles
//////////////////////////////////////////////////

//// CLASSE A SUPPRIMER///////////


public class Infos_joueur {
	
	/**
	 * Le nom du joueur
	 */
	protected String nom;
	/**
	 * Le niveau du joueur
	 */
	protected String niveau;	
	/**
	 * Le nombre de degats par clic
	 */
	protected String dpc;	
	/**
	 * Le nombre de degats par seconde
	 */
	protected String dps;	
	/**
	 * Le nombre de pieces dont dispose le joueur
	 */
	protected String pieces;
	
	/*
	 * GETTERS AND SETTERS
	 * ****************************
	 */
	
	/**
	 * @return nom Le nom du joueur
	 */
	public String getNom(){
		return nom;
	}
	
	/**
	 * @param name Le nom a donner au joueur
	 */
	public void setNom(String name){
		this.nom = name;
	}
	
	/**
	 * @return niveau Le niveau du joueur
	 */
	public String getNiveau() {
		return niveau;
	}
	/**
	 * @param lvl Le niveau a donner au joueur
	 */
	public void setNiveau(int lvl) {
		this.niveau = Integer.toString(lvl);
	}
	/**
	 * @return dpc Le nombre de degats par clics
	 */
	public String getDpc() {
		return dpc;
	}
	/**
	 * @param degparclic Le nombre de degats par clics a donner au joueur
	 */
	public void setDpc(int degparclic) {
		this.dpc = Integer.toString(degparclic);
	}
	/**
	 * @return dps Le nombre de dps
	 */
	public String getDps() {
		return dps;
	}
	/**
	 * @param degparsec Le nombre de degats par seconde a donner au joueur
	 */
	public void setDps(int degparsec) {
		this.dps = Integer.toString(degparsec);
	}
	/**
	 * @return pieces Le nombre de pieces dont dispose le joueur
	 */
	public String getPieces() {
		return pieces;
	}
	/**
	 * @param nbpieces Le nombre de pieces qu'aura le joueur
	 */
	public void setPieces(int nbpieces) {
		this.pieces = Integer.toString(nbpieces);
	}
	/*
	 * FIN GETTERS AND SETTERS
	 * **********************************
	 */
	
	/*
	 * CONSTRUCTEUR DE BASE
	 */
	
	Infos_joueur(String name, int lvl, int degparclic, int degparsec, int nbpieces){
		this.nom = name;
		this.niveau = Integer.toString(lvl);
		this.dpc = Integer.toString(degparclic);
		this.dps = Integer.toString(degparsec);
		this.pieces = Integer.toString(nbpieces);
	}
	
	
}
