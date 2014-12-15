/**
 * 
 */
package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.io.ObjectInputStream.GetField;

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
	public static StatsMonstres gain_par_niv_monstres;

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
		Le_Joueur.setDpc(15);
		Le_Joueur.setDps(param.DEFAULT_DPS);
		Le_Joueur.setPieces(param.DEFAULT_PIECES);
		frame1.setLblNomDuJoueur(nom);
		frame1.setLblNiveauDuJoueur(Le_Joueur.getNiveau());
		frame1.setLblDegatsParClics(Le_Joueur.getDpc());
		frame1.setLblDegatsParSecondes(Le_Joueur.getDps());
		frame1.setLblNombreDePieces(Le_Joueur.getPieces());

		//Pour les tableaux de monstre : Faire un tableau d'indices libre + une méthode de choix d'indice au hasard.
		//L'indice choisi sera supprimer du tableau
		tb_monstres[0] = new Monstre("Gobelin", 5, 1, 5, 1, 0, 0, param.DEFAULT_NOM_IMAGE_GOBELIN);
		tb_monstres[1] = new Monstre("Gnome", 5, 1, 5, 1, 0, 1, param.DEFAULT_NOM_IMAGE_GNOME);
		tb_monstres[2] = new Monstre("Zombie", 5, 1, 5, 1, 0, 2, param.DEFAULT_NOM_IMAGE_ZOMBIE);
		tb_monstres[3] = new Monstre("Punk Gobelin", 20, 1, 20, 5, 1, 3, param.DEFAULT_NOM_IMAGE_PUNKGOB);
		tb_monstres[4] = new Monstre("Serpabeille", 50, 1, 20, 5, 1, 4, param.DEFAULT_NOM_IMAGE_SERPABEILLE);
		tb_monstres[5] = new Monstre("Minoterreur", 100, 1, 20, 5, 1, 5, param.DEFAULT_NOM_IMAGE_MINO);

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

	public static Monstre modifMonstre(Monstre monstre){
		/**
		 * Identification du monstre à traiter
		 */
		int result = -1;
		if(monstre.nom.equals("Gobelin")){
			result = 0;
		}
		else if(monstre.nom.equals("Gnome")){
			result = 1;
		}
		else if(monstre.nom.equals("Zombie")){
			result = 2;
		}
		else if(monstre.nom.equals("Punk Gobelin")){
			result = 3;
		}
		else if(monstre.nom.equals("Serpabeille")){
			result = 4;
		}
		else if(monstre.nom.equals("Minoterreur")){
			result = 5;
		}		
		else {
			System.out.println("ERREUR dans la modification des monstres");
		}
		/**
		 * Traitement du monstre
		 */
		switch(result){
			/**
			 * Si le monstre est un gobelin
			 */
			case 0:{
				monstre.pdv = monstre.pdv + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_PDV_GOBELIN);
				monstre.valeurPiece = monstre.valeurPiece + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_PIECES_GOBELIN);
				monstre.valeurXp = monstre.valeurXp + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_XP_GOBELIN);
			}
			/**
			 * Si le monstre est un gnome
			 */
			case 1:{
				monstre.pdv = monstre.pdv + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_PDV_GNOME);
				monstre.valeurPiece = monstre.valeurPiece + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_PIECES_GNOME);
				monstre.valeurXp = monstre.valeurXp + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_XP_GNOME);
			}
			/**
			 * Si le monstre est un zombie
			 */
			case 2:{
			monstre.pdv = monstre.pdv + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_PDV_ZOMBIE);
			monstre.valeurPiece = monstre.valeurPiece + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_PIECES_ZOMBIE);
			monstre.valeurXp = monstre.valeurXp + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_XP_ZOMBIE);
			}
			/**
			 * Si le monstre est un Punk Gobelin
			 */
			case 3:{
				monstre.pdv = monstre.pdv + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_PDV_PUNKGOB);
				monstre.valeurPiece = monstre.valeurPiece + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_PIECES_PUNKGOB);
				monstre.valeurXp = monstre.valeurXp + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_XP_PUNKGOB);
			}
			/**
			 * Si le monstre est un Serpabeille
			 */
			case 4:{
				monstre.pdv = monstre.pdv + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_PDV_SERPABEILLE);
				monstre.valeurPiece = monstre.valeurPiece + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_PIECES_SERPABEILLE);
				monstre.valeurXp = monstre.valeurXp + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_XP_SERPABEILLE);
			}
			/**
			 * Si le monstre est un Minoterreur
			 */
			case 5:{
				monstre.pdv = monstre.pdv + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_PDV_MINO);
				monstre.valeurPiece = monstre.valeurPiece + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_PIECES_MINO);
				monstre.valeurXp = monstre.valeurXp + (Le_Joueur.getNiveau() * gain_par_niv_monstres.GAIN_XP_MINO);
			}
		}
		return monstre;
	}

	public static void supprMonstre(int indice){
		System.out.println(indice);
		Le_Joueur.setPieces(tb_monstres[indice].valeurPiece);
		frame1.setLblNombreDePieces(Le_Joueur.getPieces());
		Le_Joueur.setNbVictimes(1);
		tb_monstres[indice].panelMonstre.setVisible(false);
		Le_Joueur.setExperience(tb_monstres[indice].valeurXp);
		if(Le_Joueur.getExperience() >= ((Le_Joueur.getNiveau() + 1) * 100) ){
			Le_Joueur.setNiveau(Le_Joueur.getNiveau() + 1);
			Le_Joueur.setDpc(Le_Joueur.getNiveau() + param.ADD_DPC);
			frame1.setLblNiveauDuJoueur(Le_Joueur.getNiveau());
			frame1.setLblDegatsParClics(Le_Joueur.getDpc());
		}
		frame1.repaint();
		//System.out.println(Le_Joueur.getNbVictimes());
	}

	/**
	 * @param args Les arguments a passer eventuellement
	 */
	public static void main(String[] args) {

		param = new Parametres();
		Le_Joueur = new Joueur(param);
		//infos = new Infos_joueur(Le_Joueur.getNom(), Le_Joueur.getNiveau(), Le_Joueur.getDpc(), Le_Joueur.getDps(), Le_Joueur.getPieces());
		StatsMonstres GainparNivMonstres = new StatsMonstres();

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
