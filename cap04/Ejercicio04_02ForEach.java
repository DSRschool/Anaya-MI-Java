/* Ejercicio 4.2 - Lista todos los argumentos que recibas, pero mostrando su posición:
 * Usando for each
 * java Ejercicio04_02ForEach hola como estás
 * 0) hola
 * 1) como
 * 2) estás
 */

public class Ejercicio04_02ForEach {
	public static void main(String[] args) {
		int i = 0;
		for (String s : args) {
			System.out.println(i + ") " + s);
			i ++;
		}
	}
}