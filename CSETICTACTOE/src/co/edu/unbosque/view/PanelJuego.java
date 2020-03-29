package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelJuego extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField[] posicion;

	/**
	 * Metodo constructor del panel de juego.
	 */
	public PanelJuego() {
		setLayout(new GridLayout(3, 3, 20, 20));// Se crea una matriz 3x3 con un
												// espaciado tanto horizontal
												// como vertical.
		posicion = new JTextField[9];
		llenarPanel();
		setBackground(Color.BLACK);// Se pinta el fondo de negro.
		setVisible(true);
	}

	/**
	 * Este metodo genera el tablero donde se va a jugar. Es una matriz
	 * compuesta de campos de texto de 3x3
	 * 
	 */
	private void llenarPanel() {

		posicion[0] = new JTextField();
		posicion[0].setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion[0].setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion[0]);

		posicion[1] = new JTextField();
		posicion[1].setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion[1].setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion[1]);

		posicion[2] = new JTextField();
		posicion[2].setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion[2].setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion[2]);

		posicion[3] = new JTextField();
		posicion[3].setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion[3].setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion[3]);

		posicion[4] = new JTextField();
		posicion[4].setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion[4].setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion[4]);

		posicion[5] = new JTextField();
		posicion[5].setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion[5].setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion[5]);

		posicion[6] = new JTextField();
		posicion[6].setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion[6].setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion[6]);

		posicion[7] = new JTextField();
		posicion[7].setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion[7].setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion[7]);

		posicion[8] = new JTextField();
		posicion[8].setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion[8].setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion[8]);
	}

	public void asignarValoresJTextField(String[] asignarPosiciones) {
		for (int i = 0; i < 9; i++) {
			posicion[i].setText(asignarPosiciones[i]);
			if (posicion[i].getText().equals("X")
					|| posicion[i].getText().equals("O")) {
				posicion[i].setEnabled(false);
			}
		}
	}

	public String[] mostrarValoresJTextField() {
		String[] valorPosiciones = new String[9];
		for (int i = 0; i < 9; i++) {
			valorPosiciones[i] = posicion[i].getText();
		}
		return valorPosiciones;
	}

	public void reiniciar() {
		for (int i = 0; i < 9; i++) {
			posicion[i].setText("");
			posicion[i].setEnabled(true);
		}
	}
}