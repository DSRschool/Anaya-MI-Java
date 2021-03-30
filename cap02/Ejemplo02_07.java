public class Ejemplo02_07 {
	public static void main(String[] args) {
		System.out.println("1) AND: " + (siempreCierto() && siempreFalso()));
		System.out.println("2) AND: " + (siempreFalso() && siempreCierto()));
		System.out.println("3) OR: " + (siempreCierto() || siempreFalso()));
		System.out.println("4) OR: " + (siempreFalso() || siempreCierto()));
	}

	private static boolean siempreCierto() {
		System.out.println("siempreCierto");
		return true;
	}

	private static boolean siempreFalso() {
		System.out.println("siempreFalso");
		return false;
	}
}