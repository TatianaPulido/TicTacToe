package co.edu.unbosque.model;

import javax.swing.JOptionPane;

public class Juego {

	private int matrizJuego[][];
	public int posicionJugadaPC[];
	public int numerojugadasPC;
	private boolean yaSeJugo;

	public Juego() {

		matrizJuego = new int[3][3];
		posicionJugadaPC = new int[4];
		yaSeJugo = false;
		inicializarMatriz();
		inicializarArreglo();
	}

	private void inicializarArreglo() {

		for (int i = 0; i < 4; i++) {

			posicionJugadaPC[i] = -1;

		}

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
		} else if (posicion == 5) {
			matrizJuego[1][2] = valorDeJugada;
		} else if (posicion == 6) {
			matrizJuego[2][0] = valorDeJugada;
		} else if (posicion == 7) {
			matrizJuego[2][1] = valorDeJugada;
		} else if (posicion == 8) {
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

				cadena = cadena + "| " + matrizJuego[i][j] + " |";

				if (j == 2) {
					cadena = cadena + "\n";
				}

			}
		}

		System.out.println(cadena);

	}

	public int jugarAleatorio() {
		int posicionPC = 0;
		if (matrizJuego[0][0] == 0 && matrizJuego[0][1] == 0
				&& matrizJuego[0][2] == 0 && matrizJuego[1][0] == 0
				&& matrizJuego[1][2] == 0 && matrizJuego[2][0] == 0
				&& matrizJuego[2][1] == 0 && matrizJuego[2][2] == 0
				&& matrizJuego[1][1] == 2 && !yaSeJugo) {
			int numeroAleatorio = (int) (Math.random() * 8);
			if (numeroAleatorio != 4) {
				asignarValorMatriz(1, numeroAleatorio);

				yaSeJugo = true;
				posicionPC = numeroAleatorio;
			}
		}
		return posicionPC;
	}

	public int jugarAtacar() {
		int posicionPC = 0;
		if (matrizJuego[0][0] == 1 && matrizJuego[0][1] == 1
				&& matrizJuego[0][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 3);
			posicionPC = 3;
			yaSeJugo = true;
		} else if (matrizJuego[0][0] == 1 && matrizJuego[0][1] == 0
				&& matrizJuego[0][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 2);
			yaSeJugo = true;
			posicionPC = 2;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[0][1] == 1
				&& matrizJuego[0][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 1);
			yaSeJugo = true;
			posicionPC = 1;
		} else if (matrizJuego[1][0] == 1 && matrizJuego[1][1] == 1
				&& matrizJuego[1][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 6);
			yaSeJugo = true;
			posicionPC = 6;
		} else if (matrizJuego[1][0] == 1 && matrizJuego[1][1] == 0
				&& matrizJuego[1][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 5);
			yaSeJugo = true;
			posicionPC = 5;
		} else if (matrizJuego[1][0] == 0 && matrizJuego[1][1] == 1
				&& matrizJuego[1][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 4);
			yaSeJugo = true;
			posicionPC = 4;
		} else if (matrizJuego[2][0] == 1 && matrizJuego[2][1] == 1
				&& matrizJuego[2][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 9);
			yaSeJugo = true;
			posicionPC = 9;
		} else if (matrizJuego[2][0] == 1 && matrizJuego[2][1] == 0
				&& matrizJuego[2][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 8);
			yaSeJugo = true;
			posicionPC = 8;
		} else if (matrizJuego[2][0] == 0 && matrizJuego[2][1] == 1
				&& matrizJuego[2][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 7);
			yaSeJugo = true;
			posicionPC = 7;
		} else if (matrizJuego[0][0] == 1 && matrizJuego[1][0] == 1
				&& matrizJuego[2][0] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 7);
			yaSeJugo = true;
			posicionPC = 7;
		} else if (matrizJuego[0][0] == 1 && matrizJuego[1][0] == 0
				&& matrizJuego[2][0] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 4);
			yaSeJugo = true;
			posicionPC = 4;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[1][0] == 1
				&& matrizJuego[2][0] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 1);
			yaSeJugo = true;
			posicionPC = 1;
		} else if (matrizJuego[0][1] == 1 && matrizJuego[1][1] == 1
				&& matrizJuego[2][1] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 8);
			yaSeJugo = true;
			posicionPC = 8;
		} else if (matrizJuego[0][1] == 1 && matrizJuego[1][1] == 0
				&& matrizJuego[2][1] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 5);
			yaSeJugo = true;
			posicionPC = 5;
		} else if (matrizJuego[0][1] == 0 && matrizJuego[1][1] == 1
				&& matrizJuego[2][1] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 2);
			yaSeJugo = true;
			posicionPC = 2;
		} else if (matrizJuego[0][2] == 1 && matrizJuego[1][2] == 1
				&& matrizJuego[2][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 9);
			yaSeJugo = true;
			posicionPC = 9;
		} else if (matrizJuego[0][2] == 1 && matrizJuego[1][2] == 0
				&& matrizJuego[2][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 6);
			yaSeJugo = true;
			posicionPC = 6;
		} else if (matrizJuego[0][2] == 0 && matrizJuego[1][2] == 1
				&& matrizJuego[2][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 3);
			yaSeJugo = true;
			posicionPC = 3;
		} else if (matrizJuego[0][0] == 1 && matrizJuego[1][1] == 1
				&& matrizJuego[2][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 9);
			yaSeJugo = true;
			posicionPC = 9;
		} else if (matrizJuego[0][0] == 1 && matrizJuego[1][1] == 0
				&& matrizJuego[2][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 5);
			yaSeJugo = true;
			posicionPC = 5;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[1][1] == 1
				&& matrizJuego[2][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 1);
			yaSeJugo = true;
			posicionPC = 1;
		} else if (matrizJuego[0][2] == 1 && matrizJuego[1][1] == 1
				&& matrizJuego[2][0] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 7);
			yaSeJugo = true;
			posicionPC = 7;
		} else if (matrizJuego[0][2] == 1 && matrizJuego[1][1] == 0
				&& matrizJuego[2][0] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 5);
			yaSeJugo = true;
			posicionPC = 5;
		} else if (matrizJuego[0][2] == 0 && matrizJuego[1][1] == 1
				&& matrizJuego[2][0] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 3);
			yaSeJugo = true;
			posicionPC = 3;
		}
		return posicionPC;
	}

	public int jugarDefender() {
		int posicionPC = 0;
		if (matrizJuego[0][0] == 2 && matrizJuego[0][1] == 2
				&& matrizJuego[0][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 3);
			posicionPC = 3;
			yaSeJugo = true;
		} else if (matrizJuego[0][0] == 2 && matrizJuego[0][1] == 0
				&& matrizJuego[0][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 2);
			yaSeJugo = true;
			posicionPC = 2;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[0][1] == 2
				&& matrizJuego[0][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 1);
			yaSeJugo = true;
			posicionPC = 1;
		} else if (matrizJuego[1][0] == 2 && matrizJuego[1][1] == 2
				&& matrizJuego[1][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 6);
			yaSeJugo = true;
			posicionPC = 6;
		} else if (matrizJuego[1][0] == 2 && matrizJuego[1][1] == 0
				&& matrizJuego[1][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 5);
			yaSeJugo = true;
			posicionPC = 6;
		} else if (matrizJuego[1][0] == 0 && matrizJuego[1][1] == 2
				&& matrizJuego[1][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 4);
			yaSeJugo = true;
			posicionPC = 4;
		}
		if (matrizJuego[2][0] == 2 && matrizJuego[2][1] == 2
				&& matrizJuego[2][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 9);
			yaSeJugo = true;
			posicionPC = 9;
		} else if (matrizJuego[2][0] == 2 && matrizJuego[2][1] == 0
				&& matrizJuego[2][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 8);
			yaSeJugo = true;
			posicionPC = 8;
		} else if (matrizJuego[2][0] == 0 && matrizJuego[2][1] == 2
				&& matrizJuego[2][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 7);
			yaSeJugo = true;
			posicionPC = 7;
		}
		if (matrizJuego[0][0] == 2 && matrizJuego[1][0] == 2
				&& matrizJuego[2][0] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 7);
			yaSeJugo = true;
			posicionPC = 7;
		} else if (matrizJuego[0][0] == 2 && matrizJuego[1][0] == 0
				&& matrizJuego[2][0] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 4);
			yaSeJugo = true;
			posicionPC = 4;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[1][0] == 2
				&& matrizJuego[2][0] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 1);
			yaSeJugo = true;
			posicionPC = 1;
		}
		if (matrizJuego[0][1] == 2 && matrizJuego[1][1] == 2
				&& matrizJuego[2][1] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 8);
			yaSeJugo = true;
			posicionPC = 8;
		} else if (matrizJuego[0][1] == 2 && matrizJuego[1][1] == 0
				&& matrizJuego[2][1] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 5);
			yaSeJugo = true;
			posicionPC = 5;
		} else if (matrizJuego[0][1] == 0 && matrizJuego[1][1] == 2
				&& matrizJuego[2][1] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 2);
			yaSeJugo = true;
			posicionPC = 2;
		}
		if (matrizJuego[0][2] == 2 && matrizJuego[1][2] == 2
				&& matrizJuego[2][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 9);
			yaSeJugo = true;
			posicionPC = 9;
		} else if (matrizJuego[0][2] == 2 && matrizJuego[1][2] == 0
				&& matrizJuego[2][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 6);
			yaSeJugo = true;
			posicionPC = 6;
		} else if (matrizJuego[0][2] == 0 && matrizJuego[1][2] == 2
				&& matrizJuego[2][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 3);
			yaSeJugo = true;
			posicionPC = 3;
		}
		if (matrizJuego[0][0] == 2 && matrizJuego[1][1] == 2
				&& matrizJuego[2][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 9);
			yaSeJugo = true;
			posicionPC = 9;
		} else if (matrizJuego[0][0] == 2 && matrizJuego[1][1] == 0
				&& matrizJuego[2][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 5);
			yaSeJugo = true;
			posicionPC = 5;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[1][1] == 2
				&& matrizJuego[2][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 1);
			yaSeJugo = true;
			posicionPC = 1;
		}
		if (matrizJuego[0][2] == 2 && matrizJuego[1][1] == 2
				&& matrizJuego[2][0] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 7);
			yaSeJugo = true;
			posicionPC = 7;
		} else if (matrizJuego[0][2] == 2 && matrizJuego[1][1] == 0
				&& matrizJuego[2][0] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 5);
			yaSeJugo = true;
			posicionPC = 5;
		} else if (matrizJuego[0][2] == 0 && matrizJuego[1][1] == 2
				&& matrizJuego[2][0] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 3);
			yaSeJugo = true;
			posicionPC = 3;
		}
		return posicionPC;
	}

	public int jugarCentro() {
		int posicionPC = 0;
		if (matrizJuego[1][1] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 4);
			yaSeJugo = true;
			posicionPC = 4;
		}
		return posicionPC;
	}

	public int jugadasEspeciales() {
		int posicionPC = 0;
		if (matrizJuego[1][0] == 2 && matrizJuego[1][1] == 1
				&& matrizJuego[2][2] == 2 && matrizJuego[2][0] == 0
				&& !yaSeJugo) {
			asignarValorMatriz(1, 7);
			yaSeJugo = true;
			posicionPC = 7;
		} else if (matrizJuego[0][0] == 2 && matrizJuego[1][1] == 1
				&& matrizJuego[2][2] == 2 && matrizJuego[2][1] == 0
				&& !yaSeJugo) {
			asignarValorMatriz(1, 8);
			yaSeJugo = true;
			posicionPC = 8;
		} else if (matrizJuego[0][2] == 2 && matrizJuego[1][1] == 1
				&& matrizJuego[2][0] == 2 && matrizJuego[1][0] == 0
				&& !yaSeJugo) {
			asignarValorMatriz(1, 4);
			yaSeJugo = true;
			posicionPC = 4;
		} else if (matrizJuego[0][2] == 2 && matrizJuego[1][1] == 1
				&& matrizJuego[2][1] == 2 && matrizJuego[1][2] == 0
				&& !yaSeJugo) {
			asignarValorMatriz(1, 6);
			yaSeJugo = true;
			posicionPC = 6;
		} else if (matrizJuego[0][0] == 2 && matrizJuego[1][1] == 1
				&& matrizJuego[2][1] == 2 && matrizJuego[2][0] == 0
				&& !yaSeJugo) {
			asignarValorMatriz(1, 7);
			yaSeJugo = true;
			posicionPC = 7;
		}

		return posicionPC;
	}

	public int jugarCasillasVacias() {
		int posicionPC = 0;
		if (matrizJuego[0][0] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 1);
			yaSeJugo = true;
			posicionPC = 1;
		} else if (matrizJuego[0][1] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 2);
			yaSeJugo = true;
			posicionPC = 2;
		} else if (matrizJuego[0][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 3);
			yaSeJugo = true;
			posicionPC = 3;
		} else if (matrizJuego[1][0] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 4);
			yaSeJugo = true;
			posicionPC = 4;
		} else if (matrizJuego[1][1] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 5);
			yaSeJugo = true;
			posicionPC = 5;
		} else if (matrizJuego[1][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 6);
			yaSeJugo = true;
			posicionPC = 6;
		} else if (matrizJuego[2][0] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 7);
			yaSeJugo = true;
			posicionPC = 7;
		} else if (matrizJuego[2][1] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 8);
			yaSeJugo = true;
			posicionPC = 8;
		} else if (matrizJuego[2][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 9);
			yaSeJugo = true;
			posicionPC = 9;
		}
		return posicionPC;
	}

	public int jugarPC() {
		int posicionPC = 0;
		if (!yaSeJugo) {
			posicionPC = jugarAleatorio();
		}
		if (!yaSeJugo) {
			posicionPC = jugarAtacar();
		}
		if (!yaSeJugo) {
			posicionPC = jugarDefender();
		}
		if (!yaSeJugo) {
			posicionPC = jugarCentro();
		}
		if (!yaSeJugo) {
			posicionPC = jugadasEspeciales();
		}
		if (!yaSeJugo) {
			posicionPC = jugarCasillasVacias();
		}
		numerojugadasPC++;
		int i = numerojugadasPC - 1;
		posicionJugadaPC[i] = posicionPC;

		yaSeJugo = false;
		JOptionPane.showMessageDialog(null, "Posicion pc= " + posicionPC);
		return posicionPC;
	}
}