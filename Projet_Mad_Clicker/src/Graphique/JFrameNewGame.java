package Graphique;

/* A FAIRE :
 * Mettre le commentaire Javadoc pour l'attribut contentpane
 * Mettre les vérification de nom lors de la création d'une nouvelle partie.
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JTextField;

import Créature.Joueur;
import principal.Executable;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Jorge
 * La classe JFrameNewGame affiche une fenetre permettant de rentrer son nom lorsqu'on appuie sur "Nouvelle Partie" dans la fenetre principale.
 */
public class JFrameNewGame extends JFrame {

	private JPanel contentPane;
	
	/**
	 * textField Le champ de texte ou La personne rentrera son nom
	 */
	private JTextField textField;

	/*
	 * Launch the application
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameNewGame frame = new JFrameNewGame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame
	 */
	public JFrameNewGame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("Images/Icones/Icone Crossed Swords.png"));
		setTitle("Mad Clicker");
		setBounds(100, 100, 350, 160);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNouvellePartie = new JLabel("BIENVENUE SUR MAD CLICKER");
		lblNouvellePartie.setForeground(Color.DARK_GRAY);
		lblNouvellePartie.setBackground(Color.LIGHT_GRAY);
		lblNouvellePartie.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblNouvellePartie = new GridBagConstraints();
		gbc_lblNouvellePartie.gridwidth = 2;
		gbc_lblNouvellePartie.insets = new Insets(15, 0, 15, 5);
		gbc_lblNouvellePartie.gridx = 0;
		gbc_lblNouvellePartie.gridy = 0;
		contentPane.add(lblNouvellePartie, gbc_lblNouvellePartie);
		
		JLabel lblEntrezVotreNom = new JLabel("Entrez votre nom :");
		lblEntrezVotreNom.setForeground(new Color(105, 105, 105));
		lblEntrezVotreNom.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblEntrezVotreNom = new GridBagConstraints();
		gbc_lblEntrezVotreNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEntrezVotreNom.insets = new Insets(0, 0, 15, 5);
		gbc_lblEntrezVotreNom.gridx = 0;
		gbc_lblEntrezVotreNom.gridy = 1;
		contentPane.add(lblEntrezVotreNom, gbc_lblEntrezVotreNom);
		
		textField = new JTextField();

		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 15, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		ImageIcon icoQuit = new ImageIcon("Images/Icones/Icone Quitter.png");
		JButton btnQuitter = new JButton("Quitter", icoQuit);
		btnQuitter.setBackground(new Color(169, 169, 169));
		btnQuitter.setFont(new Font("Verdana", Font.BOLD, 12));
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		GridBagConstraints gbc_btnQuitter = new GridBagConstraints();
		gbc_btnQuitter.insets = new Insets(0, 0, 20, 0);
		gbc_btnQuitter.gridx = 0;
		gbc_btnQuitter.gridy = 2;
		contentPane.add(btnQuitter, gbc_btnQuitter);
		
		ImageIcon icoConfirm = new ImageIcon("Images/Icones/Icone Confirmation.png");
		JButton btnConfirmer = new JButton("Confirmer", icoConfirm);
		btnConfirmer.setBackground(new Color(169, 169, 169));
		btnConfirmer.setFont(new Font("Verdana", Font.BOLD, 12));
		btnConfirmer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Executable.nouveauPaneldeJeu();
				}catch (Exception e){
					e.printStackTrace();
				}
				Executable.nouvelle_partie(textField.getText());
				//Executable.frame1.setLblNomDuJoueur(textField.getText());
				//Executable.infos.setNom(textField.getText());
				/*Executable.frame1.setLblNiveauDuJoueur("5");
				Executable.frame1.setLblDegatsParClics("50");
				Executable.frame1.setLblDegatsParSecondes("4");
				Executable.frame1.setLblNombreDePieces("1235");*/
				dispose();
				
			}
		});
		GridBagConstraints gbc_btnConfirmer = new GridBagConstraints();
		gbc_btnConfirmer.insets = new Insets(0, 0, 20, 22);
		gbc_btnConfirmer.gridx = 1;
		gbc_btnConfirmer.gridy = 2;
		contentPane.add(btnConfirmer, gbc_btnConfirmer);
	}
}
