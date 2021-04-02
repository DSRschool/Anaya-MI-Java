public class Ejercicio04_01 {
 	private static final int LIM = 5;

	public static void main(String[] args) {
		for (String s : args) {
			if (s.length() < LIM) {
				System.out.println(s.toUpperCase());
			} else {
				System.out.println(s.toLowerCase());
			}
		}
	}
}