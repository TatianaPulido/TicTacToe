package co.edu.unbosque.model;

public class SoloUnTurnoALaVezExcepcion extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SoloUnTurnoALaVezExcepcion() {
		
		super("Juege solo en una posicion");
	
	}
}