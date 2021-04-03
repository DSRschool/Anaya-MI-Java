/* Proyecto – Vamos a jugar a piedra-papel-tijeras contra el ordenador. 
 * Tendrás que explicarle al jugador cómo se juega, pedirle que nos dé su jugada 
 * (Piedra, papeL, Tijeras, Salir), generar una jugada aleatoria para el ordenador 
 * y decidir quien ha ganado.
 */

public class PiedraPapelTijeras {
	private static final String PIEDRA = "P";
	private static final String PAPEL = "L";
	private static final String TIJERAS = "T";
	private static final String SALIR = "S";

	private static final String[] JUEGO = {PIEDRA, PAPEL, TIJERAS};

	// Mensajes al usuario
	private static final String BIENVENIDA = 
		"¡Bienvenido al juego Piedra-papel-tijeras!";
	private static final String PEDIR_JUGADA = "¿Cuál es tu jugada? " 
		+ PIEDRA + " (piedra), " + PAPEL + " (papel), " 
		+ TIJERAS + " (tijeras) o " + SALIR + " (salir)";

	public static void main(String[] args) {
		// Instrucciones
		System.out.println(BIENVENIDA);
		System.out.println(PEDIR_JUGADA);

		// Jugada del ordenador
		int eleccionPC = (int)(Math.random() * JUEGO.length);
		System.out.println("*** " + JUEGO[eleccionPC]);
	}
}
