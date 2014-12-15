package Graphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;

import principal.Executable;

import java.awt.FlowLayout;

public class JFrameResultats extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameResultats frame = new JFrameResultats();
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
	public JFrameResultats() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 250, 800, 470);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("Images/Crossed Swords.png"));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridwidth = 2;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 0;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblResult = new JLabel("R\u00E9sultats");
		lblResult.setForeground(new Color(105, 105, 105));
		lblResult.setFont(new Font("Verdana", Font.BOLD, 24));
		GridBagConstraints gbc_lblResult = new GridBagConstraints();
		gbc_lblResult.gridwidth = 2;
		gbc_lblResult.insets = new Insets(0, 0, 5, 0);
		gbc_lblResult.gridx = 0;
		gbc_lblResult.gridy = 1;
		contentPane.add(lblResult, gbc_lblResult);
		
		JLabel lblNombreDeVictimes = new JLabel("Nombre de victimes :");
		lblNombreDeVictimes.setForeground(new Color(105, 105, 105));
		lblNombreDeVictimes.setFont(new Font("Verdana", Font.BOLD, 18));
		GridBagConstraints gbc_lblNombreDeVictimes = new GridBagConstraints();
		gbc_lblNombreDeVictimes.anchor = GridBagConstraints.WEST;
		gbc_lblNombreDeVictimes.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreDeVictimes.gridx = 0;
		gbc_lblNombreDeVictimes.gridy = 2;
		contentPane.add(lblNombreDeVictimes, gbc_lblNombreDeVictimes);
		
		JLabel lblNbVictimes = new JLabel(Integer.toString(Executable.Le_Joueur.getNbVictimes()));
		lblNbVictimes.setForeground(new Color(105, 105, 105));
		lblNbVictimes.setFont(new Font("Verdana", Font.BOLD, 18));
		GridBagConstraints gbc_lblNbVictimes = new GridBagConstraints();
		gbc_lblNbVictimes.anchor = GridBagConstraints.EAST;
		gbc_lblNbVictimes.insets = new Insets(0, 0, 5, 0);
		gbc_lblNbVictimes.gridx = 1;
		gbc_lblNbVictimes.gridy = 2;
		contentPane.add(lblNbVictimes, gbc_lblNbVictimes);
		
		JLabel lblNiveauFinal = new JLabel("Niveau final :");
		lblNiveauFinal.setForeground(new Color(105, 105, 105));
		lblNiveauFinal.setFont(new Font("Verdana", Font.BOLD, 18));
		GridBagConstraints gbc_lblNiveauFinal = new GridBagConstraints();
		gbc_lblNiveauFinal.anchor = GridBagConstraints.WEST;
		gbc_lblNiveauFinal.insets = new Insets(0, 0, 5, 5);
		gbc_lblNiveauFinal.gridx = 0;
		gbc_lblNiveauFinal.gridy = 3;
		contentPane.add(lblNiveauFinal, gbc_lblNiveauFinal);
		
		JLabel lblNiveau = new JLabel(Integer.toString(Executable.Le_Joueur.getNiveau()));
		lblNiveau.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNiveau.setForeground(new Color(105, 105, 105));
		GridBagConstraints gbc_lblNiveau = new GridBagConstraints();
		gbc_lblNiveau.anchor = GridBagConstraints.EAST;
		gbc_lblNiveau.insets = new Insets(0, 0, 5, 0);
		gbc_lblNiveau.gridx = 1;
		gbc_lblNiveau.gridy = 3;
		contentPane.add(lblNiveau, gbc_lblNiveau);
		
		JLabel lblNewLabel_1 = new JLabel("Informations sur la partie ");
		lblNewLabel_1.setForeground(new Color(105, 105, 105));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 22));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 4;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblExprienceAcquise = new JLabel("Exp\u00E9rience acquise :");
		lblExprienceAcquise.setFont(new Font("Verdana", Font.BOLD, 18));
		lblExprienceAcquise.setForeground(new Color(105, 105, 105));
		GridBagConstraints gbc_lblExprienceAcquise = new GridBagConstraints();
		gbc_lblExprienceAcquise.anchor = GridBagConstraints.WEST;
		gbc_lblExprienceAcquise.insets = new Insets(0, 0, 5, 5);
		gbc_lblExprienceAcquise.gridx = 0;
		gbc_lblExprienceAcquise.gridy = 5;
		contentPane.add(lblExprienceAcquise, gbc_lblExprienceAcquise);
		
		JLabel lblExp = new JLabel(Integer.toString(Executable.Le_Joueur.getExperience()));
		lblExp.setFont(new Font("Verdana", Font.BOLD, 18));
		lblExp.setForeground(new Color(105, 105, 105));
		GridBagConstraints gbc_lblExp = new GridBagConstraints();
		gbc_lblExp.anchor = GridBagConstraints.EAST;
		gbc_lblExp.insets = new Insets(0, 0, 5, 0);
		gbc_lblExp.gridx = 1;
		gbc_lblExp.gridy = 5;
		contentPane.add(lblExp, gbc_lblExp);
		
		JLabel lblNombreDeDgats = new JLabel("Nombre de d\u00E9gats par clic :");
		lblNombreDeDgats.setForeground(new Color(105, 105, 105));
		lblNombreDeDgats.setFont(new Font("Verdana", Font.BOLD, 18));
		GridBagConstraints gbc_lblNombreDeDgats = new GridBagConstraints();
		gbc_lblNombreDeDgats.anchor = GridBagConstraints.WEST;
		gbc_lblNombreDeDgats.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreDeDgats.gridx = 0;
		gbc_lblNombreDeDgats.gridy = 6;
		contentPane.add(lblNombreDeDgats, gbc_lblNombreDeDgats);
		
		JLabel lblDpc = new JLabel(Integer.toString(Executable.Le_Joueur.getDpc()));
		lblDpc.setForeground(new Color(105, 105, 105));
		lblDpc.setFont(new Font("Verdana", Font.BOLD, 18));
		GridBagConstraints gbc_lblDpc = new GridBagConstraints();
		gbc_lblDpc.anchor = GridBagConstraints.EAST;
		gbc_lblDpc.insets = new Insets(0, 0, 5, 0);
		gbc_lblDpc.gridx = 1;
		gbc_lblDpc.gridy = 6;
		contentPane.add(lblDpc, gbc_lblDpc);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de pi\u00E8ces restantes :");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel_2.setForeground(new Color(105, 105, 105));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 7;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblPiece = new JLabel(Integer.toString(Executable.Le_Joueur.getPieces()));
		lblPiece.setFont(new Font("Verdana", Font.BOLD, 18));
		lblPiece.setForeground(new Color(105, 105, 105));
		GridBagConstraints gbc_lblPiece = new GridBagConstraints();
		gbc_lblPiece.insets = new Insets(0, 0, 5, 0);
		gbc_lblPiece.anchor = GridBagConstraints.EAST;
		gbc_lblPiece.gridx = 1;
		gbc_lblPiece.gridy = 7;
		contentPane.add(lblPiece, gbc_lblPiece);
	}

}
