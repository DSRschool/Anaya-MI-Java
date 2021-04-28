package cap12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		int res = Calculadora.suma(2, 3);
		assertEquals(5, res);
	}

	@Test
	void testResta() {
		int res = Calculadora.resta(0, 0);
		assertEquals(0, res);
	}
}
