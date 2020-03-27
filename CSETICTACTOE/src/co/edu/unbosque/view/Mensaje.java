package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class Mensaje {
	
	public String pedirDato (String mensaje ){
		String aux = JOptionPane.showInputDialog(mensaje);
		return aux;
	}
	
	public void mostrarMensaje(String mensaje){
		JOptionPane.showMessageDialog(null,mensaje);
	}

}
