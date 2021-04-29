package cap12.mockeando;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SuperCalculadoraTest {

	@Mock
	SuperCalculadora sc;

	@Test
	final void test() {
		SuperCalculadora sc = new SuperCalculadoraImpl();

		double res = sc.raiz(4);
		assertEquals(2.0, res);
	}
}
