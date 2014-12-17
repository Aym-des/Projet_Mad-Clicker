/**
 * 
 */
package Creature;

/**
 * @author Aymeric
 *
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Timer;

import java.awt.Color;

import javax.swing.BoxLayout;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//import principal.Executable;
import Parametres.Parametres;


public class Monstre extends JFrame {
	
	/**
	 * Le nom du Monstre
	 */
	public String nom;
	/**
	 * Les points de vies du Monstre
	 */
	public int pdv;
	/**
	 * Le niveau du Monstre
	 */	
	public int niveau;
	/**
	 * Le nombre de pieces que le joueur recevra si il tue ce monstre
	 */
	public int valeurPiece;
	/**
	 * Le nombre d'expérience que le Joueur recevra si il tue se monstre
	 */
	public int valeurXp;
	/**
	 * L'indice du Monstre dans le tableau déclaré dans executable
	 */
	public int indice;
	/**
	 * Le timer qui servira a faire les dégats par secondes sur les Monstres	
	 */
	public Timer dot = null;
	/**
	 * Les dégats à faire au monstre grace au timer
	 */
	public int dot_damage;
	/**
	 * le temps ecoulé depuis le début du dot. Remis a zero si on reclic sur le monstre et que le nombre de dps est positif
	 */
	private int tempsEcoule = 0;
	/**
	 * Définit si le monstre est considéré comme vivant ou mort
	 */
	public boolean estActif;
	/**
	 * Le JPanel qui représentar le monstre
	 */
	public JPanel panelMonstre;
	/**
	 * Le JLabel qui affichera le nom du monstre
	 */
	public JLabel lblNomMonstre;
	/**
	 * Le JLabel qui affichera le nombre de points de vie du monstre.
	 */
	public JLabel lblPdvMonstre;
	/**
	 * Le bouton avec comme icone l'image représentant le monstre
	 */
	public JButton imgMonstre;
	/**
	 * Getter qui renvoie le nom du monstre
	 * @return Le nom du monstre
	 */
	public String getNom(){
		return this.nom;
	}
	/**
	 * Getter qui renvoie l'indice du monstre dans le tableau de monstre (Dans la classe executable)
	 * @return L'indice du monstre dans le tableau
	 */
	public int getIndice(){
		return this.indice;
	}
	
	/*
	 * Revoir les points de vie et les formules de gains de pv en fonction du niveau pour equilibrage
	 */
	
/**
 * Méthode qui fait apparaitre un monstre en fonction du nombre choisi par la méthode choixMonstre de la classe Executable
 * La méthode remplace les stats des monstre mort par celles des monstres qui vont apparaitres
 * Ensuite, elle définit les monstres comme étant actif (vivant) et les rend visible
 * @param nb Le numéro du type de monstre choisi par choixMonstre
 * @param niveau_joueur Le niveau du Joueur
 * @param param Les paramètres nécessaires a la définissions des points de vie et autres attributs du monstre
 */
public void pop_Monstre(int nb, int niveau_joueur, Parametres param){
		
		this.niveau = niveau_joueur;
		
		switch(nb){
		case 0 : {
			this.nom = "Minoterreur";
			this.pdv = param.gainPdvMonstre(param.GAIN_PDV_MINO, this.niveau);
			this.valeurPiece = param.gainPiecesMonstre(param.GAIN_PIECES_MINO, this.niveau);
			this.valeurXp = param.gainXpMonstre(param.GAIN_XP_MINO, this.niveau);
			this.imgMonstre.setIcon(new ImageIcon(param.DEFAULT_NOM_IMAGE_MINO));
			break;
		}
		case 1 :{
			this.nom = "Zombie";
			this.pdv = param.gainPdvMonstre(param.GAIN_PDV_ZOMBIE, this.niveau);
			this.valeurPiece = param.gainPiecesMonstre(param.GAIN_PIECES_ZOMBIE, this.niveau);
			this.valeurXp = param.gainXpMonstre(param.GAIN_XP_ZOMBIE, this.niveau);
			this.imgMonstre.setIcon(new ImageIcon(param.DEFAULT_NOM_IMAGE_ZOMBIE));
			break;
		}
		
		case 2 :{
			this.nom = "Punk Gobelin";
			this.pdv = param.gainPdvMonstre(param.GAIN_PDV_PUNKGOB, this.niveau);
			this.valeurPiece = param.gainPiecesMonstre(param.GAIN_PIECES_PUNKGOB, this.niveau);
			this.valeurXp = param.gainXpMonstre(param.GAIN_XP_PUNKGOB, this.niveau);
			this.imgMonstre.setIcon(new ImageIcon(param.DEFAULT_NOM_IMAGE_PUNKGOB));
			break;
		}
		
		case 3 :{
			this.nom = "Gobelin";
			this.pdv = param.gainPdvMonstre(param.GAIN_PDV_GOBELIN, this.niveau);
			this.valeurPiece = param.gainPiecesMonstre(param.GAIN_PIECES_GOBELIN, this.niveau);
			this.valeurXp = param.gainXpMonstre(param.GAIN_XP_GOBELIN, this.niveau);
			this.imgMonstre.setIcon(new ImageIcon(param.DEFAULT_NOM_IMAGE_GOBELIN));
			break;
		}
		
		case 4 :{
			this.nom = "Gnome";
			this.pdv = param.gainPdvMonstre(param.GAIN_PDV_GNOME, this.niveau);
			this.valeurPiece = param.gainPiecesMonstre(param.GAIN_PIECES_GNOME, this.niveau);
			this.valeurXp = param.gainXpMonstre(param.GAIN_XP_GNOME, this.niveau);
			this.imgMonstre.setIcon(new ImageIcon(param.DEFAULT_NOM_IMAGE_GNOME));
			break;
		}
			
		case 5 :{
			this.nom = "SerpAbeille";
			this.pdv = param.gainPdvMonstre(param.GAIN_PDV_SERPABEILLE, this.niveau);
			this.valeurPiece = param.gainPiecesMonstre(param.GAIN_PIECES_SERPABEILLE, this.niveau);
			this.valeurXp = param.gainXpMonstre(param.GAIN_XP_SERPABEILLE, this.niveau);
			this.imgMonstre.setIcon(new ImageIcon(param.DEFAULT_NOM_IMAGE_SERPABEILLE));
			break;
		}
			
		}
		
		this.lblNomMonstre.setText(this.nom);
		this.lblPdvMonstre.setText(Integer.toString(this.pdv));
		this.estActif = true;
		this.panelMonstre.setVisible(true);
		
	}

	
/**
 * Constructeur Standart de la classe Monstre.
 * Crée 6 monstre "Punk Gobelin" identiques comme monstre de base
 * @param axe_X Les coordonnées X pour le positionnement dans le JPanel
 * @param axe_Y Les coordonnées Y pour le positionnement dans le JPanel
 * @param ind L'indice du monstre dans le tableau de monstre instancié dans Executable
 * @param param_temp Les paramètres néessaires au paramétrage des attributs du monstre
 */
	public Monstre(int axe_X, int axe_Y, int ind, Parametres param_temp){
		
		param_temp = new Parametres();
		
		this.nom = "Punk Gobelin";
		this.niveau = 1;
		this.pdv = (this.niveau * param_temp.GAIN_PDV_PUNKGOB);
		this.valeurPiece = (this.niveau * param_temp.GAIN_PIECES_PUNKGOB);
		this.valeurXp = (this.niveau * param_temp.GAIN_XP_PUNKGOB);
		this.indice = ind;
		this.estActif = true;
		
		panelMonstre = new JPanel();
		panelMonstre.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panelMonstre = new GridBagConstraints();
		gbc_panelMonstre.fill = GridBagConstraints.BOTH;
		gbc_panelMonstre.gridx = axe_X;
		gbc_panelMonstre.gridy = axe_Y;
		principal.Executable.paneldeJeu.add(panelMonstre, gbc_panelMonstre);
		panelMonstre.setLayout(new BoxLayout(panelMonstre, BoxLayout.Y_AXIS));
		
		lblNomMonstre = new JLabel(this.nom);
		lblNomMonstre.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNomMonstre.setForeground(new Color(105, 105, 105));
		lblNomMonstre.setFont(new Font("Verdana", Font.BOLD, 20));
		panelMonstre.add(lblNomMonstre);
		
		imgMonstre = new JButton("");
		imgMonstre.setSize(200, 200);
		imgMonstre.setAlignmentX(Component.CENTER_ALIGNMENT);
		imgMonstre.setIcon(new ImageIcon(param_temp.DEFAULT_NOM_IMAGE_PUNKGOB));
		panelMonstre.add(imgMonstre);
		imgMonstre.setBackground(Color.LIGHT_GRAY);
		imgMonstre.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				
				
				pdv = pdv - (principal.Executable.Le_Joueur.getDpc());
				lblPdvMonstre.setText(Integer.toString(pdv));				
				if(pdv <= 0){
					principal.Executable.supprMonstre(getIndice());
					if(dot != null){
						dot.stop();
						dot = null;
						tempsEcoule = 0;
					}
				}
				
				if( (principal.Executable.Le_Joueur.getDps() > 0) && (pdv > 0)){
					
					dot_damage = principal.Executable.Le_Joueur.getDps();
						
					if(dot == null){
					
						dot = new Timer(1000, new ActionListener(){
							public void actionPerformed(ActionEvent e){
								
								pdv = pdv - dot_damage;
								lblPdvMonstre.setText(Integer.toString(pdv));
								if(pdv <= 0 ){
									principal.Executable.supprMonstre(getIndice());
									dot.stop();
									dot = null;
									tempsEcoule = 0;
									dot_damage = 0;
								}
								tempsEcoule = tempsEcoule + 1;
								
								if(tempsEcoule >= 5){
									dot.stop();
									dot = null;
									tempsEcoule = 0;
									dot_damage = 0;
								}
							
							}
						});
					
					dot.start();
					}
					else{
						tempsEcoule = 0;
					}
				}
			}
		});
		
		lblPdvMonstre = new JLabel(Integer.toString(this.pdv));
		lblPdvMonstre.setForeground(new Color(105, 105, 105));
		lblPdvMonstre.setFont(new Font("Verdana", Font.BOLD, 20));
		lblPdvMonstre.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelMonstre.add(lblPdvMonstre);		
		
	}

}
