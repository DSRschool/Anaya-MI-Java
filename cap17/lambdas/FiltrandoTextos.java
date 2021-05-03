package lambdas;

import java.util.function.Predicate;

public class FiltrandoTextos {

	public static void main(String[] args) {
		System.out.print("Cadenas largas: ");
		procesar(args, s -> s.length() > 5);

		System.out.print("Letras: ");
		procesar(args, s -> s.length() == 1);

		System.out.print("Sin a: ");
		procesar(args, s -> s.indexOf('a') == -1);
	}

	public static void procesar(String[] textos, Predicate<String> predicado) {
		for (String n : textos) {
			if (predicado.test(n)) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
	}
}