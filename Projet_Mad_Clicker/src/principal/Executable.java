/**
 * 
 */
package principal;

import java.awt.EventQueue;

import Graphique.JFramePartieFinal;
import Créature.Joueur;


//import Interface.Controleur;
import Parametres.Parametres;
//import Créature.Joueur;



/**
 * @author Aymeric
 * La classe  qui va faire tourner le jeu.
 */


public class Executable {

	/**
	 * Les parametres par défault de la partie
	 */	
	public static Parametres param;
	/**
	 * La frame qui crée la fenetre pour le jeu
	 */	
	public static JFramePartieFinal frame1;
	/**
	 * Le Joueur qui va jouer
	 */	
	public static Joueur Le_Joueur;	
	/**
	 * Les infos sur le joueur, en chaines de caractere
	 */	
	public static Infos_joueur infos;	
	
	/**
	 * Méthode réinitilisant toutes les infos du joueurs aux paramètres par défaults
	 * @param nom Les nom de joueur écrit par Le joueur dans le cham de la frameNew game
	 */
	public static void nouvelle_partie(String nom){
		Le_Joueur.setNom(nom);
		Le_Joueur.setNiveau(param.DEFAULT_NIVEAU);
		Le_Joueur.setDpc(param.DEFAULT_DPC);
		Le_Joueur.setDps(param.DEFAULT_DPS);
		Le_Joueur.setPieces(param.DEFAULT_PIECES);
		infos.setNom(nom);
		infos.setNiveau(param.DEFAULT_NIVEAU);
		infos.setDpc(param.DEFAULT_DPC);
		infos.setDps(param.DEFAULT_DPS);
		infos.setPieces(param.DEFAULT_PIECES);
		frame1.setLblNomDuJoueur(nom);
		frame1.setLblNiveauDuJoueur(infos.getNiveau());
		frame1.setLblDegatsParClics(infos.getDpc());
		frame1.setLblDegatsParSecondes(infos.getDps());
		frame1.setLblNombreDePieces(infos.getPieces());
		
	}
	
	/**
	 * @param args Les arguments a passer eventuellement
	 */
	public static void main(String[] args) {
		
		param = new Parametres();
		Le_Joueur = new Joueur(param);
		infos = new Infos_joueur(Le_Joueur.getNom(), Le_Joueur.getNiveau(), Le_Joueur.getDpc(), Le_Joueur.getDps(), Le_Joueur.getPieces());		
		
		System.out.println(param.DEFAULT_DPC);
		System.out.println(param.DEFAULT_NAME);
		System.out.println(param.ADD_GAIN);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					frame1 = new JFramePartieFinal();
					frame1.setTitle("Mad Clicker");
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			}
		});
		

	}

}
