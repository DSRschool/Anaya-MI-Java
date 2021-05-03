package lambdas;

import java.util.Arrays;

public class FiltrandoTextosStreams {

	public static void main(String[] args) {
		System.out.print("Cadenas largas: ");
		Arrays.stream(args).filter(s -> s.length() > 5).forEach(arg -> System.out.print(arg + " "));
		System.out.println();

		System.out.print("Letras: ");
		Arrays.stream(args).filter(s -> s.length() == 1).forEach(arg -> System.out.print(arg + " "));
		System.out.println();

		System.out.print("Sin a: ");
		Arrays.stream(args).filter(s -> s.indexOf('a') == -1).forEach(arg -> System.out.print(arg + " "));
		System.out.println();
	}
}