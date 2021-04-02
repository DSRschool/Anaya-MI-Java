/* Ejercicio 4.2 - Lista todos los argumentos que recibas, pero mostrando su posición:
 *
 * java Ejercicio04_02 hola como estás
 * 0) hola
 * 1) como
 * 2) estás
 */

public class Ejercicio04_02 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i ++) {
			String s = args[i];
			System.out.println(i + ") " + s);
		}
	}
}