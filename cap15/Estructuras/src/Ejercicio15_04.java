import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio15_04 {
	private static final Random RND = new Random();
	private static final int NUM_LETRAS = 26;
	private static final char PRIMERA_LETRA = 'a';
	private static final int TAM = 1000;

	public static void main(String[] args) {
		List<String> lista = generaLista();
		System.out.println(lista);
	}

	private static List<String> generaLista() {
		List<String> lista = new ArrayList<>(TAM);
		for (int i = 0; i < TAM; i++) {
			lista.add(generaSilaba());
		}
		return lista;
	}
	
	private static String generaSilaba() {
		return generaLetra() + generaLetra();
	}
	
	private static String generaLetra() {
		char c = (char) (PRIMERA_LETRA + RND.nextInt(NUM_LETRAS));
		return Character.toString(c);
	}
}