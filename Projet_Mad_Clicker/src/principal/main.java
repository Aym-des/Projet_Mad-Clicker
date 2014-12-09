/**
 * 
 */
package principal;

import java.awt.EventQueue;

import Graphique.JFramePartieFinal;
import Créature.Joueur;

/**
 * @author Aymeric
 * La classe  qui va faire tourner le jeu.
 */
public class main {

	/**
	 * @param args Les arguments a passer eventuellement
	 */
	public static void main(String[] args) {
		
		
		Joueur moi = new Joueur();
		Infos_joueur infos = new Infos_joueur(moi.getNiveau(), moi.getDpc(), moi.getDps(), moi.getPieces());
		
		moi.setNom("Aymeric");
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePartieFinal frame = new JFramePartieFinal(moi.getNom(), infos.getNiveau(), infos.getDpc(), infos.getDps(), infos.getPieces());
					frame.setTitle("Mad Clicker");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
