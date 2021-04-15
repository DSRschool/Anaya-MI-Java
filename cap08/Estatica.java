public class Estatica {
	private static final int CONSTANTE = 0;
	private static int compartida = 0;
	private final int noModificable;
	private int normal;

	public Estatica(int n) {
		noModificable = n;
	}

	private void incrementaTodo() {
		// CONSTANTE ++;
		compartida++;
		// noModificable ++;
		normal++;
	}

	private void pintaTodo(String titulo) {
		System.out.println(titulo);
		System.out.println("Constante: \t" + CONSTANTE);
		System.out.println("Compartida: \t" + compartida);
		System.out.println("No modificable: \t" + noModificable);
		System.out.println("Normal: \t" + normal);
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Constante: \t" + CONSTANTE);
		System.out.println("Compartida: \t" + compartida);
		// System.out.println("No modificable: \t" + noModificable);
		// System.out.println("Normal: \t" + normal);
		System.out.println();
		Estatica seis = new Estatica(6);
		Estatica ocho = new Estatica(8);
		Estatica diez = new Estatica(10);
		seis.pintaTodo("SEIS A: ");
		seis.incrementaTodo();
		seis.pintaTodo("SEIS B: ");
		ocho.incrementaTodo();
		seis.pintaTodo("SEIS C: ");
		diez.incrementaTodo();
		diez.incrementaTodo();
		seis.pintaTodo("SEIS D: ");
		ocho.pintaTodo("OCHO: ");
		diez.pintaTodo("DIEZ: ");
	}
}