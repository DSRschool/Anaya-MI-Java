import org.junit.Test;
import org.junit.Assert;

public class LanzadorNullPointerTest {
	@Test
	public void testLanzadorNullPointer() {
		try {
			LanzadorNullPointer.lloron();
			Assert.fail("¡Esto no llora! Quiero que provoques una NullPointerException!");
		} catch (NullPointerException npw) {
			// Bien  
		} catch (Throwable t) {
			Assert.fail("¡No seas tan llorica! Quiero que provoques una NullPointerException, ¡no una "
			+ t.getClass().getSimpleName() + "!");
		}
	}
}
