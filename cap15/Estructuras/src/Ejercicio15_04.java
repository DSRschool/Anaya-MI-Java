import java.util.Random;

public class Ejercicio15_04 {
	private static final Random RND = new Random();
	private static final int NUM_LETRAS = 26;
	private static final char PRIMERA_LETRA = 'a';

	public static void main(String[] args) {
		System.out.println(generaSilaba());
	}
	
	private static String generaSilaba() {
		return generaLetra() + generaLetra();
	}
	
	private static String generaLetra() {
		char c = (char) (PRIMERA_LETRA + RND.nextInt(NUM_LETRAS));
		return Character.toString(c);
	}
}
