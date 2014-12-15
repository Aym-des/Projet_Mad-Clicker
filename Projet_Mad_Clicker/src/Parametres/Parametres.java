/**
 * @author Jorge
 */
package Parametres;

import java.net.SocketImpl;
import java.util.Scanner;

import Creature.Joueur;
import Graphique.JFrameNewGame;

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
	 * DEFAULT_PIECES Constante entière contenant le nombre de pièce de départ
	 */
	public final int DEFAULT_PIECES = 0;
	
	/**
	 * DEFAULT_EXPERIENCE Constante entière contenant le nombre de points d'experience de départ
	 */
	public final int DEFAULT_EXPERIENCE = 0;
	
	
	/*######################################*/
	/*##### INFOS CONCERNANT LES MONSTRES #####*/
	/*
	public final int DEFAULT_PDV_GOBELIN = 5;
	public final int DEFAULT_GAIN_GOBELIN = 5;
	public final String DEFAULT_NOM_IMAGE_GOBELIN = "Images/Gobelin.png";
	
	public final int DEFAULT_PDV_GNOME = 10;
	public final int DEFAULT_GAIN_GNOME = 10;
	public final String DEFAULT_NOM_IMAGE_GNOME = "Images/Gnome.png";
	
	public final int DEFAULT_PDV_ZOMBIE = 15;
	public final int DEFAULT_GAIN_ZOMBIE = 15;
	public final String DEFAULT_NOM_IMAGE_ZOMBIE = "Images/Zombie.png";
	
	public final int DEFAULT_PDV_PUNKGOB = 50;
	public final int DEFAULT_GAIN_PUNKGOB = 25;
	public final String DEFAULT_NOM_IMAGE_PUNKGOB = "Images/Punk Gobelin.png";
	
	public final int DEFAULT_PDV_SERPABEILLE = 70;
	public final int DEFAULT_GAIN_SERPABEILLE = 30;
	public final String DEFAULT_NOM_IMAGE_SERPABEILLE = "Images/Serpabeille.png";
	
	public final int DEFAULT_PDV_MINO = 100;
	public final int DEFAULT_GAIN_MINO = 50;
	public final String DEFAULT_NOM_IMAGE_MINO = "Images/Minoterreur.png";
	*/
	
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
	public final int GAIN_PIECES_PUNKGOB = 50;
	public final String DEFAULT_NOM_IMAGE_PUNKGOB = "Images/Punk Gobelin.png";
	
	public final int GAIN_PDV_SERPABEILLE = 70;
	public final int GAIN_XP_SERPABEILLE = 30;
	public final int GAIN_PIECES_SERPABEILLE = 50;
	public final String DEFAULT_NOM_IMAGE_SERPABEILLE = "Images/Serpabeille.png";
	
	public final int GAIN_PDV_MINO = 100;
	public final int GAIN_XP_MINO = 40;
	public final int GAIN_PIECES_MINO = 60;
	public final String DEFAULT_NOM_IMAGE_MINO = "Images/Minoterreur.png";
	
	/*#########################################*/
	/*##### INFOS CONCERNANT LES PARAMETRES DE LA PARTIE #####*/
	/**
	 * NB_MONSTRES est une constante entière contenant le nombre de monstres dans la partie
	 */
	public final int NB_MONSTRES = 10;
	
	/**
	 * DEFAULT_NB_VICTIMES Constante entière contenant le nombre de victimes par défaut
	 */
	public final int DEFAULT_NB_VICTIMES = 0;
	
	/**
	 * DEFAULT_NB_VICTIMES Constante entière contenant le nombre de clics par défault
	 */
	public final int DEFAULT_NB_CLICS = 0;
	
	/**
	 * nbVictimes indique le nombre de monstres dont leur points de vie sont tombés à 0 au cours de la partie
	 */
	public static int nbVictimes = 0;
	
	/**
	 * nbClics Indique le nombre de fois ou le joueur a clique rau cours de la partie
	 */
	public static int nbClics = 0;
	/*########################################################*/
	
	/**
	 * ADD_PDV  est une constante entière permettant d'augmenter les points de vie de la cible
	 */
	public final int ADD_PDV = 50;
	/**
	 * ADD_DPC Est une constante entière Définissant le nombre de dégat par clics gagnés lors de la prise d'un niveau
	 */
	public final int ADD_DPC = 10;
	/**
	 * ADD_GAIN est une constante entière permettant d'augmenter le gain provenant de la cible
	 */
	public final int ADD_GAIN = 5;
	
	
	/*##### GETTERS & SETTERS #####*/
	/*
	 * Inutiles car tous en public
	public int getDEFAULT_PDV_GOBELIN() {
		return DEFAULT_PDV_GOBELIN;
	}
	public int getDEFAULT_GAIN_GOBELIN() {
		return DEFAULT_GAIN_GOBELIN;
	}
	public String getDEFAULT_NOM_IMAGE_GOBELIN() {
		return DEFAULT_NOM_IMAGE_GOBELIN;
	}
	public int getDEFAULT_PDV_GNOME() {
		return DEFAULT_PDV_GNOME;
	}
	public int getDEFAULT_GAIN_GNOME() {
		return DEFAULT_GAIN_GNOME;
	}
	public String getDEFAULT_NOM_IMAGE_GNOME() {
		return DEFAULT_NOM_IMAGE_GNOME;
	}
	public int getDEFAULT_PDV_ZOMBIE() {
		return DEFAULT_PDV_ZOMBIE;
	}
	public int getDEFAULT_GAIN_ZOMBIE() {
		return DEFAULT_GAIN_ZOMBIE;
	}
	public String getDEFAULT_NOM_IMAGE_ZOMBIE() {
		return DEFAULT_NOM_IMAGE_ZOMBIE;
	}
	public int getDEFAULT_PDV_PUNKGOB() {
		return DEFAULT_PDV_PUNKGOB;
	}
	public int getDEFAULT_GAIN_PUNKGOB() {
		return DEFAULT_GAIN_PUNKGOB;
	}
	public String getDEFAULT_NOM_IMAGE_PUNKGOB() {
		return DEFAULT_NOM_IMAGE_PUNKGOB;
	}
	public int getDEFAULT_PDV_SERPABEILLE() {
		return DEFAULT_PDV_SERPABEILLE;
	}
	public int getDEFAULT_GAIN_SERPABEILLE() {
		return DEFAULT_GAIN_SERPABEILLE;
	}
	public String getDEFAULT_NOM_IMAGE_SERPABEILLE() {
		return DEFAULT_NOM_IMAGE_SERPABEILLE;
	}
	public int getDEFAULT_PDV_MINO() {
		return DEFAULT_PDV_MINO;
	}
	public int getDEFAULT_GAIN_MINO() {
		return DEFAULT_GAIN_MINO;
	}
	public String getDEFAULT_NOM_IMAGE_MINO() {
		return DEFAULT_NOM_IMAGE_MINO;
	}*/
	/**
	 * @return ADD_PDV
	 */
	public int getADD_PDV() {
		return ADD_PDV;
	}
	
	/**
	 * @return ADD_GAIN
	 */
	public int getADD_GAIN() {
		return ADD_GAIN;
	}
	/*#############################*/

}