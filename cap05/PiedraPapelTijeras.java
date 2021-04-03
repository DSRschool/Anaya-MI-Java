/* Proyecto – Vamos a jugar a piedra-papel-tijeras contra el ordenador. 
 * Tendrás que explicarle al jugador cómo se juega, pedirle que nos dé su jugada 
 * (Piedra, papeL, Tijeras, Salir), generar una jugada aleatoria para el ordenador 
 * y decidir quien ha ganado.
 */

import java.util.Scanner;

public class PiedraPapelTijeras {
	private static final String PIEDRA = "P";
	private static final String PAPEL = "L";
	private static final String TIJERAS = "T";
	private static final String SALIR = "S";

	private static final String[] JUEGO = {PIEDRA, PAPEL, TIJERAS};

	private static final int ERROR_NO_ENCONTRADA = -1;

	// Mensajes al usuario
	private static final String BIENVENIDA = 
		"¡Bienvenido al juego Piedra-papel-tijeras!";
	private static final String PEDIR_JUGADA = "¿Cuál es tu jugada? " 
		+ PIEDRA + " (piedra), " + PAPEL + " (papel), " 
		+ TIJERAS + " (tijeras) o " + SALIR + " (salir)";
	private static final String MSJ_ERROR_NO_ENCONTRADA = 
		"No entiendo tu jugada";

	public static void main(String[] args) {
		// abrimos un scanner para leer la entrada del usuario
		Scanner s = new Scanner(System.in);

		// Instrucciones
		System.out.println(BIENVENIDA);
		System.out.println(PEDIR_JUGADA);

		// Jugada del ordenador
		int eleccionPC = (int)(Math.random() * JUEGO.length);
		System.out.println("*** " + JUEGO[eleccionPC]);

		// Jugada del usuario
		String sEleccionUsuario = s.next();
		System.out.println("*** " + sEleccionUsuario);

		// Interpretación de la jugada del usuario
		int eleccionUsuario = convertir(sEleccionUsuario);
		System.out.println("*** " + eleccionUsuario);
		if (eleccionUsuario == ERROR_NO_ENCONTRADA) {
			System.err.println(MSJ_ERROR_NO_ENCONTRADA);
		}

		// cerramos lo que abrimos
		s.close();
	}

	private static int convertir(String sEleccionUsuario) {
		for (int i = 0; i < JUEGO.length; i++) {
			if (JUEGO[i].equalsIgnoreCase(sEleccionUsuario)) {
				// equalsIgnoreCase nos permite aceptar respuestas en mayúscula o minúscula
				return i;
			}
		}
		return ERROR_NO_ENCONTRADA; // TODO tratar esto correctamente
	}
}
