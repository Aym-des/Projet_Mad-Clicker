/**
 * @author Jorge
 */
package Cr�ature;

/**
 * La classe Boss permet de caract�riser un objet Boss h�ritant de l'objet Monstre avec un nom, des points de vie, un niveau et un statut 1.
 */
public class Boss extends Monstre {
	/**
	 * NB_BOSS est une constante enti�re permettant de chiffrer le nombre de boss disponibles
	 */
	private static int nbBoss = 10;
	private int statut = 1;
	
	public Boss(String nom, int pdv, int niveau) {
		super(nom, pdv, niveau);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
