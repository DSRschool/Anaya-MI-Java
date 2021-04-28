import org.junit.Test;
import org.junit.Assert;
import java.io.UnsupportedEncodingException;

public class TodoControladoTest {

	@Test
	public void testExercise() {
		try {
			int num = TodoControlado.cuentaBytes();
			Assert.fail("No está mal, parece que has logrado que tu código compile. Pero no queríamos ocultar los problemas, así que mejor, en vez de tratar la excepción, simplemente declárala y déjala pasar. ");
		} catch (UnsupportedEncodingException e) {
			// Bien
		}
	}
}
