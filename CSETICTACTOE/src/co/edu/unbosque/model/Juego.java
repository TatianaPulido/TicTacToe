package co.edu.unbosque.model;

import javax.swing.JOptionPane;

import co.edu.unbosque.view.Mensaje;

public class Juego {

	private int matrizJuego[][];
	public int posicionJugadaPC[];
	public int numerojugadasPC;
	private boolean yaSeJugo;
	Mensaje mensaje;

	public Juego() {

		matrizJuego = new int[3][3];
		posicionJugadaPC = new int[4];
		yaSeJugo = false;
		mensaje = new Mensaje();
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
			asignarValorMatriz(1, 2);
			posicionPC = 2;
			yaSeJugo = true;
		} else if (matrizJuego[0][0] == 1 && matrizJuego[0][1] == 0
				&& matrizJuego[0][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 1);
			yaSeJugo = true;
			posicionPC = 1;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[0][1] == 1
				&& matrizJuego[0][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 0);
			yaSeJugo = true;
			posicionPC = 0;
		} else if (matrizJuego[1][0] == 1 && matrizJuego[1][1] == 1
				&& matrizJuego[1][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 5);
			yaSeJugo = true;
			posicionPC = 5;
		} else if (matrizJuego[1][0] == 1 && matrizJuego[1][1] == 0
				&& matrizJuego[1][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 4);
			yaSeJugo = true;
			posicionPC = 4;
		} else if (matrizJuego[1][0] == 0 && matrizJuego[1][1] == 1
				&& matrizJuego[1][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 3);
			yaSeJugo = true;
			posicionPC = 3;
		} else if (matrizJuego[2][0] == 1 && matrizJuego[2][1] == 1
				&& matrizJuego[2][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 8);
			yaSeJugo = true;
			posicionPC = 8;
		} else if (matrizJuego[2][0] == 1 && matrizJuego[2][1] == 0
				&& matrizJuego[2][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 7);
			yaSeJugo = true;
			posicionPC = 7;
		} else if (matrizJuego[2][0] == 0 && matrizJuego[2][1] == 1
				&& matrizJuego[2][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 6);
			yaSeJugo = true;
			posicionPC = 6;
		} else if (matrizJuego[0][0] == 1 && matrizJuego[1][0] == 1
				&& matrizJuego[2][0] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 6);
			yaSeJugo = true;
			posicionPC = 6;
		} else if (matrizJuego[0][0] == 1 && matrizJuego[1][0] == 0
				&& matrizJuego[2][0] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 3);
			yaSeJugo = true;
			posicionPC = 3;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[1][0] == 1
				&& matrizJuego[2][0] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 0);
			yaSeJugo = true;
			posicionPC = 0;
		} else if (matrizJuego[0][1] == 1 && matrizJuego[1][1] == 1
				&& matrizJuego[2][1] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 7);
			yaSeJugo = true;
			posicionPC = 7;
		} else if (matrizJuego[0][1] == 1 && matrizJuego[1][1] == 0
				&& matrizJuego[2][1] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 3);
			yaSeJugo = true;
			posicionPC = 3;
		} else if (matrizJuego[0][1] == 0 && matrizJuego[1][1] == 1
				&& matrizJuego[2][1] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 0);
			yaSeJugo = true;
			posicionPC = 0;
		} else if (matrizJuego[0][2] == 1 && matrizJuego[1][2] == 1
				&& matrizJuego[2][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 8);
			yaSeJugo = true;
			posicionPC = 8;
		} else if (matrizJuego[0][2] == 1 && matrizJuego[1][2] == 0
				&& matrizJuego[2][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 5);
			yaSeJugo = true;
			posicionPC = 5;
		} else if (matrizJuego[0][2] == 0 && matrizJuego[1][2] == 1
				&& matrizJuego[2][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 2);
			yaSeJugo = true;
			posicionPC = 2;
		} else if (matrizJuego[0][0] == 1 && matrizJuego[1][1] == 1
				&& matrizJuego[2][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 8);
			yaSeJugo = true;
			posicionPC = 8;
		} else if (matrizJuego[0][0] == 1 && matrizJuego[1][1] == 0
				&& matrizJuego[2][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 4);
			yaSeJugo = true;
			posicionPC = 4;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[1][1] == 1
				&& matrizJuego[2][2] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 0);
			yaSeJugo = true;
			posicionPC = 0;
		} else if (matrizJuego[0][2] == 1 && matrizJuego[1][1] == 1
				&& matrizJuego[2][0] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 6);
			yaSeJugo = true;
			posicionPC = 6;
		} else if (matrizJuego[0][2] == 1 && matrizJuego[1][1] == 0
				&& matrizJuego[2][0] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 4);
			yaSeJugo = true;
			posicionPC = 4;
		} else if (matrizJuego[0][2] == 0 && matrizJuego[1][1] == 1
				&& matrizJuego[2][0] == 1 && !yaSeJugo) {
			asignarValorMatriz(1, 2);
			yaSeJugo = true;
			posicionPC = 2;
		}
		return posicionPC;
	}

	public int jugarDefender() {
		int posicionPC = 0;
		if (matrizJuego[0][0] == 2 && matrizJuego[0][1] == 2
				&& matrizJuego[0][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 2);
			posicionPC = 2;
			yaSeJugo = true;
		} else if (matrizJuego[0][0] == 2 && matrizJuego[0][1] == 0
				&& matrizJuego[0][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 1);
			yaSeJugo = true;
			posicionPC = 1;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[0][1] == 2
				&& matrizJuego[0][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 0);
			yaSeJugo = true;
			posicionPC = 0;
		} else if (matrizJuego[1][0] == 2 && matrizJuego[1][1] == 2
				&& matrizJuego[1][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 5);
			yaSeJugo = true;
			posicionPC = 5;
		} else if (matrizJuego[1][0] == 2 && matrizJuego[1][1] == 0
				&& matrizJuego[1][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 4);
			yaSeJugo = true;
			posicionPC = 4;
		} else if (matrizJuego[1][0] == 0 && matrizJuego[1][1] == 2
				&& matrizJuego[1][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 3);
			yaSeJugo = true;
			posicionPC = 3;
		}else if (matrizJuego[2][0] == 2 && matrizJuego[2][1] == 2
				&& matrizJuego[2][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 8);
			yaSeJugo = true;
			posicionPC = 8;
		} else if (matrizJuego[2][0] == 2 && matrizJuego[2][1] == 0
				&& matrizJuego[2][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 7);
			yaSeJugo = true;
			posicionPC = 7;
		} else if (matrizJuego[2][0] == 0 && matrizJuego[2][1] == 2
				&& matrizJuego[2][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 6);
			yaSeJugo = true;
			posicionPC = 6;
		} else if (matrizJuego[0][0] == 2 && matrizJuego[1][0] == 2
				&& matrizJuego[2][0] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 6);
			yaSeJugo = true;
			posicionPC = 6;
		} else if (matrizJuego[0][0] == 2 && matrizJuego[1][0] == 0
				&& matrizJuego[2][0] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 3);
			yaSeJugo = true;
			posicionPC = 3;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[1][0] == 2
				&& matrizJuego[2][0] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 0);
			yaSeJugo = true;
			posicionPC = 0;
		} else if (matrizJuego[0][1] == 2 && matrizJuego[1][1] == 2
				&& matrizJuego[2][1] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 7);
			yaSeJugo = true;
			posicionPC = 7;
		} else if (matrizJuego[0][1] == 2 && matrizJuego[1][1] == 0
				&& matrizJuego[2][1] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 4);
			yaSeJugo = true;
			posicionPC = 4;
		} else if (matrizJuego[0][1] == 0 && matrizJuego[1][1] == 2
				&& matrizJuego[2][1] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 1);
			yaSeJugo = true;
			posicionPC = 1;
		} else if (matrizJuego[0][2] == 2 && matrizJuego[1][2] == 2
				&& matrizJuego[2][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 8);
			yaSeJugo = true;
			posicionPC = 8;
		} else if (matrizJuego[0][2] == 2 && matrizJuego[1][2] == 0
				&& matrizJuego[2][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 5);
			yaSeJugo = true;
			posicionPC = 5;
		} else if (matrizJuego[0][2] == 0 && matrizJuego[1][2] == 2
				&& matrizJuego[2][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 2);
			yaSeJugo = true;
			posicionPC = 2;
		} else if (matrizJuego[0][0] == 2 && matrizJuego[1][1] == 2
				&& matrizJuego[2][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 8);
			yaSeJugo = true;
			posicionPC = 8;
		} else if (matrizJuego[0][0] == 2 && matrizJuego[1][1] == 0
				&& matrizJuego[2][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 4);
			yaSeJugo = true;
			posicionPC = 4;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[1][1] == 2
				&& matrizJuego[2][2] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 0);
			yaSeJugo = true;
			posicionPC = 0;
		} else if (matrizJuego[0][2] == 2 && matrizJuego[1][1] == 2
				&& matrizJuego[2][0] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 6);
			yaSeJugo = true;
			posicionPC = 6;
		} else if (matrizJuego[0][2] == 2 && matrizJuego[1][1] == 0
				&& matrizJuego[2][0] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 4);
			yaSeJugo = true;
			posicionPC = 4;
		} else if (matrizJuego[0][2] == 0 && matrizJuego[1][1] == 2
				&& matrizJuego[2][0] == 2 && !yaSeJugo) {
			asignarValorMatriz(1, 2);
			yaSeJugo = true;
			posicionPC = 2;
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

	public int jugarCasillasVacias() {
		int posicionPC = 0;
		if (matrizJuego[0][0] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 0);
			yaSeJugo = true;
			posicionPC = 0;
		} else if (matrizJuego[0][1] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 1);
			yaSeJugo = true;
			posicionPC = 1;
		} else if (matrizJuego[0][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 2);
			yaSeJugo = true;
			posicionPC = 2;
		} else if (matrizJuego[1][0] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 3);
			yaSeJugo = true;
			posicionPC = 3;
		} else if (matrizJuego[1][1] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 4);
			yaSeJugo = true;
			posicionPC = 4;
		} else if (matrizJuego[1][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 5);
			yaSeJugo = true;
			posicionPC = 5;
		} else if (matrizJuego[2][0] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 6);
			yaSeJugo = true;
			posicionPC = 6;
		} else if (matrizJuego[2][1] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 7);
			yaSeJugo = true;
			posicionPC = 7;
		} else if (matrizJuego[2][2] == 0 && !yaSeJugo) {
			asignarValorMatriz(1, 8);
			yaSeJugo = true;
			posicionPC = 8;
		}
		return posicionPC;
	}

	public int jugarPC() {
		int posicionPC = 0;
		String n = "";
		if (!yaSeJugo) {
			posicionPC = jugarAleatorio();
			n = "juge aleatorio";
		}
		if (!yaSeJugo) {
			posicionPC = jugarAtacar();
			n = "jugue atacar";
		}
		if (!yaSeJugo) {
			posicionPC = jugarDefender();
			n = "juge defender";
		}
		if (!yaSeJugo) {
			posicionPC = jugarCentro();
			n = "jugue centro";
		}
		if (!yaSeJugo) {
			posicionPC = jugarCasillasVacias();
			n = "jugue casillas vacias";
		}
		numerojugadasPC++;
		int i = numerojugadasPC - 1;
		posicionJugadaPC[i] = posicionPC;
		yaSeJugo = false;
		System.out.println(n);
		return posicionPC;
	}
	
	public String Mensajes(int contador) {
		String texto = "";
		if ((matrizJuego[0][0] == 1 && matrizJuego[0][1] == 1
				&& matrizJuego[0][2] == 1) || (matrizJuego[1][0] == 1 && matrizJuego[1][1] == 1
				&& matrizJuego[1][2] == 1) || (matrizJuego[2][0] == 1 && matrizJuego[2][1] == 1
				&& matrizJuego[2][2] == 1) || (matrizJuego[0][0] == 1 && matrizJuego[1][0] == 1
				&& matrizJuego[2][0] == 1) || (matrizJuego[0][1] == 1 && matrizJuego[1][1] == 1
				&& matrizJuego[2][1] == 1) || (matrizJuego[0][2] == 1 && matrizJuego[1][2] == 1
				&& matrizJuego[2][2] == 1) || (matrizJuego[0][0] == 1 && matrizJuego[1][1] == 1
				&& matrizJuego[2][2] == 1) || (matrizJuego[0][2] == 1 && matrizJuego[1][1] == 1
				&& matrizJuego[2][0] == 1)) {
			
			texto = "He ganado";
			
		}else{
			if((matrizJuego[0][0] == 2 && matrizJuego[0][1] == 2
				&& matrizJuego[0][2] == 2) || (matrizJuego[1][0] == 2 && matrizJuego[1][1] == 2
				&& matrizJuego[1][2] == 2) || (matrizJuego[2][0] == 2 && matrizJuego[2][1] == 2
				&& matrizJuego[2][2] == 2) || (matrizJuego[0][0] == 2 && matrizJuego[1][0] == 2
				&& matrizJuego[2][0] == 2) || (matrizJuego[0][1] == 2 && matrizJuego[1][1] == 2
				&& matrizJuego[2][1] == 2) || (matrizJuego[0][2] == 2 && matrizJuego[1][2] == 2
				&& matrizJuego[2][2] == 2) || (matrizJuego[0][0] == 2 && matrizJuego[1][1] == 2
				&& matrizJuego[2][2] == 2) || (matrizJuego[0][2] == 2 && matrizJuego[1][1] == 2
				&& matrizJuego[2][0] == 2)) {
				
				texto = "Has ganado :(";
				
			}else{
				if(contador==9) {
			
				texto =  "Empate";
				}else {
					texto = "";
				}
		}
		}
		return texto;
		}
	
	
	public boolean finJuego(String texto) {
		boolean finJuego = false;
		if(texto == "") {
			finJuego = false;
		}else {
			finJuego = true;
		}
		return finJuego;
	}
	
	
	}
