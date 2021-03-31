/* Ejercicio 3.1 – Comprueba el número de argumentos que recibe tu programa. 
 * Si no recibe argumentos, avisa al usuario. En caso contrario, indícale cuántos 
 * has recibido.
 */

public class Ejercicio03_01 {
	public static void main(String[] args) {
		int numArgs = args.length;
		// en la rama if, pondremos una condición
		if (numArgs == 0) {
			// System.err.println sacará el mensaje por la salida de error
			// En este caso, por la consola, pero en rojo
			System.err.println("No se han recibido argumentos");
		} else { // la rama else se ejecutará en el resto de casos
			System.out.println("Se han recibido " + numArgs + " argumentos");
		}
	}
}
