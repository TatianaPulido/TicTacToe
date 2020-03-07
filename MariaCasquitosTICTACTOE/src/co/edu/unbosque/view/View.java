package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame {

	// Constante generada por Eclipse
	private static final long serialVersionUID = 1L;

	private PanelJuego panelJuego; // Se declara un objeto de tipo PanelEntrada
	private PanelBoton panelBoton; // Se declara un objeto de tipo
									// PanelResultados

	public View(Controller control) {
		// Definici�n de los par�metros b�sicos de la ventana principal

		setSize(500, 600); // tama�o en ancho y alto en pixeles
		setResizable(false); // Se puede cambiar el tama�o de la ventana?
		setTitle("tIctActoe"); // t�tulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);// qu� debe hacer si cierra la
												// ventana

		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.BLACK);
		inicializarComponentes();

		setVisible(true);
		setLocationRelativeTo(null); // coloca la ventana al centro de la
		// pantalla
		// se agrega al boton ActionListener del objeto de Controlador
		panelBoton.getBotonJugar().addActionListener(control);
	}

	/**
	 * Este metodo crea los objetos les asigna la posicion y los a�ade a la
	 * ventana
	 */
	private void inicializarComponentes() {
		panelJuego = new PanelJuego();
		panelJuego.setBounds(5, 5, 485, 480);
		getContentPane().add(panelJuego);
		// Se agrega al layout en la parte CENTER, el panel de entrada definido
		panelBoton = new PanelBoton();
		panelBoton.setBounds(5, 500, 485,60);
		getContentPane().add(panelBoton);
	}
}
