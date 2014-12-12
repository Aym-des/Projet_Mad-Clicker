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


public class MonstreEssais extends JFrame {
	
	private String nom;
	private int pdv;
	private int niveau;
	private int indice;
	
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




	public MonstreEssais(){
		
		this.nom = "Monstre Test";
		this.pdv = 50;
		this.niveau = 5;
		this.indice = 1;
		
		panelMonstre = new JPanel();
		panelMonstre.setBackground(Color.LIGHT_GRAY);
		panelMonstre.setSize(400, 400);
		principal.Executable.frame1.add(panelMonstre, BorderLayout.CENTER);
		panelMonstre.setLayout(new BoxLayout(panelMonstre, BoxLayout.Y_AXIS));
		
		lblNomMonstre = new JLabel(this.nom);
		lblNomMonstre.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNomMonstre.setForeground(new Color(105, 105, 105));
		lblNomMonstre.setFont(new Font("Verdana", Font.BOLD, 20));
		panelMonstre.add(lblNomMonstre);
		
		imgMonstre = new JButton("");
		imgMonstre.setSize(400, 400);
		imgMonstre.setAlignmentX(Component.CENTER_ALIGNMENT);
		imgMonstre.setIcon(new ImageIcon("Images/Minotaure.png"));
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
