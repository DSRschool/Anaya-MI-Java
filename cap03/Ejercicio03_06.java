/* Ejercicio 3.6: OPERADOR TERNARIO – Calcula el valor absoluto de un float recibido como parámetro.
 */
public class Ejercicio03_06 {
	public static void main(String[] args) {
		float num = Float.valueOf(args[0]);

		// operador ternario: cond ? siCierto : siFalso
		float abs = num > 0 ? num : -num;
		// alternativa con if
		// if (num > 0) {
		// 	abs = num;
		// } else {
		// 	abs = -num;
		// }
		
		System.out.println("El valor absoluto de " + num + " es " + abs);
	}
}
