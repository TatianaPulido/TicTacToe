package co.edu.unbosque.model;

public class Juego {

	private boolean yaSeJugoUsuario;
	private boolean yaSeJugoPC;
	private boolean finDeJuego;
	private int matrizJuego[][];
	private int posicionJugadaPC[];
	private int numerojugadasPC;
	private int contadorClick;

	public Juego() {
		matrizJuego = new int[3][3];
		posicionJugadaPC = new int[4];
		finDeJuego = false;
		yaSeJugoPC = false;
		contadorClick = 0;
		numerojugadasPC = 0;
		yaSeJugoUsuario = false;
		inicializarMatriz();
		inicializarArreglo();
	}

	/**
	 * Este metodo inicializa el arreglo de las jugadas del computador con
	 * valores de -1
	 */
	private void inicializarArreglo() {

		for (int i = 0; i < 4; i++) {
			posicionJugadaPC[i] = -1;
		}

	}

	/**
	 * Este metodo inicializa la matriz de juego en cero
	 */
	private void inicializarMatriz() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizJuego[i][j] = 0;
			}
		}

	}

	/**
	 * Este metodo asigna valores a la matriz de juego
	 * 
	 * @param valorDeJugada
	 *            1 si juega el computador, 2 si juega el usuario
	 * @param posicion
	 *            Define la ubicacion de la matriz donde se asigna el valor (0 a
	 *            8).
	 */
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

	/**
	 * Este metodo inicializa todos los valores nuevamente y permite que el
	 * juego se inicie nuevamente
	 */
	public void reiniciar() {
		contadorClick = 0;
		yaSeJugoPC = false;
		yaSeJugoUsuario = false;
		finDeJuego = false;
		numerojugadasPC = 0;
		inicializarArreglo();
		inicializarMatriz();
	}

	/**
	 * Este metodo muestra la matriz de juego
	 * 
	 * @return matriz de juego
	 */
	public int[][] mostrarMatriz() {
		return matrizJuego;
	}

	/**
	 * Este metodo permite que el PC juege en una casilla aleatoria siempre que
	 * todas las casillas esten vacias y el usuario haya jugado en el centro
	 * 
	 * @return Jugada del PC
	 */
	public int jugarAleatorio() {
		int posicionPC = 0;
		if (matrizJuego[0][0] == 0 && matrizJuego[0][1] == 0
				&& matrizJuego[0][2] == 0 && matrizJuego[1][0] == 0
				&& matrizJuego[1][2] == 0 && matrizJuego[2][0] == 0
				&& matrizJuego[2][1] == 0 && matrizJuego[2][2] == 0
				&& matrizJuego[1][1] == 2 && !yaSeJugoPC) {
			int numeroAleatorio = (int) (Math.random() * 8);
			if (numeroAleatorio != 4) {
				asignarValorMatriz(1, numeroAleatorio);

				yaSeJugoPC = true;
				posicionPC = numeroAleatorio;
			}
		}
		return posicionPC;
	}

	/**
	 * Este metodo permite que el computado ataque de tal forma que le gane al
	 * usuario
	 * 
	 * @return Jugada del PC
	 */
	public int jugarAtacar() {
		int posicionPC = 0;
		if (matrizJuego[0][0] == 1 && matrizJuego[0][1] == 1
				&& matrizJuego[0][2] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 2);
			posicionPC = 2;
			yaSeJugoPC = true;
		} else if (matrizJuego[0][0] == 1 && matrizJuego[0][1] == 0
				&& matrizJuego[0][2] == 1 && !yaSeJugoPC) {
			asignarValorMatriz(1, 1);
			yaSeJugoPC = true;
			posicionPC = 1;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[0][1] == 1
				&& matrizJuego[0][2] == 1 && !yaSeJugoPC) {
			asignarValorMatriz(1, 0);
			yaSeJugoPC = true;
			posicionPC = 0;
		} else if (matrizJuego[1][0] == 1 && matrizJuego[1][1] == 1
				&& matrizJuego[1][2] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 5);
			yaSeJugoPC = true;
			posicionPC = 5;
		} else if (matrizJuego[1][0] == 1 && matrizJuego[1][1] == 0
				&& matrizJuego[1][2] == 1 && !yaSeJugoPC) {
			asignarValorMatriz(1, 4);
			yaSeJugoPC = true;
			posicionPC = 4;
		} else if (matrizJuego[1][0] == 0 && matrizJuego[1][1] == 1
				&& matrizJuego[1][2] == 1 && !yaSeJugoPC) {
			asignarValorMatriz(1, 3);
			yaSeJugoPC = true;
			posicionPC = 3;
		} else if (matrizJuego[2][0] == 1 && matrizJuego[2][1] == 1
				&& matrizJuego[2][2] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 8);
			yaSeJugoPC = true;
			posicionPC = 8;
		} else if (matrizJuego[2][0] == 1 && matrizJuego[2][1] == 0
				&& matrizJuego[2][2] == 1 && !yaSeJugoPC) {
			asignarValorMatriz(1, 7);
			yaSeJugoPC = true;
			posicionPC = 7;
		} else if (matrizJuego[2][0] == 0 && matrizJuego[2][1] == 1
				&& matrizJuego[2][2] == 1 && !yaSeJugoPC) {
			asignarValorMatriz(1, 6);
			yaSeJugoPC = true;
			posicionPC = 6;
		} else if (matrizJuego[0][0] == 1 && matrizJuego[1][0] == 1
				&& matrizJuego[2][0] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 6);
			yaSeJugoPC = true;
			posicionPC = 6;
		} else if (matrizJuego[0][0] == 1 && matrizJuego[1][0] == 0
				&& matrizJuego[2][0] == 1 && !yaSeJugoPC) {
			asignarValorMatriz(1, 3);
			yaSeJugoPC = true;
			posicionPC = 3;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[1][0] == 1
				&& matrizJuego[2][0] == 1 && !yaSeJugoPC) {
			asignarValorMatriz(1, 0);
			yaSeJugoPC = true;
			posicionPC = 0;
		} else if (matrizJuego[0][1] == 1 && matrizJuego[1][1] == 1
				&& matrizJuego[2][1] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 7);
			yaSeJugoPC = true;
			posicionPC = 7;
		} else if (matrizJuego[0][1] == 1 && matrizJuego[1][1] == 0
				&& matrizJuego[2][1] == 1 && !yaSeJugoPC) {
			asignarValorMatriz(1, 3);
			yaSeJugoPC = true;
			posicionPC = 3;
		} else if (matrizJuego[0][1] == 0 && matrizJuego[1][1] == 1
				&& matrizJuego[2][1] == 1 && !yaSeJugoPC) {
			asignarValorMatriz(1, 0);
			yaSeJugoPC = true;
			posicionPC = 0;
		} else if (matrizJuego[0][2] == 1 && matrizJuego[1][2] == 1
				&& matrizJuego[2][2] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 8);
			yaSeJugoPC = true;
			posicionPC = 8;
		} else if (matrizJuego[0][2] == 1 && matrizJuego[1][2] == 0
				&& matrizJuego[2][2] == 1 && !yaSeJugoPC) {
			asignarValorMatriz(1, 5);
			yaSeJugoPC = true;
			posicionPC = 5;
		} else if (matrizJuego[0][2] == 0 && matrizJuego[1][2] == 1
				&& matrizJuego[2][2] == 1 && !yaSeJugoPC) {
			asignarValorMatriz(1, 2);
			yaSeJugoPC = true;
			posicionPC = 2;
		} else if (matrizJuego[0][0] == 1 && matrizJuego[1][1] == 1
				&& matrizJuego[2][2] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 8);
			yaSeJugoPC = true;
			posicionPC = 8;
		} else if (matrizJuego[0][0] == 1 && matrizJuego[1][1] == 0
				&& matrizJuego[2][2] == 1 && !yaSeJugoPC) {
			asignarValorMatriz(1, 4);
			yaSeJugoPC = true;
			posicionPC = 4;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[1][1] == 1
				&& matrizJuego[2][2] == 1 && !yaSeJugoPC) {
			asignarValorMatriz(1, 0);
			yaSeJugoPC = true;
			posicionPC = 0;
		} else if (matrizJuego[0][2] == 1 && matrizJuego[1][1] == 1
				&& matrizJuego[2][0] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 6);
			yaSeJugoPC = true;
			posicionPC = 6;
		} else if (matrizJuego[0][2] == 1 && matrizJuego[1][1] == 0
				&& matrizJuego[2][0] == 1 && !yaSeJugoPC) {
			asignarValorMatriz(1, 4);
			yaSeJugoPC = true;
			posicionPC = 4;
		} else if (matrizJuego[0][2] == 0 && matrizJuego[1][1] == 1
				&& matrizJuego[2][0] == 1 && !yaSeJugoPC) {
			asignarValorMatriz(1, 2);
			yaSeJugoPC = true;
			posicionPC = 2;
		}
		return posicionPC;
	}

	/**
	 * Este metodo permite que el pc se defienda de una jugada en la que el
	 * usuario pueda ganar
	 * 
	 * @return Jugada del PC
	 */
	public int jugarDefender() {
		int posicionPC = 0;
		if (matrizJuego[0][0] == 2 && matrizJuego[0][1] == 2
				&& matrizJuego[0][2] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 2);
			posicionPC = 2;
			yaSeJugoPC = true;
		} else if (matrizJuego[0][0] == 2 && matrizJuego[0][1] == 0
				&& matrizJuego[0][2] == 2 && !yaSeJugoPC) {
			asignarValorMatriz(1, 1);
			yaSeJugoPC = true;
			posicionPC = 1;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[0][1] == 2
				&& matrizJuego[0][2] == 2 && !yaSeJugoPC) {
			asignarValorMatriz(1, 0);
			yaSeJugoPC = true;
			posicionPC = 0;
		} else if (matrizJuego[1][0] == 2 && matrizJuego[1][1] == 2
				&& matrizJuego[1][2] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 5);
			yaSeJugoPC = true;
			posicionPC = 5;
		} else if (matrizJuego[1][0] == 2 && matrizJuego[1][1] == 0
				&& matrizJuego[1][2] == 2 && !yaSeJugoPC) {
			asignarValorMatriz(1, 4);
			yaSeJugoPC = true;
			posicionPC = 4;
		} else if (matrizJuego[1][0] == 0 && matrizJuego[1][1] == 2
				&& matrizJuego[1][2] == 2 && !yaSeJugoPC) {
			asignarValorMatriz(1, 3);
			yaSeJugoPC = true;
			posicionPC = 3;
		} else if (matrizJuego[2][0] == 2 && matrizJuego[2][1] == 2
				&& matrizJuego[2][2] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 8);
			yaSeJugoPC = true;
			posicionPC = 8;
		} else if (matrizJuego[2][0] == 2 && matrizJuego[2][1] == 0
				&& matrizJuego[2][2] == 2 && !yaSeJugoPC) {
			asignarValorMatriz(1, 7);
			yaSeJugoPC = true;
			posicionPC = 7;
		} else if (matrizJuego[2][0] == 0 && matrizJuego[2][1] == 2
				&& matrizJuego[2][2] == 2 && !yaSeJugoPC) {
			asignarValorMatriz(1, 6);
			yaSeJugoPC = true;
			posicionPC = 6;
		} else if (matrizJuego[0][0] == 2 && matrizJuego[1][0] == 2
				&& matrizJuego[2][0] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 6);
			yaSeJugoPC = true;
			posicionPC = 6;
		} else if (matrizJuego[0][0] == 2 && matrizJuego[1][0] == 0
				&& matrizJuego[2][0] == 2 && !yaSeJugoPC) {
			asignarValorMatriz(1, 3);
			yaSeJugoPC = true;
			posicionPC = 3;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[1][0] == 2
				&& matrizJuego[2][0] == 2 && !yaSeJugoPC) {
			asignarValorMatriz(1, 0);
			yaSeJugoPC = true;
			posicionPC = 0;
		} else if (matrizJuego[0][1] == 2 && matrizJuego[1][1] == 2
				&& matrizJuego[2][1] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 7);
			yaSeJugoPC = true;
			posicionPC = 7;
		} else if (matrizJuego[0][1] == 2 && matrizJuego[1][1] == 0
				&& matrizJuego[2][1] == 2 && !yaSeJugoPC) {
			asignarValorMatriz(1, 4);
			yaSeJugoPC = true;
			posicionPC = 4;
		} else if (matrizJuego[0][1] == 0 && matrizJuego[1][1] == 2
				&& matrizJuego[2][1] == 2 && !yaSeJugoPC) {
			asignarValorMatriz(1, 1);
			yaSeJugoPC = true;
			posicionPC = 1;
		} else if (matrizJuego[0][2] == 2 && matrizJuego[1][2] == 2
				&& matrizJuego[2][2] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 8);
			yaSeJugoPC = true;
			posicionPC = 8;
		} else if (matrizJuego[0][2] == 2 && matrizJuego[1][2] == 0
				&& matrizJuego[2][2] == 2 && !yaSeJugoPC) {
			asignarValorMatriz(1, 5);
			yaSeJugoPC = true;
			posicionPC = 5;
		} else if (matrizJuego[0][2] == 0 && matrizJuego[1][2] == 2
				&& matrizJuego[2][2] == 2 && !yaSeJugoPC) {
			asignarValorMatriz(1, 2);
			yaSeJugoPC = true;
			posicionPC = 2;
		} else if (matrizJuego[0][0] == 2 && matrizJuego[1][1] == 2
				&& matrizJuego[2][2] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 8);
			yaSeJugoPC = true;
			posicionPC = 8;
		} else if (matrizJuego[0][0] == 2 && matrizJuego[1][1] == 0
				&& matrizJuego[2][2] == 2 && !yaSeJugoPC) {
			asignarValorMatriz(1, 4);
			yaSeJugoPC = true;
			posicionPC = 4;
		} else if (matrizJuego[0][0] == 0 && matrizJuego[1][1] == 2
				&& matrizJuego[2][2] == 2 && !yaSeJugoPC) {
			asignarValorMatriz(1, 0);
			yaSeJugoPC = true;
			posicionPC = 0;
		} else if (matrizJuego[0][2] == 2 && matrizJuego[1][1] == 2
				&& matrizJuego[2][0] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 6);
			yaSeJugoPC = true;
			posicionPC = 6;
		} else if (matrizJuego[0][2] == 2 && matrizJuego[1][1] == 0
				&& matrizJuego[2][0] == 2 && !yaSeJugoPC) {
			asignarValorMatriz(1, 4);
			yaSeJugoPC = true;
			posicionPC = 4;
		} else if (matrizJuego[0][2] == 0 && matrizJuego[1][1] == 2
				&& matrizJuego[2][0] == 2 && !yaSeJugoPC) {
			asignarValorMatriz(1, 2);
			yaSeJugoPC = true;
			posicionPC = 2;
		}
		return posicionPC;
	}

	/**
	 * Este metodo permite que el pc juege en el centro siempre y cuando este
	 * vacia.
	 * 
	 * @return Jugada del PC
	 */
	public int jugarCentro() {
		int posicionPC = 0;
		if (matrizJuego[1][1] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 4);
			yaSeJugoPC = true;
			posicionPC = 4;
		}
		return posicionPC;
	}

	/**
	 * Este metodo permite que el PC juege en la primera casilla que encuentre
	 * vacia
	 * 
	 * @return Jugada del PC
	 */
	public int jugarCasillasVacias() {
		int posicionPC = 0;
		if (matrizJuego[0][0] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 0);
			yaSeJugoPC = true;
			posicionPC = 0;
		} else if (matrizJuego[0][2] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 2);
			yaSeJugoPC = true;
			posicionPC = 2;
		} else if (matrizJuego[2][0] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 6);
			yaSeJugoPC = true;
			posicionPC = 6;
		} else if (matrizJuego[0][1] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 1);
			yaSeJugoPC = true;
			posicionPC = 1;
		} else if (matrizJuego[2][2] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 8);
			yaSeJugoPC = true;
			posicionPC = 8;

		} else if (matrizJuego[1][0] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 3);
			yaSeJugoPC = true;
			posicionPC = 3;
		} else if (matrizJuego[1][1] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 4);
			yaSeJugoPC = true;
			posicionPC = 4;
		} else if (matrizJuego[1][2] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 5);
			yaSeJugoPC = true;
			posicionPC = 5;

		} else if (matrizJuego[2][1] == 0 && !yaSeJugoPC) {
			asignarValorMatriz(1, 7);
			yaSeJugoPC = true;
			posicionPC = 7;
		}
		return posicionPC;
	}

	/**
	 * Este metodo permite definir que tipo de jugada va a realizar el PC
	 * 
	 * @return Jugada del PC
	 */
	public int jugarPC() {
		int posicionPC = 0;
		if (!yaSeJugoPC) {
			posicionPC = jugarAleatorio();
		}
		if (!yaSeJugoPC) {
			posicionPC = jugarAtacar();
		}
		if (!yaSeJugoPC) {
			posicionPC = jugarDefender();
		}
		if (!yaSeJugoPC) {
			posicionPC = jugarCentro();
		}
		if (!yaSeJugoPC) {
			posicionPC = jugarCasillasVacias();
		}
		numerojugadasPC++;
		int i = numerojugadasPC - 1;
		posicionJugadaPC[i] = posicionPC;
		yaSeJugoPC = false;
		return posicionPC;
	}

	/**
	 * Este metodo verifica que tipo de caracter ingreso el usuario. Si ingreso
	 * una x lo valida como una jugada correcta y asigna un 2 en la matriz Si la
	 * casilla esta vacia asigna un 0 en la matriz Si pone un caracter difente
	 * se lanza una excepcion .
	 * 
	 * @param textoJTextFile
	 *            Texto ingresado por el usuario
	 * @param posicion
	 *            Posicion en la que se encuentra el texto
	 * @return Mensaje de excepcion
	 * @throws ValorDiferenteDeXExcepcion
	 *             Excepcion que indica que es esta jugando con un caracter no
	 *             aceptado.
	 */
	public String verificarX(String textoJTextFile, int posicion)
			throws ValorDiferenteDeXExcepcion {
		String mensaje = "";
		try {
			if (textoJTextFile.equals("x") || textoJTextFile.equals("X")) {
				asignarValorMatriz(2, posicion);
				yaSeJugoUsuario = true;
			} else if (textoJTextFile.length() == 0) {
				asignarValorMatriz(0, posicion);
			} else {
				contadorClick--;
				yaSeJugoUsuario = false;
				throw new ValorDiferenteDeXExcepcion();
			}

		} catch (ValorDiferenteDeXExcepcion e) {
			mensaje = e.getMessage();

		}
		return mensaje;

	}

	/**
	 * Este metodo permite que se juegue
	 * 
	 * @param arregloVista
	 *            Arreglo de string de vista
	 * @return mensaje de excepciones
	 * @throws ValorDiferenteDeXExcepcion
	 *             Excepcion que indica que se esta ingresando un caracter no
	 *             permitido.
	 * @throws SoloUnTurnoALaVezExcepcion
	 *             Excepcion que indica que se esta jugando en mas de una
	 *             posicion o no se esta jugando en ninguna posicion.
	 */
	public String jugar(String arregloVista[])
			throws ValorDiferenteDeXExcepcion, SoloUnTurnoALaVezExcepcion {

		yaSeJugoUsuario = false;
		contadorClick++;
		String valorPosiciones = "";
		String mensajeExcepcion = "";
		int contadorCasillasOcupadas = 0;

		for (int i = 0; i < 9; i++) {
			valorPosiciones = arregloVista[i];
			if (valorPosiciones.length() != 0) {
				contadorCasillasOcupadas++;
			}
		}
		if (contadorCasillasOcupadas == (contadorClick + numerojugadasPC)) {
			if (contadorClick == 1) {
				for (int j = 0; j < 9; j++) {
					valorPosiciones = arregloVista[j];
					String mensaje = verificarX(valorPosiciones, j);
					if (mensaje.length() > 2) {
						mensajeExcepcion = mensaje;
					}
				}
			} else {
				for (int k = 0; k < 9; k++) {
					if (k != posicionJugadaPC[0] && k != posicionJugadaPC[1]
							&& k != posicionJugadaPC[2]
							&& k != posicionJugadaPC[3]) {

						valorPosiciones = arregloVista[k];
						String mensaje = verificarX(valorPosiciones, k);
						if (mensaje.length() > 2) {
							mensajeExcepcion = mensaje;
						}
					}
				}
			}
		} else {
			mensajeExcepcion = soloUnValor();
		}
		Mensajes();
		if ((!finDeJuego) && yaSeJugoUsuario) {
			jugarPC();
			yaSeJugoUsuario = false;

		}
		return mensajeExcepcion;
	}

	/**
	 * Este metodo indica si el usuario gano, si gano el pc o fue un empate.
	 * 
	 * @return mensaje de ganador
	 */
	public String Mensajes() {
		String texto = "";
		if ((matrizJuego[0][0] == 1 && matrizJuego[0][1] == 1 && matrizJuego[0][2] == 1)
				|| (matrizJuego[1][0] == 1 && matrizJuego[1][1] == 1 && matrizJuego[1][2] == 1)
				|| (matrizJuego[2][0] == 1 && matrizJuego[2][1] == 1 && matrizJuego[2][2] == 1)
				|| (matrizJuego[0][0] == 1 && matrizJuego[1][0] == 1 && matrizJuego[2][0] == 1)
				|| (matrizJuego[0][1] == 1 && matrizJuego[1][1] == 1 && matrizJuego[2][1] == 1)
				|| (matrizJuego[0][2] == 1 && matrizJuego[1][2] == 1 && matrizJuego[2][2] == 1)
				|| (matrizJuego[0][0] == 1 && matrizJuego[1][1] == 1 && matrizJuego[2][2] == 1)
				|| (matrizJuego[0][2] == 1 && matrizJuego[1][1] == 1 && matrizJuego[2][0] == 1)) {

			texto = "¡Ja, ja te gane humano!";
			finDeJuego = true;

		} else if ((matrizJuego[0][0] == 2 && matrizJuego[0][1] == 2 && matrizJuego[0][2] == 2)
				|| (matrizJuego[1][0] == 2 && matrizJuego[1][1] == 2 && matrizJuego[1][2] == 2)
				|| (matrizJuego[2][0] == 2 && matrizJuego[2][1] == 2 && matrizJuego[2][2] == 2)
				|| (matrizJuego[0][0] == 2 && matrizJuego[1][0] == 2 && matrizJuego[2][0] == 2)
				|| (matrizJuego[0][1] == 2 && matrizJuego[1][1] == 2 && matrizJuego[2][1] == 2)
				|| (matrizJuego[0][2] == 2 && matrizJuego[1][2] == 2 && matrizJuego[2][2] == 2)
				|| (matrizJuego[0][0] == 2 && matrizJuego[1][1] == 2 && matrizJuego[2][2] == 2)
				|| (matrizJuego[0][2] == 2 && matrizJuego[1][1] == 2 && matrizJuego[2][0] == 2)) {

			texto = "Hum, me ganaste, ¡qué aburrido!";
			finDeJuego = true;

		} else if (matrizJuego[0][0] != 0 && matrizJuego[0][1] != 0
				&& matrizJuego[0][2] != 0 && matrizJuego[1][0] != 0
				&& matrizJuego[1][1] != 0 && matrizJuego[1][2] != 0
				&& matrizJuego[2][0] != 0 && matrizJuego[2][1] != 0
				&& matrizJuego[2][2] != 0) {

			texto = "Empate. No pudimos";
			finDeJuego = true;
		} else {
			texto = "";
			finDeJuego = false;
		}
		return texto;
	}

	/**
	 * Este metodo lanza una excepcion si se juega en mas de una posicion o si
	 * no se juega en ninguna.
	 * 
	 * @return mensaje de excepcion
	 */
	public String soloUnValor() {
		try {
			contadorClick--;
			yaSeJugoUsuario = false;
			throw new SoloUnTurnoALaVezExcepcion();
		} catch (SoloUnTurnoALaVezExcepcion e) {
			return e.getMessage();
		}
	}

	public boolean getFinDeJuego() {
		return finDeJuego;
	}

	public void setFinDeJuego(boolean finDeJuego) {
		this.finDeJuego = finDeJuego;
	}

}
