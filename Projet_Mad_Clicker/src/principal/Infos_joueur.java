/**
 * 
 */
package principal;

/**
 * @author Aymeric
 *La classe Infos_joueur cotient les information relative au joueur sous forme de chaines de caractères.
 */
public class Infos_joueur {
	
	/**
	 * @param niveau Le niveau du joueur
	 */
	protected String niveau;
	
	/**
	 * @param dpc Le nombre de degats par clic
	 */
	protected String dpc;
	
	/**
	 * @param dps Le nombre de degats par seconde
	 */
	protected String dps;
	
	/**
	 * @param pieces Le nombre de pieces dont dispose le joueur
	 */
	protected String pieces;
	
	/*
	 * GETTERS AND SETTERS
	 * ****************************
	 */
	
	/**
	 * @return the niveau
	 */
	public String getNiveau() {
		return niveau;
	}
	/**
	 * @param lvl the niveau to set
	 */
	public void setNiveau(int lvl) {
		this.niveau = Integer.toString(lvl);
	}
	/**
	 * @return the dpc
	 */
	public String getDpc() {
		return dpc;
	}
	/**
	 * @param degparclic the dpc to set
	 */
	public void setDpc(int degparclic) {
		this.dpc = Integer.toString(degparclic);
	}
	/**
	 * @return the dps
	 */
	public String getDps() {
		return dps;
	}
	/**
	 * @param degparsec the dps to set
	 */
	public void setDps(int degparsec) {
		this.dps = Integer.toString(degparsec);
	}
	/**
	 * @return the pieces
	 */
	public String getPieces() {
		return pieces;
	}
	/**
	 * @param nbpieces the pieces to set
	 */
	public void setPieces(int nbpieces) {
		this.pieces = Integer.toString(nbpieces);
	}
	/*
	 * Fin getters and setters
	 * **********************************
	 */
	
	/*
	 * CONSTRUCTEUR
	 */
	
	Infos_joueur(int lvl, int degparclic, int degparsec, int nbpieces){
		this.niveau = Integer.toString(lvl);
		this.dpc = Integer.toString(degparclic);
		this.dps = Integer.toString(degparsec);
		this.pieces = Integer.toString(nbpieces);
	}
	
	
}
