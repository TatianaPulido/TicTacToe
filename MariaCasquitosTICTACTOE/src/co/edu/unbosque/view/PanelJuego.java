package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelJuego extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField matrizJuego[][];

	/**
	 * Metodo constructor del panel de juego.
	 */
	public PanelJuego() {
		setLayout(new GridLayout(3, 3, 20, 20));// Se crea una matriz 3x3 con un
												// espaciado tanto horizontal
												// como vertical.
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

		matrizJuego = new JTextField[3][3];
		// cargar
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizJuego[i][j] = new JTextField();
				matrizJuego[i][j].setHorizontalAlignment(JLabel.CENTER); // Alinear
																			// el
																			// texto
																			// en
																			// el
																			// centro
				matrizJuego[i][j].setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
																				// el
																				// tipo
																				// y
																				// tamaño
																				// de
																				// letra
				add(matrizJuego[i][j]); // Se añaden los campos de textos a la
										// matriz
			}
		}
	}

	public JTextField[][] getMatrizJuego() {
		return matrizJuego;
	}

	public void setMatrizJuego(JTextField[][] matrizJuego) {
		this.matrizJuego = matrizJuego;
	}

}
