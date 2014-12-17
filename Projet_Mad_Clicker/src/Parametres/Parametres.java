/**
 * @author Jorge
 */
package Parametres;

//import java.net.SocketImpl;
//import java.util.Scanner;

//import Creature.Joueur;
//import Graphique.JFrameNewGame;

//A VOIR : 
//PAssages de certain parametres genre nbvictimes dans infos_joueur

/**
 * La classe Parametres regroupe les paramètres par défaut de début de partie
 */
public class Parametres {
	/*##### INFOS CONCERNANT LES SOCKETS #####*/
	/**
	 * NUM_PORT est une variable entière contenant le numéro de port permettant de communiquer sur le réseau
	 */
	public final static int NUM_PORT = 6200;
	/*########################################*/
	
	
	/*##### INFOS CONCERNANT LE JOUEUR #####*/
	/**
	 * DEFAULT_NAME Le nom de joueur par défault
	 */
	public final String DEFAULT_NAME = "Nouveau Joueur"; //Peut etre inutile vu que hardcoder
	
	/**
	 * DEFAULT_NIVEAU Constante entière contenant la valeur du niveau du joueur par défaut
	 */
	public final int DEFAULT_NIVEAU = 1;
	
	/**
	 * DEFAULT_DPC est une constante entière contenant la valeur de départ/de base de dégâts par clic 
	 */
	public final int DEFAULT_DPC = 10;
	
	/**
	 * DEFAULT_DPC est une constante entière contenant la valeur de départ/de base de dégâts par seconde 
	 */
	public final int DEFAULT_DPS = 0;
	
	/**
	 * DEFAULT_DOT_TIME est une constante entière définissant le temps durant lequel un dot est actif
	 */
	public final int DEFAULT_DOT_TIME = 5;
	
	/**
	 * DEFAULT_PIECES Constante entière contenant le nombre de pièce de départ
	 */
	public final int DEFAULT_PIECES = 0;
	
	/**
	 * DEFAULT_EXPERIENCE Constante entière contenant le nombre de points d'experience de départ
	 */
	public final int DEFAULT_EXPERIENCE = 0;
	
	/**
	 * GAIN_DPC Constante entière contenant le nom de de dégats par clics gagné lors de la prise d'un niveau
	 */
	public final int GAIN_DPC = 10;
	
	/**
	 * Méthode qui calcule le nouveau nombre de dégats par clic du joueur lors de la prise d'un niveau.
	 * Rajoute au dpc actuels Les gain en dpc standart et le niveau du joueur
	 * @param niveauJoueur Le niveau du Joueur
	 * @param dpcjoueur Le nombre de degats par clics actuel du joueur
	 * @return Le nouveau nombre de degats par clics
	 */
	public int gainDpc(int niveauJoueur, int dpcjoueur){
		
		int NouveauNbDpc = dpcjoueur + GAIN_DPC + niveauJoueur;
		return NouveauNbDpc;
	}
	/**
	 * Méthode qui calcule le nouveau nombre de pieces du joueur lorsqu'il tue un monstre.
	 * Rajoute au nombre de pieces actuel le nombre de pieces laissée par le monstre lors de sa mort
	 * @param piecesJoueur Le nombre actuel de pieces du joueur
	 * @param piecesMonstre Les pieces laissée par le monstre lors de sa mort
	 * @return Le nouveau nombre de pieces dont disposera le joueur
	 */
	public int gainPieces(int piecesJoueur, int piecesMonstre){
		
		int NouveauNbPieces = piecesJoueur + piecesMonstre;
		return NouveauNbPieces;
	}
	/**
	 * Méthode qui calcule le nombre d'expérience requis pour passer au niveau suivant
	 * @param NiveauJoueur Le niveau actuel du joueur
	 * @return Le montant d'expérience requis pour passer au niveau suivant 100 fois le niveau du joueur + 25 fois le niveau du joueur
	 */
	public int XpNivSuivant(int NiveauJoueur){
		
		int xpRequise = ((NiveauJoueur * 100) + (NiveauJoueur * 25));
		
		return xpRequise;
		
	}
	
	/*######################################*/
	/*##### INFOS CONCERNANT LES MONSTRES #####*/
	
	public final int GAIN_PDV_GOBELIN = 8;
	public final int GAIN_XP_GOBELIN = 5;
	public final int GAIN_PIECES_GOBELIN = 5;
	public final String DEFAULT_NOM_IMAGE_GOBELIN = "Images/Gobelin.png";
	
	public final int GAIN_PDV_GNOME = 12;
	public final int GAIN_XP_GNOME = 10;
	public final int GAIN_PIECES_GNOME = 10;
	public final String DEFAULT_NOM_IMAGE_GNOME = "Images/Gnome.png";
	
	public final int GAIN_PDV_ZOMBIE = 20;
	public final int GAIN_XP_ZOMBIE = 15;
	public final int GAIN_PIECES_ZOMBIE = 15;
	public final String DEFAULT_NOM_IMAGE_ZOMBIE = "Images/Zombie.png";
	
	public final int GAIN_PDV_PUNKGOB = 50;
	public final int GAIN_XP_PUNKGOB = 25;
	public final int GAIN_PIECES_PUNKGOB = 30;
	public final String DEFAULT_NOM_IMAGE_PUNKGOB = "Images/Punk Gobelin.png";
	
	public final int GAIN_PDV_SERPABEILLE = 70;
	public final int GAIN_XP_SERPABEILLE = 30;
	public final int GAIN_PIECES_SERPABEILLE = 40;
	public final String DEFAULT_NOM_IMAGE_SERPABEILLE = "Images/Serpabeille.png";
	
	public final int GAIN_PDV_MINO = 100;
	public final int GAIN_XP_MINO = 40;
	public final int GAIN_PIECES_MINO = 50;
	public final String DEFAULT_NOM_IMAGE_MINO = "Images/Minoterreur.png";
	
	
	/**
	 * Méthode qui calcule le nombre de points de vie d'un monstre en fonction de son niveau avant son apparition
	 * @param gainPdvMob Le montant standart de gain de points de vie pour un niveau
	 * @param niveau Le niveau du monstre qui est égal à celui du joueur
	 * @return Le nombre de points de vie qu'aura le monstre
	 */
	public int gainPdvMonstre(int gainPdvMob, int niveau){
		int pdvMonstre = (niveau * gainPdvMob);
		
		return pdvMonstre;
	}
	
	/**
	 * Méthode qui calcule la valeur en pieces d'un monstre en fonction de son niveau avant son apparition
	 * @param gainPiecesMob Le montant standart de gain de valeur (en pieces) pour un niveau
	 * @param niveau Le niveau du monstre (égal a celui du joueur)
	 * @return La valeur en pieces du monstre
	 */
	public int gainPiecesMonstre(int gainPiecesMob, int niveau){
		int valeurPieces = (niveau * gainPiecesMob);
		
		return valeurPieces;
	}
	/**
	 * Méthode qui calcule la valeur en expérience d'un monstre en fonction de son niveau avant son apparition
	 * @param gainXpMob Le montant standart de gain de valeur (en expérience) pour un niveau
	 * @param niveau Le niveau du monstre (égal a celui du joueur)
	 * @return La valeur en expérience du monstre
	 */
	public int gainXpMonstre(int gainXpMob, int niveau){
		
		int gain = gainXpMob + niveau;
		
		return gain;
	}
	
	/*#########################################*/
	/*##### INFOS CONCERNANT LES PARAMETRES DE LA PARTIE #####*/

	/**
	 * DEFAULT_NB_VICTIMES Constante entière contenant le nombre de victimes par défaut
	 */
	public final int DEFAULT_NB_VICTIMES = 0;
	
	/*########################################################*/
	
//////////////////////////////////////////////////
	/////EFFETS POUVOIRS/////
	// Ici les Gains en dpc et dps procurés par les pouvoirs
	
		public final int DEFAULT_BUFF_TIME = 5;
	
		public final int COUT_PIECES_POUVOIR_1 = 10;
		public final int GAIN_DPC_POUVOIR_1 = 20;
		public final int GAIN_DPS_POUVOIR_1 = 5;
		
		public final int COUT_PIECES_POUVOIR_2 = 100;
		public final int GAIN_DPC_POUVOIR_2 = 200;
		public final int GAIN_DPS_POUVOIR_2 = 50;		 
		
		public final int COUT_PIECES_POUVOIR_3 = 1000;
		public final int GAIN_DPC_POUVOIR_3 = 2000;
		public final int GAIN_DPS_POUVOIR_3 = 500;
		
		public final int COUT_PIECES_POUVOIR_4 = 10000;
		public final int GAIN_DPC_POUVOIR_4 = 20000;
		public final int GAIN_DPS_POUVOIR_4 = 5000;
		

}