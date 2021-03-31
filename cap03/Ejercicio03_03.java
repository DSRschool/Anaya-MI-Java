/* Ejercicio 3.3 – Realiza el mismo ejercicio que en el punto anterior, 
 * pero pon el número máximo de argumentos aceptables en una constante.
 */

public class Ejercicio03_03 {
	// Número máximo de argumentos.
	// Es una constante, el nombre debe decirnos qué significa, no que valor tiene
	// y debemos escribirlo en MAYÚSCULAS
	private static final int MAX_ARGS = 4;

	public static void main(String[] args) {
		int numArgs = args.length;
		if (numArgs == 0) {
			// System.err.println sacará el mensaje por la salida de error
			// En este caso, por la consola, pero en rojo
			System.err.println("No se han recibido argumentos");
		} else if (numArgs <= MAX_ARGS) { 
			System.out.println("Se han recibido " + numArgs + " argumentos");			
		} else {
			System.err.println("Se han recibido demasiados argumentos");
		}
	}
}
