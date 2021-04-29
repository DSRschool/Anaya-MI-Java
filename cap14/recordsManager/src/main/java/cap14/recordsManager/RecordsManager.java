package cap14.recordsManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RecordsManager {
	private static Logger logger = LogManager.getLogger(RecordsManager.class);

    private static final String INPUT_FILE = "puntuaciones.txt";
    private static final String OUTPUT_FILE = "records.txt";
    private static final int MIN_NAME_LENGTH = 6;
    private static final int MIN_SCORE = 1000;

    private static Random r = new Random();

    public static void main(String[] args) {

        /// (9) Cerramos el scanner del fichero de entrada
        // usando el try con recursos nos aseguramos de que el scanner se cierra
        try (Scanner sInput = new Scanner(new File(INPUT_FILE))) {
            Map<String, Integer> players = new HashMap<>();

            /// (1) Leer fichero de entrada
            while (sInput.hasNextLine()) {
                String line = sInput.nextLine();
                String[] data = line.split(" ");
                try {
                    String name = data[0];
                    int score = Integer.parseInt(data[1]);
                    /// (7) Tratamos los problemas de validación del jugado
                    try {
                        validateName(name);
                    } catch (PlayerNameTooShortException pntse) {
        				logger.warn(pntse.getMessage());
        				name = generateNewName(name);
                        System.out.println(" El nuevo nombre de usuario es " + name);
                    }
        			/// (8) Validamos la puntuación
                    try {
                        validateScore(name, score);
                    } catch (ScoreTooLowException stle) {
        				logger.error(stle.getMessage());
                        System.out.println(" Jugador descartado");
                        continue;
                    }
                    players.put(name, score);
        			logger.info("Línea tratada correctamente: " + name + " - " + score);
                } catch (IndexOutOfBoundsException | NumberFormatException e) {
                	logger.error("La línea no contiene los datos esperados (" 
                        + line + ")");
                    // y seguimos con el while
                }
            }

            /// (2) Mostrar por consola todos los datos guardados
            System.out.println("Datos procesados: ");
            for (String name : players.keySet()) {
                System.out.println(name + ":\t" + players.get(name));
            }

            /// (3) Pedir confirmación al usuario
            System.out.println("¿Son correctos? [S]i/[N]o");
            /// (10) Cerramos el escáner de consola
            String answer;
            try (Scanner sConsole = new Scanner(System.in)) {
                answer = sConsole.next();
            }
            boolean confirmed = answer.equalsIgnoreCase("S");

            /// (4) Escribir a fichero
            if (confirmed) {
                System.out.println("Procedemos al volcado de datos del fichero...");
                /// (11) Cerramos el fichero de salida y controlamos IOE
                try (FileOutputStream fos = new FileOutputStream(OUTPUT_FILE)) {
                    for (String name : players.keySet()) {
                        fos.write((name + " " + players.get(name) + "\n").getBytes());
                    }
                } catch (IOException ioe) {
                	logger.error("No hemos podido escribir los resultados en el " +
                            "fichero porque algo ha fallado: " + ioe.getMessage());
                }
            }
        } catch (FileNotFoundException fnfe) {
        	logger.error("No podemos ejecutar el programa porque no se encuentra "
                    + "el fichero de entrada esperado: " + INPUT_FILE);
        }
    }

    protected static void validateName(String name)
            throws PlayerNameTooShortException {
        /// (5) Validamos la longitud del nombre
        if (name.length() < MIN_NAME_LENGTH) {
            throw new PlayerNameTooShortException(name);
        }
    }

    protected static void validateScore(String name, int score)
            throws ScoreTooLowException {
        /// (6) Validamos la puntuación mínima
        if (score < MIN_SCORE) {
            throw new ScoreTooLowException(name, score);
        }
    }

    protected static String generateNewName(String name) {
        int randomSize = MIN_NAME_LENGTH - name.length();
        for (int i = 0; i < randomSize; i ++) {
            int randomNum = r.nextInt(10);
            name += randomNum;
        }
        return name;
    }
}
