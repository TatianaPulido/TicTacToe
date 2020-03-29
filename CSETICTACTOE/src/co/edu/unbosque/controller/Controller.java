package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Juego;
import co.edu.unbosque.model.SoloUnTurnoALaVezExcepcion;
import co.edu.unbosque.model.ValorDiferenteDeXExcepcion;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private Juego juego;
	private View gui;

	public Controller() {
		
		juego = new Juego();
		gui = new View(this);
		gui.getPanelJuego().cargarValoresJTextField();
		
	}

	@Override
	public void actionPerformed(ActionEvent a) {

		if (a.getSource().equals(gui.getPanelBoton().getBotonJugar())) {
			try {
				jugarHumano();
				gui.mostrarMensajes(juego.Mensajes(juego.contadorClicks), juego.finJuego(juego.Mensajes(juego.contadorClicks)));
				gui.imprimirEnConsola("Contador de Clicks: " + juego.contadorClicks);
			} catch (ValorDiferenteDeXExcepcion | SoloUnTurnoALaVezExcepcion e) {
				e.printStackTrace();
			}
		}
	}

	public void jugarHumano() throws ValorDiferenteDeXExcepcion, SoloUnTurnoALaVezExcepcion {
		
		juego.yaSeJugoUsuario = false;
		juego.contadorClicks++;
		gui.getPanelJuego().cargarValoresJTextField();
		String valorPosiciones = "";
		int contadorCasillasOcupadas = 0;
		
		for (int i = 0; i < 9; i++) {
			valorPosiciones = gui.getPanelJuego().mostrarValoresJTextField()[i];
			if (valorPosiciones.length() != 0) {
				contadorCasillasOcupadas++;
			}
		}
		
		if (contadorCasillasOcupadas == (juego.contadorClicks + juego.numerojugadasPC)) {
			
			if (juego.contadorClicks == 1) {
				for (int j = 0; j < 9; j++) {
					valorPosiciones = gui.getPanelJuego().mostrarValoresJTextField()[j];
					juego.verificarX(valorPosiciones, j);
					actualizarJTextField(juego.getvX_Caso(), juego.getvX_Posicion());
					
				}
				
			}else {
				
				for (int k = 0; k < 9; k++) {
					if (k != juego.posicionJugadaPC[0] && k != juego.posicionJugadaPC[1]
							&& k != juego.posicionJugadaPC[2] && k != juego.posicionJugadaPC[3]) {

						valorPosiciones = gui.getPanelJuego().mostrarValoresJTextField()[k];
						juego.verificarX(valorPosiciones, k);
						actualizarJTextField(juego.getvX_Caso(), juego.getvX_Posicion());

					}
				}
			}
		} else {
			gui.messageDialog("Más De Una Casilla Por Jugada", juego.soloUnValor());
		}
		if (juego.yaSeJugoUsuario) {
			int pos = juego.jugarPC();
			gui.getPanelJuego().asignarValorJTextField("O", pos);
			gui.getPanelJuego().inhabilitarCampos(pos);
			juego.yaSeJugoUsuario = false;
			gui.imprimirEnConsola(juego.mostrarMatrizYJugada());
		}
	}
	
	public void actualizarJTextField(int caso, int posicion) {
		
		if(caso == 1) {
			
			gui.getPanelJuego().asignarValorJTextField(juego.getvX_ConverX(), posicion);
			gui.getPanelJuego().inhabilitarCampos(posicion);
			
		}else 
		
		if(caso == 2) {
			
			gui.getPanelJuego().inhabilitarCampos(posicion);
			
		}else
		
		if(caso == 3) {
			
			gui.getPanelJuego().vaciarCampos(posicion);
			
		}else
		
		if(caso == 4) {
			
			gui.messageDialog("Carácter No Valido", juego.getvX_V_D_XException());
			
		}
		
	}
	
}