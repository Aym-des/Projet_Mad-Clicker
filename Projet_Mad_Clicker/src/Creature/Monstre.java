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

import principal.Executable;
import Parametres.Parametres;


public class Monstre extends JFrame {
	
	public String nom;
	
	public int pdv;
	
	public int niveau;
	
	public int valeurPiece;
	
	public int valeurXp;
	/**
	 * indice donne l'indice du mMonstre dans le tableau déclarer dans executable
	 */
	public int indice;
	
	public Timer dot = null;
	
	public int dot_damage;
	
	private int tempsEcoule = 0;
	
	public boolean estActif;
	
	public JPanel panelMonstre;
	
	public JLabel lblNomMonstre;
	
	public JLabel lblPdvMonstre;
	
	public JButton imgMonstre;
	
	public String getNom(){
		return this.nom;
	}
	
	public int getIndice(){
		return this.indice;
	}
	
	/*
	 * Revoir les points de vie et les formules de gains de pv en fonction du niveau pour equilibrage
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
		//this.indice = ind;
		this.lblNomMonstre.setText(this.nom);
		this.lblPdvMonstre.setText(Integer.toString(this.pdv));
		this.estActif = true;
		this.panelMonstre.setVisible(true);
		
	}

	

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
