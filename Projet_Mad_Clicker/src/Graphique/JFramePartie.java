package Graphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.CardLayout;

import javax.swing.SwingConstants;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Controleur.Controleur;
import java.awt.Color;

public class JFramePartie extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePartie frame = new JFramePartie();
					frame.setSize(1280, 720);;;
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
	public JFramePartie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 498);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.gridwidth = 3;
		panel_8.setSize(200, 200);
		gbc_panel_8.insets = new Insets(0, 0, 5, 0);
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 0;
		gbc_panel_8.gridy = 0;
		contentPane.add(panel_8, gbc_panel_8);
		
		JLabel label = new JLabel(new ImageIcon("images/Crossed Swords.png"));
		panel_8.add(label);
		
		JLabel lblMadClicker = new JLabel("MAD CLICKER");
		GridBagConstraints gbc_lblMadClicker = new GridBagConstraints();
		gbc_lblMadClicker.insets = new Insets(0, 0, 5, 5);
		gbc_lblMadClicker.gridx = 1;
		gbc_lblMadClicker.gridy = 1;
		contentPane.add(lblMadClicker, gbc_lblMadClicker);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 2;
		contentPane.add(panel, gbc_panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JButton btnNewButton = new JButton("Nouvelle Partie");
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel.add(panel_4);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		panel.add(btnNewButton_1);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 2;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNomjoueur = new JLabel("this.nomJoueur");
		GridBagConstraints gbc_lblNomjoueur = new GridBagConstraints();
		gbc_lblNomjoueur.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomjoueur.gridx = 0;
		gbc_lblNomjoueur.gridy = 0;
		panel_1.add(lblNomjoueur, gbc_lblNomjoueur);
		
		JLabel lblNiveau = new JLabel("Niveau ");
		GridBagConstraints gbc_lblNiveau = new GridBagConstraints();
		gbc_lblNiveau.insets = new Insets(0, 0, 5, 5);
		gbc_lblNiveau.gridx = 1;
		gbc_lblNiveau.gridy = 0;
		panel_1.add(lblNiveau, gbc_lblNiveau);
		
		JLabel lblThisniveau = new JLabel("this.niveau");
		GridBagConstraints gbc_lblThisniveau = new GridBagConstraints();
		gbc_lblThisniveau.insets = new Insets(0, 0, 5, 0);
		gbc_lblThisniveau.gridx = 2;
		gbc_lblThisniveau.gridy = 0;
		panel_1.add(lblThisniveau, gbc_lblThisniveau);
		
		JLabel lblDgtsParClic = new JLabel("D\u00E9g\u00E2ts par clic :");
		GridBagConstraints gbc_lblDgtsParClic = new GridBagConstraints();
		gbc_lblDgtsParClic.insets = new Insets(0, 0, 5, 5);
		gbc_lblDgtsParClic.gridx = 0;
		gbc_lblDgtsParClic.gridy = 1;
		panel_1.add(lblDgtsParClic, gbc_lblDgtsParClic);
		
		JLabel lblThisdpc = new JLabel("this.dpc");
		GridBagConstraints gbc_lblThisdpc = new GridBagConstraints();
		gbc_lblThisdpc.insets = new Insets(0, 0, 5, 5);
		gbc_lblThisdpc.gridx = 1;
		gbc_lblThisdpc.gridy = 1;
		panel_1.add(lblThisdpc, gbc_lblThisdpc);
		
		JLabel lblDgtsParSeconde = new JLabel("D\u00E9g\u00E2ts par seconde :");
		GridBagConstraints gbc_lblDgtsParSeconde = new GridBagConstraints();
		gbc_lblDgtsParSeconde.insets = new Insets(0, 0, 0, 5);
		gbc_lblDgtsParSeconde.gridx = 0;
		gbc_lblDgtsParSeconde.gridy = 2;
		panel_1.add(lblDgtsParSeconde, gbc_lblDgtsParSeconde);
		
		JLabel lblThisdps = new JLabel("this.dps");
		GridBagConstraints gbc_lblThisdps = new GridBagConstraints();
		gbc_lblThisdps.insets = new Insets(0, 0, 0, 5);
		gbc_lblThisdps.gridx = 1;
		gbc_lblThisdps.gridy = 2;
		panel_1.add(lblThisdps, gbc_lblThisdps);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 0, 5);
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 3;
		contentPane.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
		
		JButton btnNewButton_2 = new JButton("Pouvoir 1");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_2.add(btnNewButton_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_2.add(panel_5);
		
		JButton btnNewButton_3 = new JButton("Pouvoir 2");
		btnNewButton_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_2.add(btnNewButton_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_2.add(panel_6);
		
		JButton btnNewButton_4 = new JButton("Pouvoir 3");
		btnNewButton_4.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_2.add(btnNewButton_4);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.LIGHT_GRAY);
		panel_2.add(panel_7);
		
		JButton btnNewButton_5 = new JButton("Pouvoir n");
		btnNewButton_5.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_2.add(btnNewButton_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setLayout(null);
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 2;
		gbc_panel_3.gridy = 3;
		contentPane.add(panel_3, gbc_panel_3);
		
		JButton btnNewButton_6 = new JButton(new ImageIcon("images/Minotaure.png"));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Controleur.attaque();
			}
		});
		btnNewButton_6.setBounds(0, 0, 240, 240);
		panel_3.add(btnNewButton_6);
	}
}
