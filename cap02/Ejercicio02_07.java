/* Ejercicio 2.7 - Escribe un programa que reciba estos 7 argumentos:
 * 0. Primer apellido
 * 1. Segundo apellido
 * 2. Nombre primer hijo
 * 3. Nombre segundo hijo
 * 4. Nombre tercer hijo
 * 5. Nombre del padre
 * 6. Nombre de la madre
 * Y saque los datos de toda la familia: una línea por cada miembro.
 *
 * Vamos a meter un tercer ejercicio en este tema, para mejorar lo que hemos hecho en el ejercicio 04b. 
 *
 * Esta vez vamos a crear dos métodos: uno que construya el nombre de cada persona:
 * protected static String construyeNombreCompleto(String nombre, String apellido1, String apellido2)
 * que se encargue de la parte de concatenar los distintos elementos del nombre.
 * 
 * Y otro que reciba el nombre completo y lo pinte por pantalla:
 * protected static void pintarNombreCompleto(String nombreCompleto)
 * 
 * Usa los métodos para sacar los datos de todos los miembros de la familia, en el mismo orden de antes
 */

public class Ejercicio02_07 {
	public static void main(String[] args) {
		String apellido1 = args[0];
		String apellido2 = args[1];
		String hijo1 = args[2];
		String hijo2 = args[3];
		String hijo3 = args[4];
		String padre = args[5];
		String madre = args[6];

		String apellidosHijos = apellido1 + " " + apellido2;

		pintarNombreCompleto(construyeNombreCompleto(padre, apellido1, ""));
		pintarNombreCompleto(construyeNombreCompleto(madre, apellido2, ""));
		pintarNombreCompleto(construyeNombreCompleto(hijo1, apellido1, apellido2));
		pintarNombreCompleto(construyeNombreCompleto(hijo2, apellido1, apellido2));
		pintarNombreCompleto(construyeNombreCompleto(hijo3, apellido1, apellido2));
	}

	protected static String construyeNombreCompleto(String nombre, String apellido1, String apellido2) {
    	return "Nombre: " + nombre + " Apellidos: " + apellido1 + " " + apellido2;
    }
    
    protected static void pintarNombreCompleto(String nombreCompleto) {
        System.out.println(nombreCompleto);
    }
}