package Graphique;

/* A FAIRE :
 * Mettre le commentaire Javadoc pour l'attribut contentpane
 * Définir un nombre max de lettres pour le nom du joueur (pour peremttre vérif dans framenewgame)
 */

import Interface.Controleur;
//import Parametres.Parametres;
//import Créature.Joueur;
import principal.Executable;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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

public class JFramePartieFinal extends JFrame{
	
	/**
	 * lblNomDuJoueur Le Label qui affichera le nom du joueur
	 */
	private JLabel lblNomDuJoueur ;	
	/**
	 * lblNiveauDuJoueur Le JLabel qui affichera le
	 */
	private JLabel lblNiveauDuJoueur;	
	/**
	 * DegatsParClics Le JLabel qui affichera le nombre de degats par clics du joueur
	 */
	private JLabel lblDegatsParClics;	
	/**
	 * lblDegatsParSecondes Le JLabel qui affichera le nombre de degats par seconde du joueur
	 */
	private JLabel lblDegatsParSecondes;	
	/**
	 * lblNombreDePieces Le JLabel qui affichera le nombre de pieces dont dispose le joueur
	 */
	private JLabel lblNombreDePieces;	
	/**
	 * contentPane Le JPanel
	 */
	public JPanel contentPane;
	
	
	//GETTERS AND SETTERS////////////////////////////////
	
	//Les getters renvoient la chaine qu'affiche le JLabel
	//Les setters Permettent de modifier la chaine qu'affiche le JLabel
	
	/**
	 * Renvoie la chaine qu'affiche le JLabel.
	 * @return La chaine contenant le nom du joueur
	 */
	public String getLblNomDuJoueur() {
		return lblNomDuJoueur.getText();
	}



	/**
	 * Permet de modifier la chaine qu'affiche le JLabel.
	 * @param NomJoueur Le Nom de Joueur à afficher
	 */
	public void setLblNomDuJoueur(String NomJoueur) {
		lblNomDuJoueur.setText(NomJoueur);
	}



	/**
	 * Renvoie la chaine qu'affiche le JLabel.
	 * @return La chaine contenant le niveau du joueur
	 */
	public String getLblNiveauDuJoueur() {
		return lblNiveauDuJoueur.getText();
	}



	/**
	 * Permet de modifier la chaine qu'affiche le JLabel.
	 * @param NiveauJoueur Le niveau de joueur à afficher
	 */
	public void setLblNiveauDuJoueur(String NiveauJoueur) {
		lblNiveauDuJoueur.setText(NiveauJoueur);
	}



	/**
	 * Renvoie la chaine qu'affiche le JLabel.
	 * @return La chaine contenant le nombre de degats par clics
	 */
	public String getLblDegatsParClics() {
		return lblDegatsParClics.getText();
	}



	/**
	 * Permet de modifier la chaine qu'affiche le JLabel.
	 * @param dpc Le nombre de degats par clics a afficher
	 */
	public void setLblDegatsParClics(String dpc) {
		lblDegatsParClics.setText(dpc);
	}



	/**
	 * Renvoie la chaine qu'affiche le JLabel.
	 * @return La chaine contenant le nombre de degats par secondes
	 */
	public String getLblDegatsParSecondes() {
		return lblDegatsParSecondes.getText();
	}



	/**
	 * Permet de modifier la chaine qu'affiche le JLabel.
	 * @param dps Le nombre de degats par seconde a afficher
	 */
	public void setLblDegatsParSecondes(String dps) {
		lblDegatsParSecondes.setText(dps);
	}



	/**
	 * Renvoie la chaine qu'affiche le JLabel.
	 * @return La chaine contenant le nombre de pieces dont dispose le joueur
	 */
	public String getLblNombreDePieces() {
		return lblNombreDePieces.getText();
	}



	/**
	 * Permet de modifier la chaine qu'affiche le JLabel.
	 * @param nbpieces Le nombre de pieces a afficher
	 */
	public void setLblNombreDePieces(String nbpieces) {
		lblNombreDePieces.setText(nbpieces);
	}



	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePartieFinal frame = new JFramePartieFinal();
					frame.setTitle("Mad Clicker");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	*/
	/**
	 * Create the frame
	 */

	
	public JFramePartieFinal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("Images/Icones/Icone Crossed Swords.png"));
		setBounds(100, 100, 1100, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		
		JPanel panelNord = new JPanel();
		panelNord.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panelNord, BorderLayout.NORTH);
		GridBagLayout gbl_panelNord = new GridBagLayout();
		gbl_panelNord.columnWidths = new int[]{462, 89, 0};
		gbl_panelNord.rowHeights = new int[]{23, 0};
		gbl_panelNord.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panelNord.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelNord.setLayout(gbl_panelNord);

		JPanel panelPartie = new JPanel();
		panelPartie.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panelPartie = new GridBagConstraints();
		gbc_panelPartie.insets = new Insets(0, 0, 0, 5);
		gbc_panelPartie.gridx = 0;
		gbc_panelPartie.gridy = 0;
		panelNord.add(panelPartie, gbc_panelPartie);
		panelPartie.setLayout(new BoxLayout(panelPartie, BoxLayout.Y_AXIS));

		JLabel label_ImgMadClicker = new JLabel("");
		label_ImgMadClicker.setAlignmentX(Component.CENTER_ALIGNMENT);
		label_ImgMadClicker.setIcon(new ImageIcon("C:\\Users\\Jorge\\Documents\\GitHub\\Projet_Mad-Clicker\\Projet_Mad_Clicker\\Images\\Crossed Swords.png"));
		panelPartie.add(label_ImgMadClicker);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panelPartie.add(panel);

		ImageIcon icoNewGame = new ImageIcon("Images/Icones/Icone New Game.png");
		JButton btnNewButton_4 = new JButton("Nouvelle partie", icoNewGame);
		btnNewButton_4.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnNewButton_4.setBackground(new Color(169, 169, 169));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrameNewGame newGame = new JFrameNewGame();
				newGame.setVisible(true);
				//Parametres.nouvellePartie();
			}
		});
		panel.add(btnNewButton_4);

		ImageIcon icoQuit = new ImageIcon("Images/Icones/Icone Quitter.png");
		JButton btnNewButton_5 = new JButton("Quitter", icoQuit);
		btnNewButton_5.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnNewButton_5.setBackground(new Color(169, 169, 169));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel.add(btnNewButton_5);

		JPanel panel_Infos = new JPanel();
		panel_Infos.setBorder(null);
		panel_Infos.setBackground(Color.LIGHT_GRAY);
		//contentPane.add(panel_Infos);
		GridBagConstraints gbc_panel_Infos = new GridBagConstraints();
		gbc_panel_Infos.insets = new Insets(0, 0, 0, 20);
		gbc_panel_Infos.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_Infos.gridx = 1;
		gbc_panel_Infos.gridy = 0;
		panelNord.add(panel_Infos, gbc_panel_Infos);
		GridBagLayout gbl_panel_Infos = new GridBagLayout();
		gbl_panel_Infos.columnWidths = new int[]{0, 0, 0};
		gbl_panel_Infos.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_Infos.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_Infos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_Infos.setLayout(gbl_panel_Infos);
		lblNomDuJoueur = new JLabel(Executable.infos.getNom());//informations.getNom()
		lblNomDuJoueur.setForeground(new Color(105, 105, 105));
		lblNomDuJoueur.setFont(new Font("Verdana", Font.BOLD, 22));
		GridBagConstraints gbc_lblNomDuJoueur = new GridBagConstraints();
		gbc_lblNomDuJoueur.gridwidth = 2;
		gbc_lblNomDuJoueur.insets = new Insets(0, 0, 5, 0);
		gbc_lblNomDuJoueur.gridx = 0;
		gbc_lblNomDuJoueur.gridy = 0;
		panel_Infos.add(lblNomDuJoueur, gbc_lblNomDuJoueur);

		JLabel lblNewLabel = new JLabel("Niveau :");
		lblNewLabel.setForeground(new Color(105, 105, 105));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel_Infos.add(lblNewLabel, gbc_lblNewLabel);

		lblNiveauDuJoueur = new JLabel(Executable.infos.getNiveau());
		lblNiveauDuJoueur.setForeground(new Color(105, 105, 105));
		lblNiveauDuJoueur.setFont(new Font("Verdana", Font.BOLD, 18));
		GridBagConstraints gbc_lblNiveauDuJoueur = new GridBagConstraints();
		gbc_lblNiveauDuJoueur.anchor = GridBagConstraints.WEST;
		gbc_lblNiveauDuJoueur.insets = new Insets(0, 0, 5, 0);
		gbc_lblNiveauDuJoueur.gridx = 1;
		gbc_lblNiveauDuJoueur.gridy = 1;
		panel_Infos.add(lblNiveauDuJoueur, gbc_lblNiveauDuJoueur);

		JLabel lblDgtsParClic = new JLabel("D\u00E9g\u00E2ts par clic :");
		lblDgtsParClic.setForeground(new Color(105, 105, 105));
		lblDgtsParClic.setFont(new Font("Verdana", Font.BOLD, 20));
		GridBagConstraints gbc_lblDgtsParClic = new GridBagConstraints();
		gbc_lblDgtsParClic.anchor = GridBagConstraints.WEST;
		gbc_lblDgtsParClic.insets = new Insets(0, 0, 5, 5);
		gbc_lblDgtsParClic.gridx = 0;
		gbc_lblDgtsParClic.gridy = 2;
		panel_Infos.add(lblDgtsParClic, gbc_lblDgtsParClic);

		lblDegatsParClics = new JLabel(Executable.infos.getDpc());
		lblDegatsParClics.setForeground(new Color(105, 105, 105));
		lblDegatsParClics.setFont(new Font("Verdana", Font.BOLD, 18));
		GridBagConstraints gbc_lblDegatsParClics = new GridBagConstraints();
		gbc_lblDegatsParClics.insets = new Insets(0, 0, 5, 0);
		gbc_lblDegatsParClics.anchor = GridBagConstraints.WEST;
		gbc_lblDegatsParClics.gridx = 1;
		gbc_lblDegatsParClics.gridy = 2;
		panel_Infos.add(lblDegatsParClics, gbc_lblDegatsParClics);
		
				JLabel lblDgtsParSec = new JLabel("D\u00E9g\u00E2ts par seconde :");
				lblDgtsParSec.setForeground(new Color(105, 105, 105));
				lblDgtsParSec.setFont(new Font("Verdana", Font.BOLD, 20));
				GridBagConstraints gbc_lblDgtsParSec = new GridBagConstraints();
				gbc_lblDgtsParSec.anchor = GridBagConstraints.WEST;
				gbc_lblDgtsParSec.insets = new Insets(0, 0, 5, 5);
				gbc_lblDgtsParSec.gridx = 0;
				gbc_lblDgtsParSec.gridy = 3;
				panel_Infos.add(lblDgtsParSec, gbc_lblDgtsParSec);
		
				lblDegatsParSecondes = new JLabel(Executable.infos.getDps());
				lblDegatsParSecondes.setForeground(new Color(105, 105, 105));
				lblDegatsParSecondes.setFont(new Font("Verdana", Font.BOLD, 18));
				GridBagConstraints gbc_lblDegatsParSecondes = new GridBagConstraints();
				gbc_lblDegatsParSecondes.insets = new Insets(0, 0, 5, 0);
				gbc_lblDegatsParSecondes.anchor = GridBagConstraints.WEST;
				gbc_lblDegatsParSecondes.gridx = 1;
				gbc_lblDegatsParSecondes.gridy = 3;
				panel_Infos.add(lblDegatsParSecondes, gbc_lblDegatsParSecondes);
				
				JLabel lblPieces = new JLabel("Pi\u00E8ces :");
				lblPieces.setForeground(new Color(105, 105, 105));
				lblPieces.setFont(new Font("Verdana", Font.BOLD, 20));
				GridBagConstraints gbc_lblPieces = new GridBagConstraints();
				gbc_lblPieces.anchor = GridBagConstraints.WEST;
				gbc_lblPieces.insets = new Insets(0, 0, 0, 5);
				gbc_lblPieces.gridx = 0;
				gbc_lblPieces.gridy = 4;
				panel_Infos.add(lblPieces, gbc_lblPieces);
				
				lblNombreDePieces = new JLabel(Executable.infos.getPieces());
				lblNombreDePieces.setForeground(new Color(105, 105, 105));
				lblNombreDePieces.setFont(new Font("Verdana", Font.BOLD, 18));
				GridBagConstraints gbc_lblNombreDePieces = new GridBagConstraints();
				gbc_lblNombreDePieces.anchor = GridBagConstraints.WEST;
				gbc_lblNombreDePieces.gridx = 1;
				gbc_lblNombreDePieces.gridy = 4;
				panel_Infos.add(lblNombreDePieces, gbc_lblNombreDePieces);

		JPanel panelOuest = new JPanel();
		panelOuest.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panelOuest, BorderLayout.WEST);
		GridBagLayout gbl_panelOuest = new GridBagLayout();
		gbl_panelOuest.columnWidths = new int[] {450, 0};
		gbl_panelOuest.rowHeights = new int[] {0, 50, 50, 50, 50, 50};
		gbl_panelOuest.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelOuest.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelOuest.setLayout(gbl_panelOuest);

		JLabel lblListeDesPouvoirs = new JLabel("Liste des pouvoirs");
		lblListeDesPouvoirs.setForeground(new Color(105, 105, 105));
		lblListeDesPouvoirs.setFont(new Font("Verdana", Font.BOLD, 22));
		GridBagConstraints gbc_lblListeDesPouvoirs = new GridBagConstraints();
		gbc_lblListeDesPouvoirs.insets = new Insets(50, 0, 20, 0);
		gbc_lblListeDesPouvoirs.gridx = 0;
		gbc_lblListeDesPouvoirs.gridy = 0;
		panelOuest.add(lblListeDesPouvoirs, gbc_lblListeDesPouvoirs);
		
		
		//POUVOIR n°1
		 
		 
		ImageIcon icoPouv1 = new ImageIcon("Images/Icones/Icone Enclume.png");
		JButton btnPouv1 = new JButton("Affutage de lame", icoPouv1);
		btnPouv1.setBackground(new Color(169, 169, 169));
		btnPouv1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controleur.pouvoir1();
			}
		});
		btnPouv1.setFont(new Font("Verdana", Font.PLAIN, 18));
		GridBagConstraints gbc_btnPouv1 = new GridBagConstraints();
		gbc_btnPouv1.insets = new Insets(0, 0, 5, 0);
		gbc_btnPouv1.gridx = 0;
		gbc_btnPouv1.gridy = 1;
		panelOuest.add(btnPouv1, gbc_btnPouv1);

		
		//POUVOIR n°2
		 
		ImageIcon icoPouv2 = new ImageIcon("Images/Icones/Icone Lame Ardente.png");
		JButton btnPouv2 = new JButton("Lame Ardente", icoPouv2);
		btnPouv2.setBackground(new Color(169, 169, 169));
		btnPouv2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPouv2.setFont(new Font("Verdana", Font.PLAIN, 18));
		GridBagConstraints gbc_btnPouv2 = new GridBagConstraints();
		gbc_btnPouv2.insets = new Insets(0, 0, 5, 0);
		gbc_btnPouv2.gridx = 0;
		gbc_btnPouv2.gridy = 2;
		panelOuest.add(btnPouv2, gbc_btnPouv2);

		
		//POUVOIR n°3
	
		ImageIcon icoPouv3 = new ImageIcon("Images/Icones/Icone Tranchage Critique.png");
		JButton btnPouv3 = new JButton("Tranchage critique", icoPouv3);
		btnPouv3.setBackground(new Color(169, 169, 169));
		btnPouv3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPouv3.setFont(new Font("Verdana", Font.PLAIN, 18));
		GridBagConstraints gbc_btnPouv3 = new GridBagConstraints();
		gbc_btnPouv3.insets = new Insets(0, 0, 5, 0);
		gbc_btnPouv3.gridx = 0;
		gbc_btnPouv3.gridy = 3;
		panelOuest.add(btnPouv3, gbc_btnPouv3);

	
		//POUVOIR n°4
		 
		ImageIcon icoPouv4 = new ImageIcon("Images/Icones/Icone Coup de Pouce Divin.png");
		JButton btnPouv4 = new JButton("Coup de pouce divin", icoPouv4);
		btnPouv4.setBackground(new Color(169, 169, 169));
		btnPouv4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPouv4.setFont(new Font("Verdana", Font.PLAIN, 18));
		GridBagConstraints gbc_btnPouv4 = new GridBagConstraints();
		gbc_btnPouv4.gridx = 0;
		gbc_btnPouv4.gridy = 4;
		panelOuest.add(btnPouv4, gbc_btnPouv4);

		
		JPanel panelInterface = new JPanel();
		panelInterface.setBackground(Color.LIGHT_GRAY);
		panelInterface.setSize(400, 400);
		contentPane.add(panelInterface, BorderLayout.CENTER);
		panelInterface.setLayout(new BoxLayout(panelInterface, BoxLayout.Y_AXIS));
		
		JLabel lblMonstrenom = new JLabel("monstre.nom");
		lblMonstrenom.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblMonstrenom.setForeground(new Color(105, 105, 105));
		lblMonstrenom.setFont(new Font("Verdana", Font.BOLD, 20));
		panelInterface.add(lblMonstrenom);
		
		JButton button = new JButton("");
		button.setSize(400, 400);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.setIcon(new ImageIcon("Images/Minotaure.png"));
		panelInterface.add(button);
		button.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblMonstrepdv = new JLabel("monstre.pdv");
		lblMonstrepdv.setForeground(new Color(105, 105, 105));
		lblMonstrepdv.setFont(new Font("Verdana", Font.BOLD, 20));
		lblMonstrepdv.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelInterface.add(lblMonstrepdv);
	}

}
