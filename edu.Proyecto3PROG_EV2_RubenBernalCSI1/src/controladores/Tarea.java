/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

/**
 * 
 * @author rbr - 211024
 *
 */
public class Tarea {

	/*
	 * Es importante establecer los atributos como privados para limitar el acceso a estos y los datos que guardan.
	 * Establecerlos como privados pueden evitar una futura brecha de seguridad y robo de datos de la aplicación
	 */
	//Atributos
	private String nombre = "";
	private String descripcion;
	private boolean completada = false;
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isCompletada() {
		return completada;
	}
	public void setCompletada(boolean completada) {
		this.completada = completada;
	}
	
	//Constructores
	public Tarea(String nombre, String descripcion, boolean completada) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.completada = completada;
	}
	public Tarea() {
		
	}
	
	//Método ToString
	public String toString() {
		return "Nombre: " + nombre +
				"  Descripción: " + descripcion +
				"  Completada: " + completada;
	}
	
}