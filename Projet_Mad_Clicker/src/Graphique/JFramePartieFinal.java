package Graphique;

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

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.BoxLayout;

import Controleur.Controleur;
import Parametres.Parametres;
import Créature.Joueur;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFramePartieFinal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePartieFinal frame = new JFramePartieFinal();
					frame.setTitle("MAD CLICKER");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFramePartieFinal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panelOuest = new JPanel();
		panelOuest.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panelOuest, BorderLayout.WEST);
		GridBagLayout gbl_panelOuest = new GridBagLayout();
		gbl_panelOuest.columnWidths = new int[] {450, 0};
		gbl_panelOuest.rowHeights = new int[] {50, 50, 50, 50, 50};
		gbl_panelOuest.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panelOuest.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelOuest.setLayout(gbl_panelOuest);

		JButton btnNewButton = new JButton("Pouvoir 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controleur.pouvoir1();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 18));
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		panelOuest.add(btnNewButton, gbc_btnNewButton);

		JButton btnNewButton_1 = new JButton("Pouvoir 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 18));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 1;
		panelOuest.add(btnNewButton_1, gbc_btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Pouvoir 3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 18));
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 2;
		panelOuest.add(btnNewButton_2, gbc_btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Pouvoir n");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setFont(new Font("Verdana", Font.PLAIN, 18));
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 3;
		panelOuest.add(btnNewButton_3, gbc_btnNewButton_3);

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

		JLabel label = new JLabel("");
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		label.setIcon(new ImageIcon("C:\\Users\\Jorge\\Desktop\\Images MadClicker\\Crossed Swords.png"));
		panelPartie.add(label);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panelPartie.add(panel);

		JButton btnNewButton_4 = new JButton("Nouvelle partie");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Parametres.nouvellePartie();
			}
		});
		panel.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Quitter");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		panel.add(btnNewButton_5);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		panelNord.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);

		JLabel lblNomDuJoueur = new JLabel("Nom du joueur");
		lblNomDuJoueur.setForeground(Color.DARK_GRAY);
		lblNomDuJoueur.setFont(new Font("Verdana", Font.BOLD, 20));
		GridBagConstraints gbc_lblNomDuJoueur = new GridBagConstraints();
		gbc_lblNomDuJoueur.gridwidth = 2;
		gbc_lblNomDuJoueur.insets = new Insets(0, 0, 5, 0);
		gbc_lblNomDuJoueur.gridx = 0;
		gbc_lblNomDuJoueur.gridy = 0;
		panel_1.add(lblNomDuJoueur, gbc_lblNomDuJoueur);

		JLabel lblNewLabel = new JLabel("Niveau :");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("this.niveau");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JLabel lblDgtsParClic = new JLabel("D\u00E9g\u00E2ts par clic :");
		lblDgtsParClic.setForeground(Color.GRAY);
		lblDgtsParClic.setFont(new Font("Verdana", Font.BOLD, 20));
		GridBagConstraints gbc_lblDgtsParClic = new GridBagConstraints();
		gbc_lblDgtsParClic.anchor = GridBagConstraints.WEST;
		gbc_lblDgtsParClic.insets = new Insets(0, 0, 5, 5);
		gbc_lblDgtsParClic.gridx = 0;
		gbc_lblDgtsParClic.gridy = 2;
		panel_1.add(lblDgtsParClic, gbc_lblDgtsParClic);

		JLabel lblThisdpc = new JLabel("this.dpc");
		lblThisdpc.setForeground(Color.GRAY);
		lblThisdpc.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblThisdpc = new GridBagConstraints();
		gbc_lblThisdpc.insets = new Insets(0, 0, 5, 0);
		gbc_lblThisdpc.anchor = GridBagConstraints.WEST;
		gbc_lblThisdpc.gridx = 1;
		gbc_lblThisdpc.gridy = 2;
		panel_1.add(lblThisdpc, gbc_lblThisdpc);

		JLabel lblDgtsParSeconde = new JLabel("D\u00E9g\u00E2ts par seconde :");
		lblDgtsParSeconde.setForeground(Color.GRAY);
		lblDgtsParSeconde.setFont(new Font("Verdana", Font.BOLD, 20));
		GridBagConstraints gbc_lblDgtsParSeconde = new GridBagConstraints();
		gbc_lblDgtsParSeconde.anchor = GridBagConstraints.WEST;
		gbc_lblDgtsParSeconde.insets = new Insets(0, 0, 0, 5);
		gbc_lblDgtsParSeconde.gridx = 0;
		gbc_lblDgtsParSeconde.gridy = 3;
		panel_1.add(lblDgtsParSeconde, gbc_lblDgtsParSeconde);

		JLabel lblThisdps = new JLabel("this.dps");
		lblThisdps.setForeground(Color.GRAY);
		lblThisdps.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblThisdps = new GridBagConstraints();
		gbc_lblThisdps.anchor = GridBagConstraints.WEST;
		gbc_lblThisdps.gridx = 1;
		gbc_lblThisdps.gridy = 3;
		panel_1.add(lblThisdps, gbc_lblThisdps);

		JPanel panelInterface = new JPanel();
		panelInterface.setBackground(Color.LIGHT_GRAY);
		panelInterface.setSize(400, 400);
		contentPane.add(panelInterface, BorderLayout.CENTER);

		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\Jorge\\Desktop\\Images MadClicker\\Minotaure_Final.png"));
		panelInterface.add(btnNewButton_6);
	}

}
