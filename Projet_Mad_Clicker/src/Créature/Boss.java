/**
 * @author Jorge
 */
package Créature;

/**
 * La classe Boss permet de caractériser un objet Boss héritant de l'objet Monstre avec un nom, des points de vie, un niveau et un statut 1.
 */
public class Boss extends Monstre {
	
	/**
	 * @param nbBoss Constante entiere premettant de chiffrer le nombre de boss disponibles
	 */
	private static int nbBoss = 10;
	
	/**
	 * @param statut A définir
	 */
	private int statut = 1;
	
	/**
	 * Constructeur standart, recoit le nom du boss son nombre de points de vie et son niveau
	 * @param nom Le nom du boss
	 * @param pdv Son nombre de point de vie
	 * @param niveau Son niveau
	 */
	
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
