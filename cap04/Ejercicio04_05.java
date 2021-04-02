/* Ejercicio 4.5 - Indica la posición del primer argumento recibido que sea una 
 * palabra demasiado larga (más de 10 caracteres): “La Xª palabra es demasiado 
 * larga.” (empezando por la primera), o “Todas las palabras son correctas.”, 
 * si no hay ninguna que sobrepase dicha longitud.
 */

public class Ejercicio04_05 {
	 private static final int LIM = 10;

	public static void main(String[] args) {
		int i = 0;
		boolean encontrada = false;
		while (i < args.length && !encontrada) {
			encontrada = args[i].length() > LIM;
			i ++;
		}
		if (encontrada) {
			System.out.println("La " + i + "ª palabra es demasiado larga.");
		} else {
			System.out.println("Todas las palabras son correctas.");
		}
	}
}