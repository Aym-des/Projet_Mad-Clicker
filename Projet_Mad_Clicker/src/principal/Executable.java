/**
 * 
 */
package principal;

import java.awt.EventQueue;

import Graphique.JFramePartieFinal;
import Créature.Joueur;
import Créature.MonstreEssais;


//import Interface.Controleur;
import Parametres.Parametres;
//import Créature.Joueur;

/*
 * Pour les sockets : Faire un fenetre au début du programm pour choisir qui est client qui est serveur
 * On lance le serveur d'abord, le client ensuite.
 * Faire Une fenetre simple avec 2 bouton : client et serveur et une petite phrase pour poser la question.
 * Eventuellement Mutlithread.... -_-'
 */

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
	
	public static MonstreEssais[] tb_monstres = new MonstreEssais[10];
	
	/**
	 * Méthode réinitilisant toutes les infos du joueurs aux paramètres par défaults
	 * @param nom Les nom de joueur écrit par Le joueur dans le cham de la frameNew game
	 */
	public static void nouvelle_partie(String nom){
		Le_Joueur.setNom(nom);
		Le_Joueur.setNiveau(param.DEFAULT_NIVEAU);
		Le_Joueur.setDpc(param.DEFAULT_DPC);
		Le_Joueur.setDpc(15);
		Le_Joueur.setDps(param.DEFAULT_DPS);
		Le_Joueur.setPieces(param.DEFAULT_PIECES);
		infos.setNom(Le_Joueur.getNom());
		infos.setNiveau(Le_Joueur.getNiveau());
		infos.setDpc(Le_Joueur.getDpc());
		infos.setDps(Le_Joueur.getDps());
		infos.setPieces(Le_Joueur.getPieces());
		frame1.setLblNomDuJoueur(nom);
		frame1.setLblNiveauDuJoueur(infos.getNiveau());
		frame1.setLblDegatsParClics(infos.getDpc());
		frame1.setLblDegatsParSecondes(infos.getDps());
		frame1.setLblNombreDePieces(infos.getPieces());
		//Pour les tableaux de monstre : Faire un tableau d'indices libre + une méthode de choix d'indice au hasard.
		//L'indice choisi sera supprimer du tableau
		tb_monstres[1] = new MonstreEssais();
		/*
		 * OU 
		 * On crée un tableau de x monstre (constructeur spécial) on définit leurs coordonnées au début.
		 * Chaque monstre sera invisible ou visible selon une variable et aura une valeur a 1 ou 0 pour dire si ils sont actifs ou pas.
		 * Au débuts, tous inactif et donc tous invisible.
		 * Quand on crée un monstre, on passera les params de ce nouveau monstre (au hasard parmi un tableau de monstre :
		 * Genre minotaure, serpabeille, débile du coin
		 * On copie alors les stats de se monstre sauf les coordonnées dans les stats d'un monstre inactif choisi au hasard dans le tableau
		 * On rend se monstre actif et donc visible
		 * Quand on le tue, il redevient invisible et inactif et on fait toutes les actions nécessaire pour dire qu'on l'a tuer qu'on ramasse x pieces etc.
		 */
		
	}
	
	public static void supprMonstre(int indice){
		System.out.println(indice);
		frame1.remove(Executable.tb_monstres[indice].panelMonstre);
		tb_monstres[1] = null;
		frame1.repaint();
	}
	
	/**
	 * @param args Les arguments a passer eventuellement
	 */
	public static void main(String[] args) {
		
		param = new Parametres();
		Le_Joueur = new Joueur(param);
		infos = new Infos_joueur(Le_Joueur.getNom(), Le_Joueur.getNiveau(), Le_Joueur.getDpc(), Le_Joueur.getDps(), Le_Joueur.getPieces());		
		
		/*
		System.out.println();
		System.out.println();
		System.out.println();
		*/
		
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
