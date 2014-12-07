/**
 * @author Jorge Barata
 */
package Créature;

public class Joueur {

	private String nom;
	private static int dpc;
	private static int dps;
	private int niveau;
	private int pieces;
	
	//***** GETTERS & SETTERS *****
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDpc() {
		return dpc;
	}

	public void setDpc(int dpc) {
		this.dpc = dpc;
	}

	public int getDps() {
		return dps;
	}

	public void setDps(int dps) {
		this.dps = dps;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}
	//*****************************
	
	/**
	 * Constructeur sans argument de l'objet Joueur
	 */
	public Joueur(){
		this.nom = "";
		this.dpc = 1;
		this.dps = 0;
		this.niveau = 1;
	}

}
