/**
 * @author Jorge
 */
package Controleur;

import Cr�ature.Joueur;
import Cr�ature.Monstre;
import Parametres.Parametres;

/**
 * La classe Controleur permet de g�rer toutes les interactions dans le jeu
 */
public class Controleur {

	public int attaque(Monstre monstre){
		/**
		 * Si les points de vie de la cr�ture sont positifs, d�cr�mente ses points de vie selon les d�g�ts par clics du joueur
		 */
/**
		 * if (monstre.pdv > 0){
			monstre.pdv = monstre.pdv - joueur.getDpc();
			return 1;
		}
*/
		
		/**
		 * Si les points de vie de la cr�atures sont �gaux ou inf�rieurs � 0, retourne 0 pour confirmer la mort
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
	 * 
	 */
	private void niveauSuivant() {
		
		
	}
	
	/**
	 * M�thode pouvoir1 effectuant les effets du pouvoir 1 lorsqu'il est s�lectionn�
	 */
	public static void pouvoir1() {
/**
		 * joueur.getDpc() += 20;
*/
		
	}
	
	/**
	 * @param args Les arguments � passer �ventuellement
	 */
	public static void main(String[] args) {
		/**
		 * Tant que le nombre de monstres vaincus (dont les points de vie sont tomb�s � 0) n'est pas atteint, la partie continue 
		 */
		while (Parametres.nbVictimes < 10){
			
		}
		Parametres.statutPartie = 1;
	}

}
