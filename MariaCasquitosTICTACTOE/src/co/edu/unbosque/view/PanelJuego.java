package co.edu.unbosque.view;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelJuego extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField matrizJuego[][];

	public PanelJuego() {
		setLayout(new GridLayout(3, 3));// se define el grid de 2x2
		llenarPanel();
		setVisible(true);

	}

	/**
	 * Este metodo genera el tablero donde se va a jugar. Es una matriz
	 * compuesta de campos de texto de 3x3
	 */
	private void llenarPanel() {
		matrizJuego = new JTextField[3][3];
		// cargar
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizJuego[i][j] = new JTextField();

				add(matrizJuego[i][j]);
			}
		}
	}

}
