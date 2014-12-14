/**
 * @author Jorge
 */
package Parametres;

import java.util.Scanner;

import Créature.Joueur;
import Graphique.JFrameNewGame;

//A VOIR : 
//PAssages de certain parametres genre nbvictimes dans infos_joueur

/**
 * La classe Parametres regroupe les paramètres par défaut de début de partie
 */
public class Parametres {

	/**
	 * NB_MONSTRES est une constante entière contenant le nombre de monstres dans la partie
	 */
	public final int NB_MONSTRES = 10;
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
	public final int DEFAULT_DPC = 1;
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
	/**
	 * DEFAULT_NB_VICTIMES Constante entière contenant le nombre de victimes par défaut
	 */
	public final int DEFAULT_NB_VICTIMES = 0;
	/**
	 * DEFAULT_NB_VICTIMES Constante entière contenant le nombre de clics par défault
	 */
	public final int DEFAULT_NB_CLICS = 0;
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
	/**
	 * nbVictimes indique le nombre de monstres dont leur points de vie sont tombés à 0 au cours de la partie
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