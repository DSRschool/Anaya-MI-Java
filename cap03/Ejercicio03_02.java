/* Ejercicio 3.2 - Comprueba el número de argumentos que recibe tu programa. 
 * Si no recibe argumentos, avisa al usuario. Si recibe hasta 4, indícale 
 * cuántos has recibido. Si recibe más, avisa al usuario.
 */

public class Ejercicio03_02 {
	public static void main(String[] args) {
		int numArgs = args.length;
		if (numArgs == 0) {
			// System.err.println sacará el mensaje por la salida de error
			// En este caso, por la consola, pero en rojo
			System.err.println("No se han recibido argumentos");
		} else if (numArgs <= 4) { // Si tenemos más de dos casos, podemos añadir
			// tantas ramas else if como necesitemos
			System.out.println("Se han recibido " + numArgs + " argumentos");			
		} else {
			System.err.println("Se han recibido demasiados argumentos");
		}
	}
}
