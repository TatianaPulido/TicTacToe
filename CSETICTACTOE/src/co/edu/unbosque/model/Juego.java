package co.edu.unbosque.model;

import javax.swing.JOptionPane;

public class Juego {

	private int matrizJuego[][];

	public Juego() {

		matrizJuego = new int[3][3];
		inicializarMatriz();
	}

	private void inicializarMatriz() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizJuego[i][j] = 0;
			}
		}
	}

	public void asignarValorMatriz(int valorDeJugada, int posicion) {
		if (posicion == 0) {
			matrizJuego[0][0] = valorDeJugada;
		} else if (posicion == 1) {
			matrizJuego[0][1] = valorDeJugada;
		} else if (posicion == 2) {
			matrizJuego[0][2] = valorDeJugada;
		} else if (posicion == 3) {
			matrizJuego[1][0] = valorDeJugada;
		} else if (posicion == 4) {
			matrizJuego[1][1] = valorDeJugada;
		} else if (posicion == 6) {
			matrizJuego[1][2] = valorDeJugada;
		} else if (posicion == 7) {
			matrizJuego[2][0] = valorDeJugada;
		} else if (posicion == 8) {
			matrizJuego[2][1] = valorDeJugada;
		} else if (posicion == 1) {
			matrizJuego[2][2] = valorDeJugada;
		}
	}

	public int mostrarValorMatriz(int posFila, int posColumna) {
		return matrizJuego[posFila][posColumna];
	}

	public void mostrarMatriz() {
		String cadena = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				cadena = cadena + matrizJuego[i][j] + " -||- ";
			}
		}
		JOptionPane.showMessageDialog(null, cadena);
	}
}
