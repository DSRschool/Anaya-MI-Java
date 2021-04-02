/* Ejercicio 4.3 - Lista todos los argumentos que recibas, pero cumpliendo las siguientes reglas:
 * Si la palabra es corta (5 o menos caracteres), la imprimes 4 veces en la misma línea, 
 * y si es larga la repites sólo 2 veces.
 */

public class Ejercicio04_03 {
	// no te olvides de poner todos los números mágicos como constantes!
	private static final int LIM = 5;
	private static final int REP_CORTA = 4;
	private static final int REP_LARGA = 2;

	public static void main(String[] args) {
		for (String s : args) {
			if (s.length() < LIM) {
				for (int i = 0; i < REP_CORTA; i++) {
					System.out.print(s + " ");
				}
				System.out.println(); // no te olvides del salto de línea
			} else {
				for (int i = 0; i < REP_LARGA; i++) {
					System.out.print(s + " ");
				}
				System.out.println(); // no te olvides del salto de línea
			}
		}
	}
}