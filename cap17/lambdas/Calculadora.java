package lambdas;

public class Calculadora {
	static final AritmeticaEntera PRODUCTO = (a, b) -> a * b;

	interface AritmeticaEntera {
		int operacion(int a, int b);
	}

	public static int operacionBinaria(int x, int y, AritmeticaEntera ae) {
		return ae.operacion(x, y);
	}
	
	static class Suma implements AritmeticaEntera {
		@Override
		public int operacion(int a, int b) {
			return a + b;
		}
	}

	public static void main(String... args) {
		System.out.println("6 + 2 = " + operacionBinaria(6, 2, new Suma()));
		System.out.println("6 - 2 = " + operacionBinaria(6, 2, (a, b) -> a - b));
		System.out.println("6 * 2 = " + operacionBinaria(6, 2, PRODUCTO));
		System.out.println("6 / 2 = " + operacionBinaria(6, 2, (a, b) -> a / b));
		System.out.println("6 ^ 2 = " + operacionBinaria(6, 2, (a, b) -> (int) Math.pow(a, b)));
	}
}
