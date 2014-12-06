/**
 * @author Jorge Barata
 */
package Créature;

public class Joueur {

	private String nom;
	private static int dpc;
	private static int dps;
	private int niveau;
	
	//***** GETTERS & SETTERS *****
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static int getDpc() {
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
	//*****************************
	
	/**
	 * Constructeur de l'objet Joueur
	 */
	public Joueur(){
		this.nom = "";
		this.dpc = 1;
		this.dps = 0;
		this.niveau = 1;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
