package Graphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JButton;

import java.awt.Insets;

import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import Parametres.Parametres;
import principal.Executable;
import tcp.ServeurTCP;

public class JFrameServeur extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	/**
	 * Les parametres par défault de la partie
	 */	
	public static Parametres param;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameServeur frame = new JFrameServeur();
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
	public JFrameServeur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("Images/Icones/Icone Crossed Swords.png"));
		setTitle("Connexion");
		setBounds(700, 350, 600, 180);
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
		
		JLabel lblVotreNum = new JLabel("Votre num\u00E9ro de port : ");
		lblVotreNum.setForeground(new Color(105, 105, 105));
		lblVotreNum.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblVotreNum = new GridBagConstraints();
		gbc_lblVotreNum.anchor = GridBagConstraints.EAST;
		gbc_lblVotreNum.insets = new Insets(15, 0, 5, 5);
		gbc_lblVotreNum.gridx = 0;
		gbc_lblVotreNum.gridy = 0;
		contentPane.add(lblVotreNum, gbc_lblVotreNum);
		
		JLabel labelPort = new JLabel(Integer.toString(param.NUM_PORT));
		labelPort.setForeground(new Color(105, 105, 105));
		labelPort.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_labelPort = new GridBagConstraints();
		gbc_labelPort.insets = new Insets(0, 0, 5, 0);
		gbc_labelPort.gridx = 1;
		gbc_labelPort.gridy = 0;
		contentPane.add(labelPort, gbc_labelPort);
		
		JLabel lblEntrezLadresseIp = new JLabel("Entrez l'adresse IP du serveur : ");
		lblEntrezLadresseIp.setForeground(new Color(105, 105, 105));
		lblEntrezLadresseIp.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblEntrezLadresseIp = new GridBagConstraints();
		gbc_lblEntrezLadresseIp.anchor = GridBagConstraints.WEST;
		gbc_lblEntrezLadresseIp.insets = new Insets(5, 0, 20, 5);
		gbc_lblEntrezLadresseIp.gridx = 0;
		gbc_lblEntrezLadresseIp.gridy = 1;
		contentPane.add(lblEntrezLadresseIp, gbc_lblEntrezLadresseIp);
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setIcon(new ImageIcon("Images/Icones/Icone Quitter.png"));
		btnQuitter.setBackground(new Color(169, 169, 169));
		GridBagConstraints gbc_btnQuitter = new GridBagConstraints();
		gbc_btnQuitter.insets = new Insets(0, 0, 0, 5);
		gbc_btnQuitter.gridx = 0;
		gbc_btnQuitter.gridy = 2;
		contentPane.add(btnQuitter, gbc_btnQuitter);
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		JButton btnConfirmer = new JButton("Confirmer");
		btnConfirmer.setIcon(new ImageIcon("Images/Icones/Icone Confirmation.png"));
		btnConfirmer.setBackground(new Color(169, 169, 169));
		GridBagConstraints gbc_btnConfirmer = new GridBagConstraints();
		gbc_btnConfirmer.gridx = 1;
		gbc_btnConfirmer.gridy = 2;
		contentPane.add(btnConfirmer, gbc_btnConfirmer);
		btnConfirmer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ServeurTCP.recupAdresse(textField.getText());
				JFrameNewGame newGame = new JFrameNewGame();
				newGame.setVisible(true);
				dispose();
			}
		});
	}

}
