/**
 * @author Jorge Barata 2TL2
 */
package Interface;

import Cr�ature.Joueur;
import Cr�ature.Monstre;
import Parametres.Parametres;

/**
 * La classe Controleur permet de g�rer toutes les interactions dans le jeu
 */
public class Controleur {

	public static void /*INT! VOID pour des raisons de test*/ attaque(){
		/**
		 * Si les points de vie de la cr�ture sont positifs, d�cr�mente ses points de vie selon les d�g�ts par clics du joueur
		 * 
		 * if (monstre.pdv > 0){
			monstre.pdv = monstre.pdv - joueur.getDpc();
			return 1;
		}
		 */
		
		/**
		 * Si les points de vie de la cr�atures sont �gaux ou inf�rieurs � 0, retourne 0 pour confirmer la mort
		 * 
		 * if (monstre.pdv <= 0){
		 *
			niveauSuivant();
			return 0;
		}
		 */
	}

	/**
	 * M�thode exectu�e lors du passage au niveau suivant 
	 */
	public void niveauSuivant() {
		/**
		 * joueur.niveau++;						Augmenter le niveau du joueur courant
		 * joueur.getPieces() += monstre.gain(); Augmenter le nombre de pi�ces du joueur courant avec le gain du monstre courant
		 * monstre.pdv += getADD_PDV();			Augmenter les points de vie du monstre SUIVANT
		 */

	}

	/**
	 * M�thodes pouvoirX effectuant les effets du pouvoir X lorsqu'il est s�lectionn�
	 * M�mo: renommer les pouvoirs
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
		 * Tant que le nombre de monstres vaincus (dont les points de vie sont tomb�s � 0) n'est pas atteint, la partie continue
		 * 5 ici pour des raisons de test sinon 20 ou 50 
		 */
		while (Parametres.nbVictimes < 5){

		}
	}

}
