package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelJuego extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField posicion1;
	private JTextField posicion2;
	private JTextField posicion3;
	private JTextField posicion4;
	private JTextField posicion5;
	private JTextField posicion6;
	private JTextField posicion7;
	private JTextField posicion8;
	private JTextField posicion9;

	/**
	 * Metodo constructor del panel de juego.
	 */
	public PanelJuego() {
		setLayout(new GridLayout(3, 3, 20, 20));// Se crea una matriz 3x3 con un
												// espaciado tanto horizontal
												// como vertical.
		llenarPanel();
		setBackground(Color.BLACK);// Se pinta el fondo de negro.
		setVisible(true);

	}

	/**
	 * Este metodo genera el tablero donde se va a jugar. Es una matriz
	 * compuesta de campos de texto de 3x3
	 * 
	 */
	private void llenarPanel() {
		posicion1 = new JTextField();
		posicion1.setHorizontalAlignment(JLabel.CENTER); // Alinear
		// el
		// texto
		// en
		// el
		// centro
		posicion1.setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		// el
		// tipo
		// y
		// tamaño
		// de
		// letra
		add(posicion1); // Se añaden los campos de textos a la
		// matriz
		posicion2 = new JTextField();
		posicion2.setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion2.setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion2);
		posicion3 = new JTextField();
		posicion3.setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion3.setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion3);
		posicion4 = new JTextField();
		posicion4.setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion4.setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion4);
		posicion5 = new JTextField();
		posicion5.setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion5.setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion5);
		posicion6 = new JTextField();
		posicion6.setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion6.setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion6);
		posicion7 = new JTextField();
		posicion7.setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion7.setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion7);
		posicion8 = new JTextField();
		posicion8.setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion8.setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion8);
		posicion9 = new JTextField();
		posicion9.setHorizontalAlignment(JLabel.CENTER); // Alinear
		posicion9.setFont(new java.awt.Font("Tahoma", 1, 90)); // Cambia
		add(posicion9);

	}

	public JTextField getPosicion1() {
		return posicion1;
	}

	public void setPosicion1(JTextField posicion1) {
		this.posicion1 = posicion1;
	}

	public JTextField getPosicion2() {
		return posicion2;
	}

	public void setPosicion2(JTextField posicion2) {
		this.posicion2 = posicion2;
	}

	public JTextField getPosicion3() {
		return posicion3;
	}

	public void setPosicion3(JTextField posicion3) {
		this.posicion3 = posicion3;
	}

	public JTextField getPosicion4() {
		return posicion4;
	}

	public void setPosicion4(JTextField posicion4) {
		this.posicion4 = posicion4;
	}

	public JTextField getPosicion5() {
		return posicion5;
	}

	public void setPosicion5(JTextField posicion5) {
		this.posicion5 = posicion5;
	}

	public JTextField getPosicion6() {
		return posicion6;
	}

	public void setPosicion6(JTextField posicion6) {
		this.posicion6 = posicion6;
	}

	public JTextField getPosicion7() {
		return posicion7;
	}

	public void setPosicion7(JTextField posicion7) {
		this.posicion7 = posicion7;
	}

	public JTextField getPosicion8() {
		return posicion8;
	}

	public void setPosicion8(JTextField posicion8) {
		this.posicion8 = posicion8;
	}

	public JTextField getPosicion9() {
		return posicion9;
	}

	public void setPosicion9(JTextField posicion9) {
		this.posicion9 = posicion9;
	}

}