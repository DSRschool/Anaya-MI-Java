package cap12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma1() {
		int res = Calculadora.suma(2, 3);
		assertEquals(5, res);
	}

	@Test
	void testSuma2() {
		int algo = 8;
		int res = Calculadora.suma(0, algo);
		assertEquals(algo, res);
	}

	@Test
	void testSuma3() {
		int algo = 7;
		int res = Calculadora.suma(algo, 0);
		assertEquals(algo, res);
	}

	@Test
	void testSuma4() {
		int res = Calculadora.suma(0, 0);
		assertEquals(0, res);
	}

	@Test
	void testSuma5() {
		int algo = 3;
		int res = Calculadora.suma(algo, -algo);
		assertEquals(0, res);
	}

	@Test
	void testSuma6() {
		int algo = 5;
		int res = Calculadora.suma(-algo, algo);
		assertEquals(0, res);
	}

	@Test
	void testSuma7() {
		int a = 2;
		int b = 3;
		assertEquals(Calculadora.suma(a, b), Calculadora.suma(b, a));
	}

	@Test
	void testResta1() {
		int res = Calculadora.resta(8, 3);
		assertEquals(5, res);
	}

	@Test
	void testResta2() {
		int algo = 3;
		int res = Calculadora.resta(0, algo);
		assertEquals(-algo, res);
	}

	@Test
	void testResta3() {
		int algo = 8;
		int res = Calculadora.resta(algo, 0);
		assertEquals(algo, res);
	}

	@Test
	void testResta4() {
		int res = Calculadora.resta(0, 0);
		assertEquals(0, res);
	}

	@Test
	void testResta5() {
		int algo = 7;
		int res = Calculadora.resta(algo, algo);
		assertEquals(0, res);
	}

	@Test
	void testResta6() {
		int algo = 7;
		int res = Calculadora.resta(algo, -algo);
		assertEquals(2 * algo, res);
	}

	@Test
	void testResta7() {
		int a = 3;
		int b = 2;
		assertNotEquals(Calculadora.resta(a, b), Calculadora.resta(b, a));
	}

	@Test
	void testMultiplica1() {
		int res = Calculadora.multiplica(2, 3);
		assertEquals(6, res);
	}

	@Test
	void testMultiplica2() {
		int algo = 9;
		int res = Calculadora.multiplica(algo, 1);
		assertEquals(algo, res);
	}

	@Test
	void testMultiplica3() {
		int algo = 9;
		int res = Calculadora.multiplica(1, algo);
		assertEquals(algo, res);
	}

	@Test
	void testMultiplica4() {
		int res = Calculadora.multiplica(1, 1);
		assertEquals(1, res);
	}

	@Test
	void testMultiplica5() {
		int algo = 4;
		int res = Calculadora.multiplica(algo, 0);
		assertEquals(0, res);
	}

	@Test
	void testMultiplica6() {
		int algo = 4;
		int res = Calculadora.multiplica(0, algo);
		assertEquals(0, res);
	}

	@Test
	void testMultiplica7() {
		int res = Calculadora.multiplica(0, 0);
		assertEquals(0, res);
	}

	@Test
	void testMultiplica8() {
		assertTrue(Calculadora.multiplica(1, 1) > 0);
		assertTrue(Calculadora.multiplica(-1, -1) > 0);
		assertTrue(Calculadora.multiplica(1, -1) < 0);
		assertTrue(Calculadora.multiplica(-1, 1) < 0);
	}

	@Test
	void testDivide1() {
		int res = Calculadora.divide(8, 2);
		assertEquals(4, res);
	}

	@Test
	void testDivide2() {
		int algo = 7;
		int res = Calculadora.divide(algo, 1);
		assertEquals(algo, res);
	}

	@Test
	void testDivide3() {
		int a = 3;
		int b = 5;
		int res = Calculadora.divide(Calculadora.multiplica(a, b), b);
		assertEquals(a, res);
	}

	@Test
	void testDivide4() {
		int a = 3;
		int b = 5;
		int res = Calculadora.divide(Calculadora.multiplica(a, b) + 1, b);
		assertEquals(a, res);
	}

	@Test
	void testDivide5() {
		int algo = 7;
		int res = Calculadora.divide(1, algo);
		assertEquals(0, res);
	}

	@Test
	void testDivide6() {
		int res = Calculadora.divide(1, 1);
		assertEquals(1, res);
	}

	@Test
	void testDivide7() {
		int algo = 7;
		assertThrows(ArithmeticException.class, () -> {
			Calculadora.divide(algo, 0);
		});
	}

	@Test
	void testDivide7A() {
		int algo = 7;
		try {
			int res = Calculadora.divide(algo, 0);
			fail("Aquí no debería llegar");
		} catch (ArithmeticException ae) {
			assertTrue(true);
		} catch (Throwable t) {
			fail("No debería lanzar ningún throwable");
		}
	}
	
	@Test
	void testDivide7B() {
		int algo = 7;
		assertThrows(IllegalArgumentException.class, () -> {
			Calculadora.divideB(algo, 0);
		});
		try {
			int res = Calculadora.divideB(algo, 0);
			fail("Aquí no debería llegar");
		} catch (IllegalArgumentException ae) {
			assertTrue(true);
		} catch (Throwable t) {
			fail("No debería lanzar ningún throwable");
		}
	}

	@Test
	void testDivide7C() {
		int algo = 7;
		assertThrows(ExcepcionPropia.class, () -> {
			Calculadora.divideC(algo, 0);
		});
		try {
			int res = Calculadora.divideC(algo, 0);
			fail("Aquí no debería llegar");
		} catch (ExcepcionPropia ep) {
			assertTrue(true);
			assertEquals("No podemos dividir entre cero.", ep.getMessage());
		} catch (Throwable t) {
			fail("No debería lanzar ningún throwable");
		}
	}
}
