package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Juego;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private Juego juego;
	private View gui;
	private int contadorClick;
	private boolean yaSeJugoUsuario;

	public Controller() {
		juego = new Juego();
		gui = new View(this);
		contadorClick = 0;
		yaSeJugoUsuario = false;
	}

	@Override
	public void actionPerformed(ActionEvent a) {

		if (a.getSource().equals(gui.getPanelBoton().getBotonJugar())) {
			try {
				jugarHumano();
				gui.mostrarMensajes(juego.Mensajes(contadorClick), juego.finJuego(juego.Mensajes(contadorClick)));
			} catch (ValorDiferenteDeXExcepcion | SoloUnTurnoALaVezExcepcion e) {
				e.printStackTrace();
			}
		}
	}

	public void jugarHumano() throws ValorDiferenteDeXExcepcion,
			SoloUnTurnoALaVezExcepcion {
		yaSeJugoUsuario=false;
		contadorClick++;
		gui.getPanelJuego().cargarValoresJTextField();
		String valorPosiciones = "";
		int contadorCasillasOcupadas = 0;
		
		for (int i = 0; i < 9; i++) {
			valorPosiciones = gui.getPanelJuego().mostrarValoresJTextField()[i];
			if (valorPosiciones.length() != 0) {
				contadorCasillasOcupadas++;
			}
		}
		
		if (contadorCasillasOcupadas == (contadorClick + juego.numerojugadasPC)) {
			if (contadorClick == 1) {
				for (int j = 0; j < 9; j++) {
					valorPosiciones = gui.getPanelJuego()
							.mostrarValoresJTextField()[j];
					verificarX(valorPosiciones, j);
				}
				juego.mostrarMatriz();
			} else {
				for (int k = 0; k < 9; k++) {
					if (k != juego.posicionJugadaPC[0]
							&& k != juego.posicionJugadaPC[1]
							&& k != juego.posicionJugadaPC[2]
							&& k != juego.posicionJugadaPC[3]) {

						valorPosiciones = gui.getPanelJuego()
								.mostrarValoresJTextField()[k];
						verificarX(valorPosiciones, k);

					}
				}
				juego.mostrarMatriz();
			}
		} else {
			soloUnValor();
			juego.mostrarMatriz();
		}
		if (yaSeJugoUsuario) {
			int pos = juego.jugarPC();
			gui.getPanelJuego().asignarValorJTextField("O", pos);
			gui.getPanelJuego().inhabilitarCampos(pos);
			yaSeJugoUsuario = false;
			juego.mostrarMatriz();
		}
	}

	public void soloUnValor() {

		try {

			contadorClick--;
			yaSeJugoUsuario=false;
			throw new SoloUnTurnoALaVezExcepcion();

		} catch (SoloUnTurnoALaVezExcepcion e) {

			gui.mostrarResultados(e.getMessage());

		}

	}

	public void verificarX(String textoJTextFile, int posicion)
			throws ValorDiferenteDeXExcepcion {

		try {

			if (textoJTextFile.equals("x")) {
				convertirX(textoJTextFile, posicion);
				gui.getPanelJuego().inhabilitarCampos(posicion);
				yaSeJugoUsuario = true;
			} else if (textoJTextFile.equals("X")) {
				juego.asignarValorMatriz(2, posicion);
				gui.getPanelJuego().inhabilitarCampos(posicion);
				yaSeJugoUsuario = true;
			} else if (textoJTextFile.length() == 0) {
				juego.asignarValorMatriz(0, posicion);
			} else {
				gui.getPanelJuego().vaciarCampos(posicion);
				contadorClick--;
				yaSeJugoUsuario=false;
				throw new ValorDiferenteDeXExcepcion();
			}

		} catch (ValorDiferenteDeXExcepcion e) {

			gui.mostrarResultados(e.getMessage());

		}

	}

	public void convertirX(String textoJTextFile, int posicion) {

		String converX = textoJTextFile.toUpperCase();
		gui.getPanelJuego().asignarValorJTextField(converX, posicion);
		juego.asignarValorMatriz(2, posicion);
		yaSeJugoUsuario=true;
	}

}