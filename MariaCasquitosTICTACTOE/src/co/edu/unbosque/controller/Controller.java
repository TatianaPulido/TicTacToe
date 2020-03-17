package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import co.edu.unbosque.model.Juego;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private Juego m;
	private View gui;

	public Controller() {
		m = new Juego();
		gui = new View(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int contadorMovimientos = 0;
		if (e.getSource().equals(gui.getPanelBoton().getBotonJugar())) {
			
			
			contadorMovimientos++;
			System.out.println(contadorMovimientos);
			
		}
		
	}
	
	public void asignarValoresMatrizJuego(){
		
	}

	/**public String verificarX( )
			throws ValorDiferenteDeXExcepcion {
		try {
			if (textoJTextFile != 'X' || textoJTextFile != 'x') {
				throw new ValorDiferenteDeXExcepcion();
			} else if (textoJTextFile == 'x') {
				convertirX(posFila, posColumna);
			} else if (textoJTextFile == 'X') {
				juego.asignarValorMatriz(posFila, posColumna, textoJTextFile);
				
			}
		} catch (ValorDiferenteDeXExcepcion e) {
			return e.getMessage();
		}
		return "Ok";
	}

	public void convertirX(int posFila, int posColumna) {
		char converX = juego.mostrarValorMatriz(posFila, posColumna);
		converX = Character.toUpperCase(converX);
		juego.asignarValorMatriz(posFila, posColumna, converX);
	}**/
	
}