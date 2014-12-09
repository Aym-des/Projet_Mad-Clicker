/**
 * @author Jorge
 */
package Cr�ature;

/**
 * La classe Sbire permet de caractériser un objet Sbire héritant de l'objet Monstre avec un nom, des points de vie, un niveau et un statut 0.
 */
public class Sbire extends Monstre {

	/**
	 * NB_SBIRES est une constante entière contenant le nombre total de sbires disponibles pour la partie
	 */
	final int NB_SBIRES = 10;
	final int STATUT = 0;
	Sbire tbSbire[] = new Sbire[NB_SBIRES];
	
	public Sbire(){
		super();
	}
	
	public Sbire(String nom, int pdv, int niveau){
		super(nom, pdv, niveau);
	}

}
