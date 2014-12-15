package Graphique;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Font;

import javax.swing.JTextField;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Parametres.Parametres;
import tcp.ClientTCP;

public class JFrameClient extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Parametres param; 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameClient frame = new JFrameClient();
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
	public JFrameClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("Images/Icones/Icone Crossed Swords.png"));
		setTitle("Connexion au serveur");
		setBounds(100, 100, 600, 160);
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
		
		JLabel lblNumroDePort = new JLabel("Num\u00E9ro de port du serveur :");
		lblNumroDePort.setForeground(Color.DARK_GRAY);
		lblNumroDePort.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblNumroDePort = new GridBagConstraints();
		gbc_lblNumroDePort.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumroDePort.gridx = 0;
		gbc_lblNumroDePort.gridy = 0;
		contentPane.add(lblNumroDePort, gbc_lblNumroDePort);
		
		JLabel lblNewLabel = new JLabel(Integer.toString(param.NUM_PORT));
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblAdresse = new JLabel("Entrez l'adresse IP du serveur : ");
		lblAdresse.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblAdresse = new GridBagConstraints();
		gbc_lblAdresse.insets = new Insets(5, 0, 20, 5);
		gbc_lblAdresse.anchor = GridBagConstraints.WEST;
		gbc_lblAdresse.gridx = 0;
		gbc_lblAdresse.gridy = 1;
		contentPane.add(lblAdresse, gbc_lblAdresse);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
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
				ClientTCP.creationsocket(textField.getText());
				System.out.println();
				JFrameNewGame newGame = new JFrameNewGame();
				newGame.setVisible(true);
				dispose();
			}
		});
	}

}
