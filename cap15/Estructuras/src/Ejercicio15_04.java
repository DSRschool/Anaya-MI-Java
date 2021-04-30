import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Ejercicio15_04 {
	private static final Random RND = new Random();
	private static final int NUM_LETRAS = 26;
	private static final char PRIMERA_LETRA = 'a';
	private static final int TAM = 1000;

	public static void main(String[] args) {
		List<String> lista = generaLista();
		Map<Character, Integer> mapa = cuentaLetras(lista);
		System.out.println(mapa);
	}
	
	private static Map<Character, Integer> cuentaLetras(List<String> lista) {
		Map<Character, Integer> mapa = new HashMap<>();
		for (String silaba : lista) {
			Character c = getPrimero(silaba);
			Integer cont = mapa.get(c);
			if (cont == null) {
				cont = 0;
			}
			mapa.put(c, ++cont);
		}
		return mapa;
	}

	private static Character getPrimero(String silaba) {
		return silaba.charAt(0);
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