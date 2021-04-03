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

	private static final int EMPATE = 0;
	private static final int GANAS = 1;
	private static final int PIERDES = 2;

	private static final int ERROR_NO_ENCONTRADA = -1;

	// Mensajes al usuario
	private static final String BIENVENIDA = 
		"¡Bienvenido al juego Piedra-papel-tijeras!";
	private static final String OPCIONES = 
		PIEDRA + " (piedra), " + PAPEL + " (papel), " 
		+ TIJERAS + " (tijeras) o " + SALIR + " (salir)";
	private static final String PEDIR_JUGADA = 
		"¿Cuál es tu jugada? " + OPCIONES;
	private static final String PEDIR__NUEVA_JUGADA = 
		"¿Cuál es tu nueva jugada? " + OPCIONES;
	private static final String FIN = "Fin de la partida";

	private static final String MSJ_ERROR_NO_ENCONTRADA = 
		"No entiendo tu jugada";

	public static void main(String[] args) {
		// abrimos un scanner para leer la entrada del usuario
		Scanner s = new Scanner(System.in);

		// Instrucciones
		System.out.println(BIENVENIDA);
		System.out.println(PEDIR_JUGADA);

		while(true) { // iteramos para siempre
			// Jugada del ordenador
			int eleccionPC = (int)(Math.random() * JUEGO.length);

			// Jugada del usuario
			String sEleccionUsuario = s.next();
			if (sEleccionUsuario.equalsIgnoreCase(SALIR)) {
				break; // Si nos da una S, cortamos el bucle para terminar
			}

			// Interpretación de la jugada del usuario
			int eleccionUsuario = convertir(sEleccionUsuario);
			if (eleccionUsuario == ERROR_NO_ENCONTRADA) {
				System.err.println(MSJ_ERROR_NO_ENCONTRADA);
				continue; // Seguimos en el bucle, siguiente iteración
			}

			// Calcular el ganador de la jugada
			int resultado = usuarioGana(eleccionPC, eleccionUsuario);

			// Mostar el resultado de la jugada
			switch (resultado) {
				case GANAS:
					System.out.println("¡Enhorabuena! Tu " 
						+ JUEGO[eleccionUsuario] + " gana a " 
						+ JUEGO[eleccionPC]);
					break;
				case PIERDES:
					System.out.println("¡Lo siento! Tu " 
						+ JUEGO[eleccionUsuario] + " pierde ante " 
						+ JUEGO[eleccionPC]);
					break;
				case EMPATE:
					System.out.println("¡Empate a " + JUEGO[eleccionPC] + "!");
					break;
			}
			System.out.println("¿Cuál es tu nueva jugada? P (piedra), L (papel), T (tijeras) o S (salir)");
		}
		System.out.println(FIN);
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

	private static int usuarioGana(int eleccionPC, int eleccionUsuario) {
		int res = eleccionUsuario - eleccionPC;
		if (res < 0) {
			res += JUEGO.length; 
		}
		return res;
	}
}
