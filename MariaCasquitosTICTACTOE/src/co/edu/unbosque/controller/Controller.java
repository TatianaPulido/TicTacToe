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
	public void actionPerformed(ActionEvent arg0) {

	}
}