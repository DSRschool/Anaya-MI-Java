/* Ejercicio 2.6 - Escribe un programa que reciba estos 7 argumentos:
 * 0. Primer apellido
 * 1. Segundo apellido
 * 2. Nombre primer hijo
 * 3. Nombre segundo hijo
 * 4. Nombre tercer hijo
 * 5. Nombre del padre
 * 6. Nombre de la madre
 * Y saque los datos de toda la familia: una línea por cada miembro.
 * Crea un método pintarPersona que reciba como argumento 3 strings (el nombre y los dos apellidos) 
 * y saque como salida: “Nombre: <nombre> Apellidos: <ap1> <ap2>”. 
 * Usa la cadena vacía (“”) para los segundos apellidos desconocidos.
 * Usa el método para sacar los datos de todos los miembros de la familia, en el mismo orden de antes:
 */

public class Ejercicio02_06 {
	public static void main(String[] args) {
		String apellido1 = args[0];
		String apellido2 = args[1];
		String hijo1 = args[2];
		String hijo2 = args[3];
		String hijo3 = args[4];
		String padre = args[5];
		String madre = args[6];

		String apellidosHijos = apellido1 + " " + apellido2;

		pintaPersona(padre, apellido1, "");
		pintaPersona(madre, apellido2, "");
		pintaPersona(hijo1, apellido1, apellido2);
		pintaPersona(hijo2, apellido1, apellido2);
		pintaPersona(hijo3, apellido1, apellido2);
	}

	protected static void pintaPersona(String nombre, String apellido1, String apellido2) {
		System.out.println("Nombre: " + nombre + " Apellidos: " + apellido1 + " " + apellido2);
	}
}