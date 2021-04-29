package cap14.recordsManager;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Atención, esta versión del código no compila

public class RecordsManager {
	private static Logger logger = LogManager.getLogger(RecordsManager.class);

	private static final String INPUT_FILE = "puntuaciones.txt";
	private static final String OUTPUT_FILE = "records.txt";
	private static final int MIN_NAME_LENGTH = 6;
	private static final int MIN_SCORE = 1000;

	public static void main(String[] args) {
		// usaremos un map (o diccionario) para guardar los datos leídos
		// nombre como clave y puntuación como contenido
		Map<String, Integer> players = new HashMap<>();

		/// (1) Leer fichero de entrada
		Scanner s = new Scanner(new File(INPUT_FILE));
		// mientras tenga más lineas
		while (s.hasNextLine()) {
			// cogemos la siguiente línea
			String line = s.nextLine();
			// y la troceamos por los espacios
			String[] data = line.split(" ");
			// el primer fragmento será el nombre del jugador
			String name = data[0];
			// y el segundo fragmento su puntuación
			int score = Integer.parseInt(data[1]);
			// comprobamos que todos los datos del jugador son correctos
			validatePlayer(name, score);
			// añadimos este jugador al diccionario
			players.put(name, score);
			logger.info("Línea tratada correctamente: " + name + " - " + score);
		}

		/// (2) Mostrar por consola todos los datos guardados
		System.out.println("Datos procesados: ");
		for (String name : players.keySet()) {
			System.out.println(name + ":\t" + players.get(name));
		}

		/// (3) Pedir confirmación al usuario
		System.out.println("¿Son correctos? [S]i/[N]o");
		// leemos la respuesta del usuario de la entrada estándar
		Scanner sConsole = new Scanner(System.in);
		String answer = sConsole.next();
		// y comprobamos si es afirmativa
		boolean confirmed = answer.equalsIgnoreCase("S");

		/// (4) Escribir a fichero
		if (confirmed) {
			System.out.println("Procedemos al volcado de datos del fichero...");
			// abrimos el fichero de salida para escribir en él
			FileOutputStream fos = new FileOutputStream(OUTPUT_FILE);
			// por cada uno de los jugadores en nuestro diccionario
			for (String name : players.keySet()) {
				// escribimos una línea en el fichero de salida
				fos.write((name + " " + players.get(name) + "\n").getBytes());
			}
		}
	}

	private static void validatePlayer(String name, int score) {
	}
}
