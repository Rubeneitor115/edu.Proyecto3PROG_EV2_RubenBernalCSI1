/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.ArrayList;
import java.util.Scanner;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

/**
 * Clase controladora de la aplicación
 * @author rbr - 211024
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 211024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int opcion;
		boolean cerrar = false;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creo la lista de las tareas
		ArrayList<Tarea> lista = new ArrayList<Tarea>();
		
		//Instancio las interfaces con sus implementaciones
		MenuInterfaz mi = new MenuImplementacion();
		
		do {
			//Muestro el menú por consola
			mi.mostrarMenu();
			//Recojo la opción deseada por el usuario
			opcion = sc.nextInt();
			//Accedo a la opción seleccionada
			switch(opcion) {
			case 1:
				System.out.println("Ha seleccionado la opción para agregar una tarea a la lista de tareas.");
				agregarTarea(lista);
				break;
			case 2:
				System.out.println("Ha seleccionado la opción para eliminar una tarea de la lista de tareas.");
				eliminarTarea(lista);
				break;
			case 3:
				System.out.println("Ha seleccionado la opción para marcar una tarea como completada.");
				marcarTareaCompletada(lista);
				break;
			case 4:
				System.out.println("Ha seleccionado la opción para mostrar todas las tareas.");
				mostrarTareas(lista);
				break;
			case 5:
				System.out.println("Cerrando aplicación...");
				cerrar = true;
				System.out.println("Aplicación cerrada satisfactoriamente!!!");
				break;
			default:
				System.err.println("La opción introducida no es válida...");
				System.err.println("Inténtelo de nuevo...");
				break;
			}
		}while(!cerrar);

	}

	/**
	 * Método que agregará una tarea a la lista de tareas
	 * rbr - 211024
	 * @param lista
	 * @return lista
	 */
	public static ArrayList<Tarea> agregarTarea(ArrayList<Tarea> lista){
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		Tarea tarea = new Tarea();
		System.out.println("Introduce el nombre de la tarea: ");
		tarea.setNombre(sc.next());
		System.out.println("Introduce la descripción de la tarea");
		tarea.setDescripcion(sc.next());
		tarea.setCompletada(false);
		
		lista.add(tarea);
		
		return lista;
	}
	
	/**
	 * Método que eliminará una tarea de la lista de tareas
	 * rbr - 211024
	 * @param lista
	 * @return lista
	 */
	public static ArrayList<Tarea> eliminarTarea(ArrayList<Tarea> lista){
		
		Scanner sc = new Scanner(System.in);
		mostrarTareas(lista);
		System.out.print("Ingrese el número de la tarea que desea eliminar: ");
        int indice = sc.nextInt();
		
        if (indice >= 1 && indice <= lista.size()) {
            lista.remove(indice - 1);
            System.out.println("Tarea eliminada con éxito.");
        } else {
            System.out.println("Índice no válido.");
        }
        
		return lista;
	}
	
	/**
	 * Método que marcará una tarea de la lista de tareas como completada
	 * rbr - 211024
	 * @param lista
	 * @return lista
	 */
	public static ArrayList<Tarea> marcarTareaCompletada(ArrayList<Tarea> lista){
		
		Scanner sc = new Scanner(System.in);
		mostrarTareas(lista);
        System.out.print("Ingrese el número de la tarea que desea marcar como completada: ");
        int indice = sc.nextInt();

        if (indice >= 1 && indice <= lista.size()) {
            Tarea tarea = lista.get(indice - 1);
            tarea.setCompletada(true);
            System.out.println("Tarea marcada como completada.");
        } else {
            System.out.println("Índice no válido.");
        }
		
		return lista;
	}

	/**
	 * Método que mostrará todas las tareas de la lista de tareas
	 * rbr - 211024
	 * @param lista
	 * @return lista
	 */
	public static ArrayList<Tarea> mostrarTareas(ArrayList<Tarea> lista){
		
		for(int i = 0; i < lista.size(); i++) {
			 System.out.println((i + 1) + ". " + lista.get(i));
		}
		
		return lista;
	}
}
