public class TodoControlado {

	public static int cuentaBytes() {
		String s = "Me ilusiona tener las excepciones controladas";
		byte[] misBytes = s.getBytes("encodingQueNoExiste");
		return misBytes.length;
	}
}