public class Ejercicio03_05 {
	private static final String CANTA = "CANTA";
	private static final String LADRA = "LADRA";

	public static void main(String[] args) {
		if (args != null) { // [1]
			boolean hayArgumentos;
			if (args.length > 0) { // [2]
				hayArgumentos = true;
			} else {
				hayArgumentos = false;
			}
			if (!hayArgumentos) { // [3]
				System.err.println("No tengo argumentos");
				return;
			}
			if (hayArgumentos) { // [4]
				int numArgumentos = args.length;

				String primerArgumento = args[0];
				if (primerArgumento.equals(CANTA)) { // [5]
					System.out.println(
						"Un, dos, tres, un pasito palante María!");
				} else if (LADRA.equals(primerArgumento)) { // [6]
					boolean faltaNombre;
					String nombrePerro = "";
					if (numArgumentos > 1) { // [7]
						faltaNombre = false;
						nombrePerro = args[1];
						System.out.println("Bub bub bub");
					} else {
						faltaNombre = true;
						System.out.println("Grr grr grr");
					}
					if (faltaNombre) { // [8]
						System.out.println("No sé como te llamas");
					} else {
						System.out.println("Hola " + nombrePerro);
					}
				} else {
					System.err.println("No sé que quieres que haga");
				}
			}
		} else {
			System.err.println("Necesito argumentos");
		}
	}
}