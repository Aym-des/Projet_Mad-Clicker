/**
 * @author Jorge 
 */
package Buffs;

/**
 * La classe BuffMonstreParNiv sert à identifier le buff de base lorsqu'un sbire ou un monstre est traité
 */
public class BuffMonstreParNiv {
	/**
	 * ADD_PDV  est une constante entière permettant d'augmenter les points de vie de la cible
	 * ADD_GAIN est une constante entière permettant d'augmenter le gain provenant de la cible
	 */
	final int ADD_PDV = 50;
	final int ADD_GAIN = 5;
	
	/**
	 * @return ADD_PDV
	 * Renvoie la valeur de la constante
	 */
	public int getADD_PDV() {
		return ADD_PDV;
	}
	
	/**
	 * @return ADD_GAIN
	 * Renvoie la valeur de la constante
	 */
	public int getADD_GAIN() {
		return ADD_GAIN;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

}
