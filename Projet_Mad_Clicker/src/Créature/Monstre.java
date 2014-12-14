/**
 * 
 */
package Créature;

/**
 * @author Aymeric
 *
 */

import Interface.Controleur;
//import Parametres.Parametres;
//import Créature.Joueur;
import principal.Executable;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.BoxLayout;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Monstre extends JFrame {
	
	public String nom;
	
	public int pdv;
	
	public int niveau;
	
	public int valeurPiece;
	
	public int valeurXp;
	
	public int indice;
	
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


//////////////////Modifier le constructeur pour faire pop des monstres bas niveau normaux/////////////////////////////
/////////////////Crée un constructeur Pour faire apparaitre un monstre au hasard selon les stats définies dans Stats monstres

	public Monstre(int inset1, int inset2, int inset3, int inset4,int axe_X, int axe_Y, int ind){
		
		StatsMonstres stats = new StatsMonstres();
		
		this.nom = "Monstre Test";
		this.niveau = 5;
		this.pdv = 50 + (this.niveau * stats.GAIN_PDV_GOBELIN);
		this.valeurPiece = 9 + (this.niveau * stats.ADD_GAIN_PIECES_GOBELIN);
		this.valeurXp = stats.GAIN_XP_GOBELIN + (this.niveau * stats.GAIN_XP_GOBELIN);
		this.indice = ind;
		this.estActif = true;
		
		panelMonstre = new JPanel();
		panelMonstre.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panelMonstre = new GridBagConstraints();
		//gbc_panelMonstre.insets = new Insets(inset1, inset2, inset3, inset4);
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
		imgMonstre.setIcon(new ImageIcon("Images/Gobelin.png"));
		panelMonstre.add(imgMonstre);
		imgMonstre.setBackground(Color.LIGHT_GRAY);
		imgMonstre.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				pdv = pdv - (principal.Executable.Le_Joueur.getDpc());
				lblPdvMonstre.setText(Integer.toString(pdv));
				if(pdv < 0){
					principal.Executable.supprMonstre(getIndice());
					/*principal.Executable.frame1.remove(Executable.monster.panelMonstre);
					principal.Executable.monster = null;
					principal.Executable.frame1.repaint();*/
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
