/* Ejercicio 3.4 – Escribe un programa que reciba el número de mes y devuelva
 * el número de días que tiene. Ignora los años bisiestos. 
 * Sólo debes hacer algo si recibes 1 sólo parámetro.
 */

public class Ejercicio03_04 {
	public static void main(String[] args) {
		if (args.length == 1) {
			int mes = Integer.valueOf(args[0]);
			// || es el OR, será cierto si al menos uno de los operandos es cierto
			if (mes < 1 || mes > 12) {
				System.err.println(mes + " no es un mes válido");
			} else {
				int dias = calculaDias(mes);
				System.out.println("El mes " + mes + " tiene " + dias + " días.");
			} // if mes
		} // if args
	} // main

	private static int calculaDias(int mes) {
		int dias;
		// miraremos los valores de mes
		// se puede hacer siempre con enteros y caracteres
		switch (mes) {
			case 2:
				System.out.println("Febrero");
				dias = 28;
				break;
			case 4:
				System.out.println("Abril");
			case 6:
				System.out.println("Junio");
			case 9:
				System.out.println("Setiembre");
			case 11:
				System.out.println("Noviembre");
				dias = 30;
				break; // hasta que no ponemos el break, sigue ejecutando
				// prueba con un 4 de parámetro ;)
			default:
				System.out.println("Mes de los largos");
				dias = 31;
				break;
		} // switch
		return dias;		
	}
} // clase
