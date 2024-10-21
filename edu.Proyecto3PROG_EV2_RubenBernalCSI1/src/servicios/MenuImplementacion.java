/**
 * Rubén Bernal Ramos, CSI1
 */

package servicios;

/**
 * Implementación de la interfaz Menu
 * @author rbr - 211024
 *
 */
public class MenuImplementacion implements MenuInterfaz{

	/**
	 * Método que mostrará el menú por consola
	 * rbr - 211024
	 */
	public void mostrarMenu() {
		
		System.out.println("=== Gestor de Tareas ===");
		System.out.println("1. Agregar una tarea");
		System.out.println("2. Eliminar una tarea");
		System.out.println("3. Marcar tarea como completada");
		System.out.println("4. Mostrar todas las tareas");
		System.out.println("5. Salir");
		System.out.println("Elige una opción:");
		
	}

}
