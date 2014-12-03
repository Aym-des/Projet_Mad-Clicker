package Graphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JFramePartieTest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePartieTest frame = new JFramePartieTest();
					frame.setSize(800, 480);
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
	public JFramePartieTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		JButton btnNouvellePartie = new JButton("Nouvelle Partie");
		GridBagConstraints gbc_btnNouvellePartie = new GridBagConstraints();
		gbc_btnNouvellePartie.insets = new Insets(0, 0, 5, 0);
		gbc_btnNouvellePartie.gridx = 0;
		gbc_btnNouvellePartie.gridy = 0;
		panel_1.add(btnNouvellePartie, gbc_btnNouvellePartie);
		JButton btnQuitter = new JButton("Quitter");
		GridBagConstraints gbc_btnQuitter = new GridBagConstraints();
		gbc_btnQuitter.fill = GridBagConstraints.BOTH;
		gbc_btnQuitter.gridx = 0;
		gbc_btnQuitter.gridy = 1;
		panel_1.add(btnQuitter, gbc_btnQuitter);
		
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 0;
		contentPane.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		JLabel lblNomjoueur = new JLabel("NOMJOUEUR");
		GridBagConstraints gbc_lblNomjoueur = new GridBagConstraints();
		gbc_lblNomjoueur.gridwidth = 2;
		gbc_lblNomjoueur.insets = new Insets(0, 0, 5, 0);
		gbc_lblNomjoueur.gridx = 0;
		gbc_lblNomjoueur.gridy = 0;
		panel_2.add(lblNomjoueur, gbc_lblNomjoueur);
		JLabel lblDgatsParClic = new JLabel("D\u00E9gats par clic :");
		GridBagConstraints gbc_lblDgatsParClic = new GridBagConstraints();
		gbc_lblDgatsParClic.anchor = GridBagConstraints.EAST;
		gbc_lblDgatsParClic.insets = new Insets(0, 0, 5, 5);
		gbc_lblDgatsParClic.gridx = 0;
		gbc_lblDgatsParClic.gridy = 1;
		panel_2.add(lblDgatsParClic, gbc_lblDgatsParClic);
		JLabel lblNewLabel = new JLabel("99999999999999999999999999999999999999");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		JLabel lblDgatsParSeconde = new JLabel("D\u00E9gats par seconde :");
		GridBagConstraints gbc_lblDgatsParSeconde = new GridBagConstraints();
		gbc_lblDgatsParSeconde.anchor = GridBagConstraints.EAST;
		gbc_lblDgatsParSeconde.insets = new Insets(0, 0, 5, 5);
		gbc_lblDgatsParSeconde.gridx = 0;
		gbc_lblDgatsParSeconde.gridy = 2;
		panel_2.add(lblDgatsParSeconde, gbc_lblDgatsParSeconde);
		JLabel lblIntPds = new JLabel("int dps");
		GridBagConstraints gbc_lblIntPds = new GridBagConstraints();
		gbc_lblIntPds.insets = new Insets(0, 0, 5, 0);
		gbc_lblIntPds.gridx = 1;
		gbc_lblIntPds.gridy = 2;
		panel_2.add(lblIntPds, gbc_lblIntPds);
		JLabel lblNiveau = new JLabel("Niveau :");
		GridBagConstraints gbc_lblNiveau = new GridBagConstraints();
		gbc_lblNiveau.anchor = GridBagConstraints.EAST;
		gbc_lblNiveau.insets = new Insets(0, 0, 0, 5);
		gbc_lblNiveau.gridx = 0;
		gbc_lblNiveau.gridy = 3;
		panel_2.add(lblNiveau, gbc_lblNiveau);
		JLabel lblIntNiv = new JLabel("int niv");
		GridBagConstraints gbc_lblIntNiv = new GridBagConstraints();
		gbc_lblIntNiv.gridx = 1;
		gbc_lblIntNiv.gridy = 3;
		panel_2.add(lblIntNiv, gbc_lblIntNiv);
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 1;
		contentPane.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		JButton btnPouvoir = new JButton("Pouvoir 1");
		GridBagConstraints gbc_btnPouvoir = new GridBagConstraints();
		gbc_btnPouvoir.insets = new Insets(0, 0, 5, 5);
		gbc_btnPouvoir.gridx = 0;
		gbc_btnPouvoir.gridy = 0;
		panel_3.add(btnPouvoir, gbc_btnPouvoir);
		JButton btnPouvoir_1 = new JButton("Pouvoir 2");
		GridBagConstraints gbc_btnPouvoir_1 = new GridBagConstraints();
		gbc_btnPouvoir_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnPouvoir_1.gridx = 0;
		gbc_btnPouvoir_1.gridy = 1;
		panel_3.add(btnPouvoir_1, gbc_btnPouvoir_1);
		JButton btnPouvoir_2 = new JButton("Pouvoir 3");
		GridBagConstraints gbc_btnPouvoir_2 = new GridBagConstraints();
		gbc_btnPouvoir_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnPouvoir_2.gridx = 0;
		gbc_btnPouvoir_2.gridy = 2;
		panel_3.add(btnPouvoir_2, gbc_btnPouvoir_2);
		JButton btnPouvoirN = new JButton("Pouvoir n");
		GridBagConstraints gbc_btnPouvoirN = new GridBagConstraints();
		gbc_btnPouvoirN.insets = new Insets(0, 0, 0, 5);
		gbc_btnPouvoirN.gridx = 0;
		gbc_btnPouvoirN.gridy = 3;
		panel_3.add(btnPouvoirN, gbc_btnPouvoirN);
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		JButton btnNewButton = new JButton("INTERFACE CLIQUABLE");
		panel.add(btnNewButton);
	}

}

