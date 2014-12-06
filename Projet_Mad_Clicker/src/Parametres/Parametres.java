/**
 * @author Jorge
 */
package Parametres;

/**
 * La classe Parametres regroupe les param�tres par d�faut de d�but de partie
 */
public class Parametres {

	/**
	 * NB_MONSTRES est une constante enti�re contenant le nombre de monstres dans la partie
	 */
	public final int NB_MONSTRES = 10;
	/**
	 * DEFAULT_DPC est une constante enti�re contenant la valeur de d�part/de base de d�g�ts par clic 
	 */
	public final int DEFAULT_DPC = 1;
	/**
	 * DEFAULT_DPC est une constante enti�re contenant la valeur de d�part/de base de d�g�ts par seconde 
	 */
	public final int DEFAULT_DPS = 0;
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
	public static int statutPartie = 0;
	
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