package Graphique;

import java.awt.Color;
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
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameAccueil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameAccueil frame = new JFrameAccueil();
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
	public JFrameAccueil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("Images/Icones/Icone Crossed Swords.png"));
		setTitle("Selection Serveur - Client");
		setBounds(700, 350, 350, 160);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblQuestion = new JLabel("Etes-vous SERVEUR ou CLIENT ?");
		lblQuestion.setForeground(Color.DARK_GRAY);
		lblQuestion.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblQuestion = new GridBagConstraints();
		gbc_lblQuestion.gridwidth = 2;
		gbc_lblQuestion.insets = new Insets(15, 0, 25, 0);
		gbc_lblQuestion.gridx = 0;
		gbc_lblQuestion.gridy = 0;
		contentPane.add(lblQuestion, gbc_lblQuestion);
		
		JButton btnServeur = new JButton("SERVEUR");
		btnServeur.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnServeur.setBackground(new Color(169, 169, 169));
		GridBagConstraints gbc_btnServeur = new GridBagConstraints();
		gbc_btnServeur.insets = new Insets(0, 0, 0, 5);
		gbc_btnServeur.gridx = 0;
		gbc_btnServeur.gridy = 1;
		contentPane.add(btnServeur, gbc_btnServeur);
		btnServeur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrameServeur serveur = new JFrameServeur();
				serveur.setVisible(true);
				dispose();
			}
		});
		
		JButton btnClient = new JButton("CLIENT");
		btnClient.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnClient.setBackground(new Color(169, 169, 169));
		GridBagConstraints gbc_btnClient = new GridBagConstraints();
		gbc_btnClient.gridx = 1;
		gbc_btnClient.gridy = 1;
		contentPane.add(btnClient, gbc_btnClient);
		btnClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrameClient client = new JFrameClient();
				client.setVisible(true);
				dispose();
			}
		});
	}

}
