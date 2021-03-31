public class Ejemplo04_05b {
	// Acuérdate de usar constantes
	private static final String FIN = "fin";

	public static void main(String[] args) {
		// != será cierto si ambos operandos son distintos
		if (args.length != 0) {
			System.out.println("Se han recibido " + args.length + " argumentos:");	

			// El bucle do while se ejecuta al menos una vez, 
			// y hasta que se cumple la condición
			int i = 0;
			String palabra; // debemos declararla fuera del bucle para poderlo usar en la condición
			do {
				palabra = args[i];
				System.out.println(i + ")" + palabra);
				i++;
			} while (!palabra.equals(FIN) && i < args.length);
		} else {
			System.err.println("No se han recibido argumentos");
		}
	}
}