/**
 * 
 */
package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.io.ObjectInputStream.GetField;
import java.util.Random;

import javax.swing.JPanel;

import Graphique.JFramePartieFinal;
import Creature.Joueur;
import Creature.Monstre;
import Creature.StatsMonstres;


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
	//public static Infos_joueur infos;	

	public static Monstre[] tb_monstres = new Monstre[6];

	public static JPanel paneldeJeu;

	public static void nouveauPaneldeJeu(){
		paneldeJeu = new JPanel();
		paneldeJeu.setBackground(Color.LIGHT_GRAY);
		frame1.add(paneldeJeu, BorderLayout.CENTER);
		GridBagLayout gbl_panelJeu = new GridBagLayout();
		gbl_panelJeu.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panelJeu.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelJeu.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelJeu.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		paneldeJeu.setLayout(gbl_panelJeu);


	}

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
		Le_Joueur.setExperience(param.DEFAULT_EXPERIENCE);
		frame1.setLblNomDuJoueur(nom);
		frame1.setLblNiveauDuJoueur(Le_Joueur.getNiveau());
		frame1.setLblDegatsParClics(Le_Joueur.getDpc());
		frame1.setLblDegatsParSecondes(Le_Joueur.getDps());
		frame1.setLblNombreDePieces(Le_Joueur.getPieces());
		frame1.setLblXP(Le_Joueur.getExperience(), 125);

		if(paneldeJeu == null){
		
			try{
				nouveauPaneldeJeu();
			}catch (Exception e){
				e.printStackTrace();
			}
			tb_monstres[0] = new Monstre(0, 0, 0, param);
			tb_monstres[1] = new Monstre(1, 0, 1, param);
			tb_monstres[2] = new Monstre(2, 0, 2, param);
			tb_monstres[3] = new Monstre(0, 1, 3, param);
			tb_monstres[4] = new Monstre(1, 1, 4, param);
			tb_monstres[5] = new Monstre(2, 1, 5, param);		
		}
		else{
			for(int i = 0; i < 6; i++){
				tb_monstres[i].pop_Monstre(2,0,param);// 0 en param au lieu du niveau du joueur pour que les pv soient correct
			}
		}

		frame1.repaint();

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
	
public static int choixMonstre(){
		
		Random random_nb = new Random();
		
		int nb_choisi;
		
		nb_choisi = random_nb.nextInt(6);
		
		return nb_choisi;
		
	}



	public static void supprMonstre(int indice){
		
		Le_Joueur.setPieces(tb_monstres[indice].valeurPiece + Le_Joueur.getPieces());
		frame1.setLblNombreDePieces(Le_Joueur.getPieces());
		
		Le_Joueur.setNbVictimes(Le_Joueur.getNbVictimes() + 1);
		
		tb_monstres[indice].estActif = false;
		tb_monstres[indice].panelMonstre.setVisible(false);
		
		Le_Joueur.setExperience(Le_Joueur.getExperience() + tb_monstres[indice].valeurXp);
		
		while(Le_Joueur.getExperience() >= ( ( ( ( Le_Joueur.getNiveau() * 100) ) ) + (25 * Le_Joueur.getNiveau() ) ) ){
			Le_Joueur.setNiveau(Le_Joueur.getNiveau() + 1);
			Le_Joueur.setDpc(Le_Joueur.getDpc() + Le_Joueur.getNiveau() + param.ADD_DPC);
			frame1.setLblNiveauDuJoueur(Le_Joueur.getNiveau());
			frame1.setLblDegatsParClics(Le_Joueur.getDpc());
			
		}
		
		frame1.setLblXP(Le_Joueur.getExperience(), ( ( ( ( Le_Joueur.getNiveau() * 100) ) ) + (25 * Le_Joueur.getNiveau() ) ) );
		
		if((Le_Joueur.getNbVictimes() % 5) == 0){
			
			
			for(int i = 0; i < 6; i++){
				if(tb_monstres[i].estActif == false){
					tb_monstres[i].pop_Monstre(choixMonstre(),Le_Joueur.getNiveau(),param);
				}
			}
		}
		
		frame1.repaint();
		//System.out.println(Le_Joueur.getNbVictimes());
	}

	/**
	 * @param args Les arguments a passer eventuellement
	 */
	public static void main(String[] args) {

		param = new Parametres();
		//Le_Joueur = new Joueur(param);
		Le_Joueur = new Joueur();


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
		

		//tb_monstres[2].pop_Monstre(3, 2, 1, param);
		
	}

}
