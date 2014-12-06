/**
 * @author Jorge
 */
package Controleur;

import Créature.Joueur;
import Créature.Monstre;
import Parametres.Parametres;

/**
 * La classe Controleur permet de gérer toutes les interactions dans le jeu
 */
public class Controleur {

	public int attaque(Monstre monstre){
		/**
		 * Si les points de vie de la créture sont positifs, décrémente ses points de vie selon les dégâts par clics du joueur
		 */
		if (monstre.pdv > 0){
			monstre.pdv = monstre.pdv - Joueur.getDpc();
			return 1;
		}
		/**
		 * Si les points de vie de la créatures sont égaux ou inférieurs à 0, retourne 0 pour confirmer la mort
		 */
		if (monstre.pdv <= 0){
			niveauSuivant();
			return 0;
		}
	}
	
	private void niveauSuivant() {
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Tant que le nombre de monstres vaincus (dont les points de vie sont tombés à 0) n'est pas atteint, la partie continue 
		 */
		while (Parametres.nbVictimes < 10){
			
		}
		Parametres.statutPartie = 1;
	}

}
