import java.util.Scanner;

public class Ejercicio04_06 {

	private static final String CLAVE = "abracadabra";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String palabra;
		do {
			System.out.println("¡Hola!, por favor, escribe '" + CLAVE + "':");
			palabra = scanner.nextLine();
		} while (!palabra.equals(CLAVE));

		System.out.println("TU: " + palabra);
		System.out.println("YO: ¡pata de cabra!");
	}
}