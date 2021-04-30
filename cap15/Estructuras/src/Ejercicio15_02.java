import java.util.StringTokenizer;

public class Ejercicio15_02 {
	private static final String COMA = ",";
	public static final String TEXTO = "Con diez cañones por banda, "
			+ "viento en popa a toda vela, no corta el mar, sino vuela "
			+ "un velero bergantín";

	public static void main(String[] args) {
		String[] res = separa(TEXTO);
		for (String string : res) {
			System.out.println(string);
		}
	}

	private static String[] separa(String texto) {
		StringTokenizer st = new StringTokenizer(texto, COMA);
		String[] res = new String[st.countTokens()];
		int i = 0;
		while (st.hasMoreTokens()) {
			res[i++] = st.nextToken().trim();
		}
		return res;
	}
}
