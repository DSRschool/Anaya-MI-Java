public class Ejemplo04_04 {
	// Acuérdate de usar constantes
	private static final String FIN = "fin";

	public static void main(String[] args) {
		System.out.println("Se han recibido " + args.length + " argumentos:");	

		// El bucle while itera hasta que se cumple la condición
		// No podemos olvidar controlar la posición
		int i = 0; // Punto de inicio
		// CUIDADO!!! No podemos comparar strings con ==
		while (i < args.length && !args[i].equals(FIN)) { // condición de terminación
			System.out.println(i + ")" + args[i]);
			i++; // actualización
		}
		
		// Como la i fue declarada fuera del bucle, aquí aún podemos usarla.
		System.out.println("\"fin\" estaba en la posición nº " + i);
	}
}