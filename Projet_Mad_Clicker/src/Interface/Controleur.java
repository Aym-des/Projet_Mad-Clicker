/**
 * @author Jorge Barata 2TL2
 */
package Interface;

import Créature.Joueur;
import Créature.Monstre;
import Parametres.Parametres;

/**
 * La classe Controleur permet de gérer toutes les interactions dans le jeu
 */
public class Controleur {

	public static void /*INT! VOID pour des raisons de test*/ attaque(){
		/**
		 * Si les points de vie de la créture sont positifs, décrémente ses points de vie selon les dégâts par clics du joueur
		 */
/**
		 * if (monstre.pdv > 0){
			monstre.pdv = monstre.pdv - joueur.getDpc();
			return 1;
		}
*/
		/**
		 * Si les points de vie de la créatures sont égaux ou inférieurs à 0, retourne 0 pour confirmer la mort
		 */
/**
		 * if (monstre.pdv <= 0){
		 *
			niveauSuivant();
			return 0;
		}
*/
	}
	
	/**
	 * Méthode exectuée lors du passage au niveau suivant 
	 */
	public void niveauSuivant() {
/**
 		* joueur.niveau++;						Augmenter le niveau du joueur courant
		* joueur.getPieces() += monstre.gain(); Augmenter le nombre de pièces du joueur courant avec le gain du monstre courant
		* monstre.pdv += getADD_PDV();			Augmenter les points de vie du monstre SUIVANT
*/
		
	}
	
	/**
	 * Méthodes pouvoirX effectuant les effets du pouvoir X lorsqu'il est sélectionné
	 * Mémo: renommer les pouvoirs
	 */
	public static void pouvoir1() {
/**
	 * joueur.getDpc() += 20;
	 * joueur.getDps() += 5;
*/
	}
	
	public static void pouvoir2() {
/**
	 * joueur.getDpc() += 200;
	 * joueur.getDps() += 50;
*/
	}
	
	public static void pouvoir3() {
/**
 	 * joueur.getDpc() += 2000;
	 * joueur.getDps() += 500;
*/
	}
	
	public static void pouvoirN() {
/**
	 * joueur.getDpc() += 20000;
	 * joueur.getDps() += 5000;
*/
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Tant que le nombre de monstres vaincus (dont les points de vie sont tombés à 0) n'est pas atteint, la partie continue
		 * 5 ici pour des raisons de test sinon 20 ou 50 
		 */
		while (Parametres.nbVictimes < 5){
			
		}
	}

}
