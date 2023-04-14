public class OrdenEjecucion {
	private static final String CASO_0 = "ABCGHI";
	private static final String CASO_1 = "ABDGHI";
	private static final String CASO_2 = "ABEGH";
	private static final String CASO_3 = "ABCG";
	private static final String CASO_4 = "ABDG";
	private static final String[] CASOS = {CASO_0, CASO_1, CASO_2, CASO_3, CASO_4};
	
	static String res = "";
	
	public static void main(String[] args) {
		for (int i = 0; i < CASOS.length; i ++) {
			res = "";
			try {
				ordename(i);
			} catch (Exception e) {
				// aunque falle, quiero seguir y ver cómo dejó res
			}
			System.out.println("Caso " + i + ": " + res + " " + (res.equals(CASOS[i])));
		}
	}
	
	public static void ordename(int caso) throws BException {
		res = "A";
		try {
			res += "B";
			metodoUno(caso);
			res += "C";
		} catch (AException ae) {
			res += "D";
		} catch (BException be) {
			res += "E";
			throw be;
			// ni compila, si la pongo res += "F";
		} finally {
			res += "G";
			metodoDos(caso);
			res += "H";
		}
		res += "I";
	}

	private static void metodoUno(int caso) throws AException, BException {
		// tu código aquí
	}

	private static void metodoDos(int caso) {
		// tu código aquí
	}
}

class AException extends Exception {
	
}

class BException extends Exception {
	
}
