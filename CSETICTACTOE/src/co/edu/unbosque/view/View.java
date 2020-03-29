package co.edu.unbosque.view;

import co.edu.unbosque.controller.Controller;

public class View {

	private VentanaPrincipal ventanaPrincipal;
	private Mensaje mensaje;

	public View(Controller control) {

		ventanaPrincipal = new VentanaPrincipal(control);
		mensaje = new Mensaje();
	}

	public VentanaPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}

}