/* Ejercicio 4.4 - Traduce este código de for a while.
 */

public class Ejercicio04_04Sol {
	public static void main(String[] args) {
		if (args.length == 1) {
			int num = Integer.valueOf(args[0]);
			int res = 1;
			while (num > 0) {
				res *= num;
				num --;
			}
			System.out.println("Resultado: " + res);
		} else {
			System.err.println("Necesito un argumento, ni más ni menos");
		}
	}
}