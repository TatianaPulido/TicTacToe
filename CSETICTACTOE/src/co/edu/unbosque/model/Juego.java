package co.edu.unbosque.model;

public class Juego {

	private int matrizJuego[][];
	public int posicionJugadaPC[];
	public int contadorClicks;//Cambiado de Controller
	public int numerojugadasPC;
	private boolean yaSeJugo;
	public boolean yaSeJugoUsuario;//Cambiado de Controller
	public String dondeJugoPC;//Agregado para usar en Controller
	
	private String vX_V_D_XException, vX_ConverX;
	private int vX_Caso, vX_Posicion;

	public Juego() {

		matrizJuego = new int[3][3];
		posicionJugadaPC = new int[4];
		contadorClicks = 0;
		yaSeJugo = false;
		yaSeJugoUsuario = false;
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

	public String mostrarMatrizYJugada() {

		String cadena = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				cadena = cadena + "| " + matrizJuego[i][j] + " |";

				if (j == 2) {
					cadena = cadena + "\n";
				}
			}
		}
		return "Matriz Modelo: \nJugada PC: " + dondeJugoPC + "\n" + cadena;

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
			n = "Jugue aleatorio";
		}
		if (!yaSeJugo) {
			posicionPC = jugarAtacar();
			n = "Jugue atacar";
		}
		if (!yaSeJugo) {
			posicionPC = jugarDefender();
			n = "Juge defender";
		}
		if (!yaSeJugo) {
			posicionPC = jugarCentro();
			n = "Jugue centro";
		}
		if (!yaSeJugo) {
			posicionPC = jugarCasillasVacias();
			n = "Jugue casillas vacias";
		}
		numerojugadasPC++;
		int i = numerojugadasPC - 1;
		posicionJugadaPC[i] = posicionPC;
		yaSeJugo = false;
		dondeJugoPC = n;
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
			
			texto = "¡Ja, ja te gane humano!";
			
		}else {
			if((matrizJuego[0][0] == 2 && matrizJuego[0][1] == 2
					&& matrizJuego[0][2] == 2) || (matrizJuego[1][0] == 2 && matrizJuego[1][1] == 2
					&& matrizJuego[1][2] == 2) || (matrizJuego[2][0] == 2 && matrizJuego[2][1] == 2
					&& matrizJuego[2][2] == 2) || (matrizJuego[0][0] == 2 && matrizJuego[1][0] == 2
					&& matrizJuego[2][0] == 2) || (matrizJuego[0][1] == 2 && matrizJuego[1][1] == 2
					&& matrizJuego[2][1] == 2) || (matrizJuego[0][2] == 2 && matrizJuego[1][2] == 2
					&& matrizJuego[2][2] == 2) || (matrizJuego[0][0] == 2 && matrizJuego[1][1] == 2
					&& matrizJuego[2][2] == 2) || (matrizJuego[0][2] == 2 && matrizJuego[1][1] == 2
					&& matrizJuego[2][0] == 2)) {

				texto = "Hmm, me ganaste, ¡qué aburrido!";

			}else{
				
				if(contador == 4) {//Cambiado por generar error

					texto =  "Empate. No pudimos";
					
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
	
	
	//Cambiado de Controller
	
	public void verificarX(String textoJTextFile, int posicion) throws ValorDiferenteDeXExcepcion {

		try {
			
			vX_Caso = 0;
			vX_Posicion = posicion;
			
			if (textoJTextFile.equals("x")) {
				
				vX_ConverX = textoJTextFile.toUpperCase();
				asignarValorMatriz(2, posicion);
				yaSeJugoUsuario = true;
				vX_Caso = 1;
				
			} else if (textoJTextFile.equals("X")) {
				
				asignarValorMatriz(2, posicion);
				yaSeJugoUsuario = true;
				vX_Caso = 2;
				
			} else if (textoJTextFile.length() == 0) {
				
				asignarValorMatriz(0, posicion);
				
			} else {
				
				contadorClicks--;
				yaSeJugoUsuario = false;
				vX_Caso = 3;
				throw new ValorDiferenteDeXExcepcion();
				
			}

		} catch (ValorDiferenteDeXExcepcion e) {
			
			vX_Caso = 4;
			vX_V_D_XException = e.getMessage();

		}

	}
	
	public String soloUnValor() {

		try {

			contadorClicks--;
			yaSeJugoUsuario = false;
			throw new SoloUnTurnoALaVezExcepcion();

		} catch (SoloUnTurnoALaVezExcepcion e) {

			return e.getMessage();

		}

	}
	
	public int getvX_Caso() {
		return vX_Caso;
	}

	public int getvX_Posicion() {
		return vX_Posicion;
	}

	public String getvX_ConverX() {
		return vX_ConverX;
	}

	public String getvX_V_D_XException() {
		return vX_V_D_XException;
	}
	
}