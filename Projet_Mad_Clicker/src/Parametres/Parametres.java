/**
 * @author Jorge
 */
package Parametres;

import java.util.Scanner;

import Cr�ature.Joueur;
import Graphique.JFrameNewGame;

//A VOIR : 
//PAssages de certain parametres genre nbvictimes dans infos_joueur

/**
 * La classe Parametres regroupe les param�tres par d�faut de d�but de partie
 */
public class Parametres {

	/**
	 * NB_MONSTRES est une constante enti�re contenant le nombre de monstres dans la partie
	 */
	public final int NB_MONSTRES = 10;
	/**
	 * DEFAULT_NAME Le nom de joueur par d�fault
	 */
	public final String DEFAULT_NAME = "Nouveau Joueur"; //Peut etre inutile vu que hardcoder
	/**
	 * DEFAULT_NIVEAU Constante enti�re contenant la valeur du niveau du joueur par d�faut
	 */
	public final int DEFAULT_NIVEAU = 1;
	/**
	 * DEFAULT_DPC est une constante enti�re contenant la valeur de d�part/de base de d�g�ts par clic 
	 */
	public final int DEFAULT_DPC = 1;
	/**
	 * DEFAULT_DPC est une constante enti�re contenant la valeur de d�part/de base de d�g�ts par seconde 
	 */
	public final int DEFAULT_DPS = 0;
	/**
	 * DEFAULT_PIECES Constante enti�re contenant le nombre de pi�ce de d�part
	 */
	public final int DEFAULT_PIECES = 0;
	/**
	 * ADD_PDV  est une constante enti�re permettant d'augmenter les points de vie de la cible
	 */
	public final int ADD_PDV = 50;
	/**
	 * ADD_GAIN est une constante enti�re permettant d'augmenter le gain provenant de la cible
	 */
	public final int ADD_GAIN = 5;
	/**
	 * nbVictimes indique le nombre de monstres dont leur points de vie sont tomb�s � 0 au cours de la partie
	 */
	public static int nbVictimes = 0;
	/**
	 * nbClics Indique le nombre de fois ou le joueur a clique rau cours de la partie
	 */
	public static int nbClics = 0;
	
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

}