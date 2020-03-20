package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame {

	// Constante generada por Eclipse
	private static final long serialVersionUID = 1L;

	private PanelJuego panelJuego; // Se declara un objeto de tipo PanelEntrada
	private PanelBoton panelBoton; // Se declara un objeto de tipo
									// PanelResultados

	public View(Controller control) {
		// Definición de los parámetros básicos de la ventana principal

		setSize(500, 600); // tamaño en ancho y alto en pixeles
		setResizable(false); // Se puede cambiar el tamaño de la ventana?
		setTitle("tIctActoe"); // tìtulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);// qué debe hacer si cierra la
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
	 * Este metodo crea los objetos les asigna la posicion y los añade a la
	 * ventana
	 */
	private void inicializarComponentes() {
		panelJuego = new PanelJuego();
		panelJuego.setBounds(20, 20, 450, 450);
		getContentPane().add(panelJuego);
		// Se agrega al layout en la parte CENTER, el panel de entrada definido
		panelBoton = new PanelBoton();
		panelBoton.setBounds(5, 490, 485, 60);
		getContentPane().add(panelBoton);
	}

	public PanelJuego getPanelJuego() {
		return panelJuego;
	}

	public void setPanelJuego(PanelJuego panelJuego) {
		this.panelJuego = panelJuego;
	}

	public PanelBoton getPanelBoton() {
		return panelBoton;
	}

	public void setPanelBoton(PanelBoton panelBoton) {
		this.panelBoton = panelBoton;
	}
	public void mostrarResultados(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}
}
