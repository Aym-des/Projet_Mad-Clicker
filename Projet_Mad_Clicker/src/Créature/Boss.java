/**
 * @author Jorge
 */
package Créature;

/**
 * La classe Boss permet de caractériser un objet Boss héritant de l'objet Monstre avec un nom, des points de vie, un niveau et un statut 1.
 */
public class Boss extends Monstre {
	/**
	 * NB_BOSS est une constante entière permettant de chiffrer le nombre de boss disponibles
	 */
	private static int nbBoss = 10;
	private int statut = 1;
	
	public Boss(String nom, int pdv, int niveau) {
		super(nom, pdv, niveau);
	}
	
	/**
	 * @param args Les arguments a passer eventuellement
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
