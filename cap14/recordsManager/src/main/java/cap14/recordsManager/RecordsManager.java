package cap14.recordsManager;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
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

	private static Random r = new Random();

	public static void main(String[] args) {
		Map<String, Integer> players = new HashMap<>();

		/// (1) Leer fichero de entrada
		Scanner s = new Scanner(new File(INPUT_FILE));
		while (s.hasNextLine()) {
			String line = s.nextLine();
			String[] data = line.split(" ");
			String name = data[0];
			int score = Integer.parseInt(data[1]);
			/// (7) Validamos el nombre
			try {
				validateName(name);
			} catch (PlayerNameTooShortException pntse) {
				logger.warn(pntse.getMessage());
				name = generateNewName(name);
				System.out.println("El nuevo nombre de usuario es " + name);
			}
			/// (8) Validamos la puntuación
			// los tratamos por separado para poder validar la puntuación
			// después de haber arreglado el nombre
			try {
				validateScore(name, score);
			} catch (ScoreTooLowException stle) {
				logger.error(stle.getMessage());
				continue; // nos saltamos este jugador, vamos a la siguiente línea
			}
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
		Scanner sConsole = new Scanner(System.in);
		String answer = sConsole.next();
		boolean confirmed = answer.equalsIgnoreCase("S");

		/// (4) Escribir a fichero
		if (confirmed) {
			System.out.println("Procedemos al volcado de datos del fichero...");
			FileOutputStream fos = new FileOutputStream(OUTPUT_FILE);
			for (String name : players.keySet()) {
				fos.write((name + " " + players.get(name) + "\n").getBytes());
			}
		}
	}

	/// (5) Validamos la longitud del nombre
	private static void validateName(String name) throws PlayerNameTooShortException {
		if (name.length() < MIN_NAME_LENGTH) {
			throw new PlayerNameTooShortException(name);
		}
	}

	/// (6) Validamos la puntuación mínima
	private static void validateScore(String name, int score) throws ScoreTooLowException {
		if (score < MIN_SCORE) {
			throw new ScoreTooLowException(name, score);
		}
	}

	private static String generateNewName(String name) {
		int randomSize = MIN_NAME_LENGTH - name.length();
		for (int i = 0; i < randomSize; i++) {
			int randomNum = r.nextInt(10);
			name += randomNum; // añadimos un número más al final
		}
		return name;
	}
}
