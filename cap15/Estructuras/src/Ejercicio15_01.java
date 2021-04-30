public class Ejercicio15_01 {
	private static final char COMA = ',';
	public static final String TEXTO = "Con diez cañones por banda, "
			+ "viento en popa a toda vela, no corta el mar, sino vuela "
			+ "un velero bergantín";

	public static void main(String[] args) {
		int res = cuentaComas(TEXTO);
		System.out.println("El texto tiene " + res + " comas.");
	}

	private static int cuentaComas(String texto) {
		int res = 0;
		int pos = texto.indexOf(COMA);
		while (pos != -1) {
			res ++;
			pos = texto.indexOf(COMA, pos+1);
		}
		
		return res;
	}
}
