package Graphique;

/* A FAIRE :
 * Mettre le commentaire Javadoc pour l'attribut contentpane
 * Définir un nombre max de lettres pour le nom du joueur (pour peremttre vérif dans framenewgame)
 */


import Parametres.Parametres;
import principal.Executable;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
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
	
	private JLabel lblXP;
	/**
	 * contentPane Le JPanel
	 */
	public JPanel contentPane;
	
	private Timer buff = null;


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
	public void setLblNiveauDuJoueur(int NiveauJoueur) {
		lblNiveauDuJoueur.setText(Integer.toString(NiveauJoueur));
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
	public void setLblDegatsParClics(int dpc) {
		lblDegatsParClics.setText(Integer.toString(dpc));
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
	public void setLblDegatsParSecondes(int dps) {
		lblDegatsParSecondes.setText(Integer.toString(dps));
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
	public void setLblNombreDePieces(int nbpieces) {
		lblNombreDePieces.setText(Integer.toString(nbpieces));
	}
	
	public String getLblXP(){
		return lblXP.getText();
	}
	
	public void setLblXP(int xpActuel, int xpProchNiv){
		lblXP.setText(Integer.toString(xpActuel) + "/" + Integer.toString(xpProchNiv) );
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
		
		Parametres param = new Parametres();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("Images/Icones/Icone Crossed Swords.png"));
		setBounds(100, 100, 1100, 800);
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
		label_ImgMadClicker.setIcon(new ImageIcon("Images/Crossed Swords.png"));
		panelPartie.add(label_ImgMadClicker);

		JPanel panelPartie_2 = new JPanel();
		panelPartie_2.setBackground(Color.LIGHT_GRAY);
		panelPartie.add(panelPartie_2);

		ImageIcon icoNewGame = new ImageIcon("Images/Icones/Icone New Game.png");
		JButton btnNewButton_4 = new JButton("Nouvelle partie", icoNewGame);
		btnNewButton_4.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnNewButton_4.setBackground(new Color(169, 169, 169));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrameModeDeJeu modeDeJeu = new JFrameModeDeJeu();
				modeDeJeu.setVisible(true);
			}
		});
		panelPartie_2.add(btnNewButton_4);

		ImageIcon icoQuit = new ImageIcon("Images/Icones/Icone Quitter.png");
		JButton btnNewButton_5 = new JButton("Quitter", icoQuit);
		btnNewButton_5.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnNewButton_5.setBackground(new Color(169, 169, 169));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panelPartie_2.add(btnNewButton_5);

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
		gbl_panel_Infos.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_Infos.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_Infos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_Infos.setLayout(gbl_panel_Infos);
		lblNomDuJoueur = new JLabel(Executable.Le_Joueur.getNom());
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

		lblNiveauDuJoueur = new JLabel(Integer.toString(Executable.Le_Joueur.getNiveau()));
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

		lblDegatsParClics = new JLabel(Integer.toString(Executable.Le_Joueur.getDpc()));
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

		lblDegatsParSecondes = new JLabel(Integer.toString(Executable.Le_Joueur.getDps()));
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
		gbc_lblPieces.insets = new Insets(0, 0, 5, 5);
		gbc_lblPieces.gridx = 0;
		gbc_lblPieces.gridy = 4;
		panel_Infos.add(lblPieces, gbc_lblPieces);

		lblNombreDePieces = new JLabel(Integer.toString(Executable.Le_Joueur.getPieces()));
		lblNombreDePieces.setForeground(new Color(105, 105, 105));
		lblNombreDePieces.setFont(new Font("Verdana", Font.BOLD, 18));
		GridBagConstraints gbc_lblNombreDePieces = new GridBagConstraints();
		gbc_lblNombreDePieces.insets = new Insets(0, 0, 5, 0);
		gbc_lblNombreDePieces.anchor = GridBagConstraints.WEST;
		gbc_lblNombreDePieces.gridx = 1;
		gbc_lblNombreDePieces.gridy = 4;
		panel_Infos.add(lblNombreDePieces, gbc_lblNombreDePieces);

		JLabel lblExperience = new JLabel("Exp\u00E9rience / Exp. niv. Suivant :");
		lblExperience.setForeground(new Color(105, 105, 105));
		lblExperience.setFont(new Font("Verdana", Font.BOLD, 20));
		GridBagConstraints gbc_lblExperience = new GridBagConstraints();
		gbc_lblExperience.anchor = GridBagConstraints.WEST;
		gbc_lblExperience.insets = new Insets(0, 0, 0, 5);
		gbc_lblExperience.gridx = 0;
		gbc_lblExperience.gridy = 5;
		panel_Infos.add(lblExperience, gbc_lblExperience);

		lblXP = new JLabel(Integer.toString(Executable.Le_Joueur.getExperience()));
		lblXP.setForeground(new Color(105, 105, 105));
		lblXP.setFont(new Font("Verdana", Font.BOLD, 18));
		GridBagConstraints gbc_lblXP = new GridBagConstraints();
		gbc_lblXP.insets = new Insets(0, 0, 0, 5);
		gbc_lblXP.gridx = 1;
		gbc_lblXP.gridy = 5;
		panel_Infos.add(lblXP, gbc_lblXP);

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
		gbc_lblListeDesPouvoirs.insets = new Insets(100, 0, 20, 0);
		gbc_lblListeDesPouvoirs.gridx = 0;
		gbc_lblListeDesPouvoirs.gridy = 0;
		panelOuest.add(lblListeDesPouvoirs, gbc_lblListeDesPouvoirs);


		//POUVOIR n°1


		ImageIcon icoPouv1 = new ImageIcon("Images/Icones/Icone Enclume.png");
		JButton btnPouv1 = new JButton("Affutage de lame (" + Integer.toString(param.COUT_PIECES_POUVOIR_1) +" Pieces)", icoPouv1);
		btnPouv1.setBackground(new Color(169, 169, 169));
		btnPouv1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				if( (principal.Executable.Le_Joueur.getPieces() >= param.COUT_PIECES_POUVOIR_1) && (buff == null) ) {
					Executable.achatPouvoir(1);
					
					buff = new Timer(param.DEFAULT_BUFF_TIME * 1000, new ActionListener(){
						public void actionPerformed(ActionEvent e){
							Executable.finBuff(1);
							buff.stop();
							buff = null;
						}
					});	
					buff.start();
				}
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
		JButton btnPouv2 = new JButton("Lame Ardente (" + Integer.toString(param.COUT_PIECES_POUVOIR_2) +" Pieces)", icoPouv2);
		btnPouv2.setBackground(new Color(169, 169, 169));
		btnPouv2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( (principal.Executable.Le_Joueur.getPieces() >= param.COUT_PIECES_POUVOIR_2) && (buff == null)){
					
					Executable.achatPouvoir(2);
					
					buff = new Timer(param.DEFAULT_BUFF_TIME * 1000, new ActionListener(){
						public void actionPerformed(ActionEvent e){
							Executable.finBuff(2);
							buff.stop();
							buff = null;
						}
					});
					buff.start();
				}
				
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
		JButton btnPouv3 = new JButton("Tranchage critique (" + Integer.toString(param.COUT_PIECES_POUVOIR_3) +" Pieces)", icoPouv3);
		btnPouv3.setBackground(new Color(169, 169, 169));
		btnPouv3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( (principal.Executable.Le_Joueur.getPieces() >= param.COUT_PIECES_POUVOIR_3) && (buff == null)){
					
					Executable.achatPouvoir(3);
					
					buff = new Timer(param.DEFAULT_BUFF_TIME * 1000, new ActionListener(){
						public void actionPerformed(ActionEvent e){
							Executable.finBuff(3);
							buff.stop();
							buff = null;
						}
					});
					buff.start();
				}
				
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
		JButton btnPouv4 = new JButton("Coup de pouce divin (" + Integer.toString(param.COUT_PIECES_POUVOIR_4) +" Pieces)", icoPouv4);
		btnPouv4.setBackground(new Color(169, 169, 169));
		btnPouv4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( (principal.Executable.Le_Joueur.getPieces() >= param.COUT_PIECES_POUVOIR_4) && (buff == null)){
					
					Executable.achatPouvoir(4);
					
					buff = new Timer(param.DEFAULT_BUFF_TIME * 1000, new ActionListener(){
						public void actionPerformed(ActionEvent e){
							Executable.finBuff(4);
							buff.stop();
							buff = null;
						}
					});
					buff.start();
				}
				
			}
		});
		btnPouv4.setFont(new Font("Verdana", Font.PLAIN, 18));
		GridBagConstraints gbc_btnPouv4 = new GridBagConstraints();
		gbc_btnPouv4.gridx = 0;
		gbc_btnPouv4.gridy = 4;
		panelOuest.add(btnPouv4, gbc_btnPouv4);

		/*		
		//PLATEAU DE JEU

		JPanel panelCentre = new JPanel();
		panelCentre.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panelCentre, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panelCentre.setLayout(gbl_panel_1);

		//MONSTRE 1

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		panelCentre.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));

		JLabel lblNewLabel_1 = new JLabel("monstre.nom");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(lblNewLabel_1);

		JButton btnNewButton = new JButton("");
		btnNewButton.setSize(200, 200);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setSize(200, 200);
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("monstre.pdv");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(lblNewLabel_2);


		//Monstre 2

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 0;
		panelCentre.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_2.add(lblNewLabel_3);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("Images/Images/Minotaure.png"));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_2.add(btnNewButton_1);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_2.add(lblNewLabel_4);

		//Monstre 3

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 2;
		gbc_panel_3.gridy = 0;
		panelCentre.add(panel_3, gbc_panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_3.add(lblNewLabel_5);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("Images/Minotaure.png"));
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_3.add(btnNewButton_2);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_3.add(lblNewLabel_6);

		//MONSTRE 4

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 1;
		panelCentre.add(panel_4, gbc_panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_4.add(lblNewLabel_7);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("Images/Minotaure.png"));
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_4.add(btnNewButton_3);

		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_4.add(lblNewLabel_8);

		//MONSTRE 5

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 5, 5);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 1;
		panelCentre.add(panel_5, gbc_panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));

		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_5.add(lblNewLabel_9);

		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton_6.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_5.add(btnNewButton_6);

		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_5.add(lblNewLabel_10);

		//MONSTRE 6

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.insets = new Insets(0, 0, 5, 0);
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.gridx = 2;
		gbc_panel_6.gridy = 1;
		panelCentre.add(panel_6, gbc_panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));

		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_6.add(lblNewLabel_11);

		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton_7.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_6.add(btnNewButton_7);

		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_6.add(lblNewLabel_13);

		//MONSTRE 7

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.insets = new Insets(0, 0, 0, 5);
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 0;
		gbc_panel_7.gridy = 2;
		panelCentre.add(panel_7, gbc_panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.Y_AXIS));

		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_7.add(lblNewLabel_14);

		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setIcon(new ImageIcon("Images/Minotaure.png"));
		btnNewButton_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton_8.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_7.add(btnNewButton_8);

		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_7.add(lblNewLabel_17);

		//MONSTRE 8

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.insets = new Insets(0, 0, 0, 5);
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 1;
		gbc_panel_8.gridy = 2;
		panelCentre.add(panel_8, gbc_panel_8);
		panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.Y_AXIS));

		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_8.add(lblNewLabel_15);

		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton_9.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_8.add(btnNewButton_9);

		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_8.add(lblNewLabel_16);

		//MONSTRE 9

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 2;
		gbc_panel_9.gridy = 2;
		panelCentre.add(panel_9, gbc_panel_9);
		panel_9.setLayout(new BoxLayout(panel_9, BoxLayout.Y_AXIS));

		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_9.add(lblNewLabel_12);

		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton_10.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_9.add(btnNewButton_10);

		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_9.add(lblNewLabel_18);


		/*JPanel panelInterface = new JPanel();
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

		 */
	}

}
