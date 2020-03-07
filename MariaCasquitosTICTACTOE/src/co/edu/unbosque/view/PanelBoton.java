package co.edu.unbosque.view;

import java.awt.Color;

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
		add(botonJugar);
	}

	public JButton getBotonJugar() {
		return botonJugar;
	}

	public void setBotonJugar(JButton botonJugar) {
		this.botonJugar = botonJugar;
	}

}
