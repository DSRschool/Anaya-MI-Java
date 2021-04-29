package cap14.recordsManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class RecordsManagerTest {

	private static final String ALEX = "Alex";
	private static final String ALEJANDRO = "Alejandro";

	@Test
	void validateNameLargoTest() {
		try {
			RecordsManager.validateName(ALEJANDRO);
			assertTrue(true);
		} catch (PlayerNameTooShortException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	void validateNameCortoTest() {
		try {
			RecordsManager.validateName(ALEX);
			fail("Debería haber fallado, " + ALEX + " es corto");
		} catch (PlayerNameTooShortException e) {
			assertTrue(true);
			assertTrue(e.getMessage().contains(ALEX));
		}
	}
	
	@Test
	void validateNameCasiTest() {
		String nombre = "Alejo";
		try {
			RecordsManager.validateName(nombre);
			fail("Debería haber fallado, " + nombre + " es corto");
		} catch (PlayerNameTooShortException e) {
			assertTrue(true);
			assertTrue(e.getMessage().contains(nombre));
		}
	}
	
	@Test
	void validateNameExactoTest() {
		String nombre = "Alejor";
		try {
			RecordsManager.validateName(nombre);
			assertTrue(true);
		} catch (PlayerNameTooShortException e) {
			fail(e.getMessage());
		}
	}

	@Test
	void validateScore1000Test() {
		try {
			RecordsManager.validateScore(ALEJANDRO, 1000);
			assertTrue(true);
		} catch (ScoreTooLowException e) {
			fail(e.getMessage());
		}
	}

	@Test
	void validateScore999Test() {
		try {
			RecordsManager.validateScore(ALEJANDRO, 999);
			fail("Debería haber fallado, 999 son pocos puntos");
		} catch (ScoreTooLowException e) {
			assertTrue(e.getMessage().contains(ALEJANDRO));
			assertTrue(e.getMessage().contains("999"));
		}
	}

	@Test
	void generateNewNameLargoTest() {
		String nuevoNombre = RecordsManager.generateNewName(ALEJANDRO);
		assertEquals(ALEJANDRO, nuevoNombre);
	}

	@Test
	void generateNewNameCortoTest() {
		String nuevoNombre = RecordsManager.generateNewName(ALEX);
		assertNotEquals(ALEX, nuevoNombre);
		assertTrue(nuevoNombre.contains(ALEX));
		assertTrue(nuevoNombre.startsWith(ALEX));
		String numero = nuevoNombre.substring(ALEX.length());
		assertTrue(Integer.valueOf(numero) > 0);
		assertEquals(6, nuevoNombre.length());
	}

	@Test
	void generateNewNameVacioTest() {
		String nuevoNombre = RecordsManager.generateNewName("");
		assertNotEquals("", nuevoNombre);
		assertTrue(Integer.valueOf(nuevoNombre) > 0);
		assertEquals(6, nuevoNombre.length());
	}
}
