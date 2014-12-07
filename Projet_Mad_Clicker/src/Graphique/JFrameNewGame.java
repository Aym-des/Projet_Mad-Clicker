package Graphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JTextField;

import Créature.Joueur;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameNewGame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameNewGame frame = new JFrameNewGame();
					frame.setTitle("MAD CLICKER");
					frame.setSize(350, 150);
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
	public JFrameNewGame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNouvellePartie = new JLabel("BIENVENUE SUR MAC CLICKER");
		lblNouvellePartie.setForeground(Color.DARK_GRAY);
		lblNouvellePartie.setBackground(Color.GRAY);
		lblNouvellePartie.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblNouvellePartie = new GridBagConstraints();
		gbc_lblNouvellePartie.gridwidth = 2;
		gbc_lblNouvellePartie.insets = new Insets(5, 0, 15, 5);
		gbc_lblNouvellePartie.gridx = 0;
		gbc_lblNouvellePartie.gridy = 0;
		contentPane.add(lblNouvellePartie, gbc_lblNouvellePartie);
		
		JLabel lblEntrezVotreNom = new JLabel("Entrez votre nom :");
		lblEntrezVotreNom.setForeground(Color.DARK_GRAY);
		lblEntrezVotreNom.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblEntrezVotreNom = new GridBagConstraints();
		gbc_lblEntrezVotreNom.anchor = GridBagConstraints.WEST;
		gbc_lblEntrezVotreNom.insets = new Insets(0, 0, 15, 5);
		gbc_lblEntrezVotreNom.gridx = 0;
		gbc_lblEntrezVotreNom.gridy = 1;
		contentPane.add(lblEntrezVotreNom, gbc_lblEntrezVotreNom);
		
		textField = new JTextField();
/**	Envoyer le texte écrit dans le textField dans le nom du nouveau joueur
		 * joueur.setNom(textField.getText());
*/
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 15, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		GridBagConstraints gbc_btnQuitter = new GridBagConstraints();
		gbc_btnQuitter.insets = new Insets(0, 0, 0, 5);
		gbc_btnQuitter.gridx = 0;
		gbc_btnQuitter.gridy = 2;
		contentPane.add(btnQuitter, gbc_btnQuitter);
		
		JButton btnConfirmer = new JButton("Confirmer");
		GridBagConstraints gbc_btnConfirmer = new GridBagConstraints();
		gbc_btnConfirmer.gridx = 1;
		gbc_btnConfirmer.gridy = 2;
		contentPane.add(btnConfirmer, gbc_btnConfirmer);
	}

}
