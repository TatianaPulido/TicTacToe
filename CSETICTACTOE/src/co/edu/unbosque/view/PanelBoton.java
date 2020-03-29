package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBoton extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JButton botonJugar;
	
	public PanelBoton() {
		setLayout(null);
		setBackground(Color.BLACK);
		inicializarComponentes();
		setVisible(true);
	}
	
	private void inicializarComponentes() {
		botonJugar = new JButton("Juego");
		botonJugar.setBounds(177, 10, 130, 40);
		botonJugar.setFont(new Font("Showcard Gothic",Font.BOLD,20));
		botonJugar.setOpaque(true);
		botonJugar.setBackground(Color.WHITE);
		add(botonJugar);
	}
	
	public JButton getBotonJugar() {
		return botonJugar;
	}
	
	public void setBotonJugar(JButton botonJugar) {
		this.botonJugar = botonJugar;
	}
	
}