import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.ResourceBundle;

public class Ejercicio15_05 {
	private static final Random RND = new Random();
	private static final int NUM_LETRAS = 26;
	private static final char PRIMERA_LETRA = 'a';
	private static final int TAM = 10;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.CHINA);
//		Locale.setDefault(Locale.TAIWAN);
		
		List<String> lista = generaLista();
		Map<Character, Integer> mapa = cuentaLetras(lista);
		pintaMapa(mapa);
	}
	
	private static void pintaMapa(Map<Character, Integer> mapa) {
		ResourceBundle bundle = ResourceBundle.getBundle("ejercicio15_05");
		String mensaje = bundle.getString("mensaje");
		StringBuilder sb = new StringBuilder();
		for (Entry<Character, Integer> entry : mapa.entrySet()) {
			String m = MessageFormat.format(mensaje, entry.getKey(), entry.getValue());
			sb.append(m);
		}
		System.out.println(sb.toString());
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
