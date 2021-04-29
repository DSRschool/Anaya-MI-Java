package cap12.mockeando;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SuperCalculadoraTest {

	@Mock
	SuperCalculadora sc;

	@Test
	final void test() {
		sc = new SuperCalculadoraImpl();
		Mockito.when(sc.raiz(4)).thenReturn(2.0);

		double res = sc.raiz(4);
		assertEquals(2.0, res);
	}
}
