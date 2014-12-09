/**
 * @author Jorge
 */
package Cr�ature;

/**
 * La classe Monstre permet de caract�riser un objet Monstre avec un nom, des points de vie, un niveau et un statut.
 */
//On peut aussi cr�er un tableau de monstres en semi-hardcod�.
public class Monstre {
	
	/**
	 * @param nom Le nom du monstre
	 */	
	private String nom;
	
	/**
	 * @param pdv Les points de vie du monstre
	 */
	private int pdv;
	/**
	 * @param niveau Le niveau du monstre
	 */
	private int niveau;
	//private int statut;	A int�grer plut�t dans Boss et Sbire?
	
	/**
	 * Contructeur par d�faut.
	 */
	public Monstre(){
		this.nom = "";
		this.pdv = 0;
		this.niveau = 0;
	}
	
	/**
	 * Constructeur standart, recoit le nom, les points de vie et le niveau du nouveau monstre.
	 * @param nom Le nom a donner au monstre
	 * @param pdv Le nombre de points de vie du monstre
	 * @param niveau Le niveau a donner au monstre
	 */
	public Monstre(String nom, int pdv, int niveau) {
		this.nom = nom;
		this.pdv = pdv;
		this.niveau = niveau;
	}
	
	//***** GETTERS & SETTERS *****
	/**
	 * Retourne le nom du monstre
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Donne un nom � un monstre
	 * @param nom Le nom � donner au monstre
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Retourne les points de vie actuels du monstre.
	 * @return pdv Les points de vie du monstre
	 */
	public int getPdv() {
		return pdv;
	}

	/**
	 * Donne des points de vie � un monstre.
	 * @param pdv Les points de vie du monstre
	 */
	public void setPdv(int pdv) {
		this.pdv = pdv;
	}

	/**
	 * Retourne le niveau actuel du monstre
	 * @return niveau Le niveau du monstre
	 */
	public int getNiveau() {
		return niveau;
	}

	/**
	 * Donne un niveau � un monstre
	 * @param niveau Le niveau � donner au monstre
	 */
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	/**
	 * Retourne le statut actuel du monstre.
	 * Sbire si statut=1 ou boss si statut=0
	 * @return statut Le statut du monstre
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
