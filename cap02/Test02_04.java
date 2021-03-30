public class Test02_04 {
    public static void main(String[] args) {
		int a = 3;
		int b = 8;
		System.out.print("1)");
		test(b, a);
		System.out.print("2)");
		test(a, a);
	}

	private static void test(int a, int b) {
        System.out.println("A=" + a + " B=" + b);
	}
}