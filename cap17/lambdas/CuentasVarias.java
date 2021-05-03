package lambdas;

import java.util.Arrays;

public class CuentasVarias {
	public static void main(String... args) {
		System.out.print("Parámetros recibidos: ");
		Arrays.stream(args).forEach(arg -> System.out.print(arg + " "));
		System.out.println();
		
		long contador = Arrays.stream(args)
			.mapToInt(e -> Integer.valueOf(e))
			.filter(n -> n % 2 == 0).count();
		System.out.println("Hay " + contador + " parámetros pares");
		
		int suma = Arrays.stream(args).mapToInt(Integer::valueOf).sum();
		System.out.println("Suma: " + suma);
		
		int sumaCuadrados = Arrays.stream(args).mapToInt(Integer::valueOf).map(n -> n * n).sum();
		System.out.println("Suma de los cuadrados: " + sumaCuadrados);
		
		int sumaCuadradosPares = Arrays.stream(args).mapToInt(Integer::valueOf)
			.filter(n -> n % 2 == 0).map(n -> n * n).sum();
		System.out.println("Suma de los cuadrados pares: " + sumaCuadradosPares);
	}
}
