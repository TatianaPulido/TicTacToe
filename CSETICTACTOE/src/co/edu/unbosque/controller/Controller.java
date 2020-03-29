package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Juego;
import co.edu.unbosque.model.SoloUnTurnoALaVezExcepcion;
import co.edu.unbosque.model.ValorDiferenteDeXExcepcion;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private Juego juego;
	private View view;

	public Controller() {
		juego = new Juego();
		view = new View(this);
	}

	@Override
	public void actionPerformed(ActionEvent a) {

		if (a.getSource().equals(
				view.getVentanaPrincipal().getPanelBoton().getBotonJugar())) {
			try {
				String mens = juego.jugar(view.getVentanaPrincipal()
						.getPanelJuego().mostrarValoresJTextField());
				if (mens.length() > 2) {
					view.getMensaje().mostrarMensajes(mens);
				} else {
					view.getVentanaPrincipal()
							.getPanelJuego()
							.asignarValoresJTextField(
									actualizarJtextField(juego.mostrarMatriz()));
					String mensaje = juego.Mensajes();
					if (juego.getFinDeJuego()) {
						view.getMensaje().mostrarMensajes(mensaje);
						juego.reiniciar();
						view.getVentanaPrincipal().getPanelJuego().reiniciar();
					}
				}
			} catch (ValorDiferenteDeXExcepcion | SoloUnTurnoALaVezExcepcion e) {
				e.printStackTrace();
			}
		}
	}
/**
 * Este metodo actuliza los valores de los JTextField
 * @param matrizJuego Se le envia como parametro la matriz de juego
 * @return Devuelve un arreglo de String
 */
	public String[] actualizarJtextField(int[][] matrizJuego) {

		String[] arregloVista = new String[9];

		if (matrizJuego[0][0] == 1) {
			arregloVista[0] = "O";
		} else if (matrizJuego[0][0] == 2) {
			arregloVista[0] = "X";
		}
		if (matrizJuego[0][1] == 1) {
			arregloVista[1] = "O";
		} else if (matrizJuego[0][1] == 2) {
			arregloVista[1] = "X";
		}
		if (matrizJuego[0][2] == 1) {
			arregloVista[2] = "O";
		} else if (matrizJuego[0][2] == 2) {
			arregloVista[2] = "X";
		}
		if (matrizJuego[1][0] == 1) {
			arregloVista[3] = "O";
		} else if (matrizJuego[1][0] == 2) {
			arregloVista[3] = "X";
		}
		if (matrizJuego[1][1] == 1) {
			arregloVista[4] = "O";
		} else if (matrizJuego[1][1] == 2) {
			arregloVista[4] = "X";
		}
		if (matrizJuego[1][2] == 1) {
			arregloVista[5] = "O";
		} else if (matrizJuego[1][2] == 2) {
			arregloVista[5] = "X";
		}
		if (matrizJuego[2][0] == 1) {
			arregloVista[6] = "O";
		} else if (matrizJuego[2][0] == 2) {
			arregloVista[6] = "X";
		}
		if (matrizJuego[2][1] == 1) {
			arregloVista[7] = "O";
		} else if (matrizJuego[2][1] == 2) {
			arregloVista[7] = "X";
		}
		if (matrizJuego[2][2] == 1) {
			arregloVista[8] = "O";
		} else if (matrizJuego[2][2] == 2) {
			arregloVista[8] = "X";
		}

		return arregloVista;
	}

}