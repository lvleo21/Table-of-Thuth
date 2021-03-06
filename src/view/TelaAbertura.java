package view;

import java.awt.CardLayout;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import model.Som;

public class TelaAbertura extends JPanel {
	
	private JLabel lbWallpaper;
	private JButton btnSingle, btnMultiplayer, btnConfig, btnExit, btnAdd;
	private ImageIcon iiSingle, iiMultiplayer, iiConfig, iiExit, iiWallpaper;
	//private Som somAbertura;
	
	public TelaAbertura(){
		
		setLayout(null);
		
		//somAbertura = new Som("abertura.wav");
		//somAbertura.loop();
		
		
		iiSingle = new ImageIcon("src/img/Single.png");
		iiMultiplayer = new ImageIcon("src/img/Multiplayer.png");
		iiConfig = new ImageIcon("src/img/Config.png");
		iiExit = new ImageIcon("src/img/Exit.png");
		iiWallpaper = new ImageIcon("src/img/TelaAbertura.jpg");
		
		lbWallpaper = new JLabel(iiWallpaper);
		lbWallpaper.setBounds(0, 0, 1000, 700);
		
		btnSingle = new JButton(iiSingle);
		btnSingle.setContentAreaFilled(false);
		btnSingle.setBorderPainted(false);
		btnSingle.setBounds(937, 430, 60, 60);
		btnSingle.setToolTipText("Single");
		
		btnMultiplayer = new JButton(iiMultiplayer);
		btnMultiplayer.setContentAreaFilled(false);
		btnMultiplayer.setBorderPainted(false);
		btnMultiplayer.setBounds(937, 495, 60, 60);
		btnMultiplayer.setToolTipText("Multiplayer");
		
		btnConfig = new JButton(iiConfig);
		btnConfig.setContentAreaFilled(false);
		btnConfig.setBorderPainted(false);
		btnConfig.setBounds(937, 560, 60, 60);
		btnConfig.setToolTipText("Configurações");
		
		btnExit = new JButton(iiExit);
		btnExit.setContentAreaFilled(false);
		btnExit.setBorderPainted(false);
		btnExit.setBounds(937, 625, 60, 60);
		btnExit.setToolTipText("Sair");

		btnAdd = new JButton(new ImageIcon(getClass().getClassLoader().getResource("img/add.png")));
		btnAdd.setContentAreaFilled(false);
		btnAdd.setBorderPainted(false);
		btnAdd.setBounds(5, 5, 64, 64);
		btnAdd.setToolTipText("Adicionar Exercicio");
		
		add(btnSingle);	
		add(btnMultiplayer);
		add(btnConfig);
		add(btnExit);
		add(btnAdd);
		add(lbWallpaper);
		
		
		

	}
	
	

	public JButton getBtnAdd() {
		return btnAdd;
	}



	public JButton getBtnSingle() {
		return btnSingle;
	}

	public JButton getBtnMultiplayer() {
		return btnMultiplayer;
	}

	public JButton getBtnConfig() {
		return btnConfig;
	}

	public JButton getBtnExit() {
		return btnExit;
	}

	/*public Som getSomAbertura() {
		return somAbertura;
	}*/

	
}
