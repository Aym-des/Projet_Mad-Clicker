package Graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;

import javax.swing.JButton;

import principal.Executable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameModeDeJeu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameModeDeJeu frame = new JFrameModeDeJeu();
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
	public JFrameModeDeJeu() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("Images/Icones/Icone Crossed Swords.png"));
		setTitle("Selection mode de jeu");
		setBounds(700, 350, 350, 140);
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
		
		JLabel lblMode = new JLabel("S\u00E9lectionnez votre mode de jeu :");
		lblMode.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_lblMode = new GridBagConstraints();
		gbc_lblMode.gridwidth = 2;
		gbc_lblMode.insets = new Insets(10, 0, 20, 0);
		gbc_lblMode.gridx = 0;
		gbc_lblMode.gridy = 0;
		contentPane.add(lblMode, gbc_lblMode);
		
		JButton btnNewButton = new JButton("SINGLE PLAYER");
		btnNewButton.setBackground(new Color(169, 169, 169));
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrameNewGame newGame = new JFrameNewGame();
				newGame.setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton_1 = new JButton("MULTIPLAYER");
		btnNewButton_1.setBackground(new Color(169, 169, 169));
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 1;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrameAccueil accueil = new JFrameAccueil();
				accueil.setVisible(true);
				dispose();
			}
		});
	}

}
