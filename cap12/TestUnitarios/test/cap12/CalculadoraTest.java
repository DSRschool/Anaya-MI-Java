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

	@Test
	void testMultiplica() {
		int res = Calculadora.multiplica(2, 3);
		assertEquals(6, res);
	}

	@Test
	void testDivide() {
		int res = Calculadora.divide(8, 2);
		assertEquals(4, res);
	}
}
