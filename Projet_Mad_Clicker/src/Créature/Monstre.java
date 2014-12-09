/**
 * @author Jorge
 */
package Cr�ature;

/**
 * La classe Monstre permet de caract�riser un objet Monstre avec un nom, des points de vie, un niveau et un statut.
 */
//On peut aussi cr�er un tableau de monstres en semi-hardcod�.
public class Monstre {
	protected String nom;
	protected int pdv; 
	protected int niveau;
	//private int statut;	A int�grer plut�t dans Boss et Sbire?
	
	public Monstre(){
		
	}
	
	public Monstre(String nom, int pdv, int niveau) {
		this.nom = "";
		this.pdv = 0;
		this.niveau = 0;
	}
	
	//***** GETTERS & SETTERS *****
	/**
	 * @return nom
	 * Retourne le nom du monstre
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 * Donne un nom � un monstre
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * @return pdv
	 * Retourne les points de vie actuels du monstre
	 */
	public int getPdv() {
		return pdv;
	}

	/**
	 * @param pdv
	 * Donne des points de vie � un monstre
	 */
	public void setPdv(int pdv) {
		this.pdv = pdv;
	}

	/**
	 * @return niveau
	 * Retourne le niveau actuel du monstre
	 */
	public int getNiveau() {
		return niveau;
	}

	/**
	 * @param niveau
	 * Donne un niveau � un monstre
	 */
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	/**
	 * @return statut
	 * Retourne le statut actuel du monstre
	 * Sbire si statut=1 ou boss si statut=0
	 */
	/*
	public int getStatut() {
		return statut;
	}
	*/
	
	/**
	 * @param statut
	 * Permet d'identifier si le monstre est
	 * un sbire (statut=0) ou un boss(statut=1)
	 */
	/*
	public void setStatut(int statut) {
		this.statut = statut;
	}
	*/
	//*****************************
	
	/**
	 * @param args Arguments � passer eventuellement
	 */
	public static void main(String[] args) {
		Monstre monstre = new Monstre();
		
	}
}
