import java.io.UnsupportedEncodingException; // No olvides importar la clase de la excepción!

public class TodoControlado {

	// Como getBytes puede lanzar una UnsupportedEncodingException
	// necesito declararlo con "throws"
	public static int cuentaBytes() throws UnsupportedEncodingException {
		String s = "Me ilusiona tener las excepciones controladas";
		byte[] misBytes = s.getBytes("encodingQueNoExiste");
		return misBytes.length;
	}
}