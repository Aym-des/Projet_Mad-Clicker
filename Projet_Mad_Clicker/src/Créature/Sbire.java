/**
 * @author Jorge
 */
package Créature;

/**
 * La classe Sbire permet de caractériser un objet Sbire héritant de l'objet Monstre avec un nom, des points de vie, un niveau et un statut 0.
 */
public class Sbire extends Monstre {
	/**
	 * NB_SBIRES est une valeur entière permettant de chiffrer le nombre de sbires disponibles
	 */
	private static int nbSbires = 0;
	private int statut = 0;
	
	public Sbire(){
		super();
	}
	
	public Sbire(String nom, int pdv, int niveau){
		super(nom, pdv, niveau);
		statut = 0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sbire sbire1[] = new Sbire[nbSbires];
		
	}

}
