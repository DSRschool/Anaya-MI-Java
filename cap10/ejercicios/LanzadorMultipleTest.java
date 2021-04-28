import org.junit.Test;
import org.junit.Assert;

public class LanzadorMultipleTest {
    @Test
    public void testLanzadorIndexOutOfBounds() {
        try {
            LanzadorMultiple.queMeSalgo();
            Assert.fail("¡Vuelve a intentarlo! ¡Quiero que provoques una IndexOutOfBoundsException! Pista... Necesitas un array para poderte salir él.");
        } catch (IndexOutOfBoundsException npw) {
          // Bien  
        } catch (Throwable t) {
            Assert.fail("¡Casi! Pero quiero que provoques una IndexOutOfBoundsException, ¡no una "
            + t.getClass().getSimpleName() + "! Pista... Necesitas un array para poderte salir él.");
        }
    }
    
    @Test
    public void testLanzadorClassCast() {
        try {
            LanzadorMultiple.malditaCasta();
            Assert.fail("¡Vuelve a intentarlo! Quiero que provoques una ClassCastException! Pista... Intenta convertir un objeto de un tipo en algo que no es.");
        } catch (ClassCastException npw) {
          // Bien  
        } catch (Throwable t) {
            Assert.fail("¡Casi! Pero quiero que provoques una ClassCastException, ¡no una "
            + t.getClass().getSimpleName() + "! Pista... Intenta convertir un objeto de un tipo en algo que no es.");
        }
    }
    
    @Test
    public void testLanzadorNegativeArray() {
        try {
            LanzadorMultiple.siemprePositivoNuncaNegativo();
            Assert.fail("¡Vuelve a intentarlo! ¡Quiero que provoques una NegativeArraySizeException! Pista... En este caso también necesitas un array. El API de Java puede ayudarte a saber qué perrería hacerle para lograr esta excepción ;)");
        } catch (NegativeArraySizeException npw) {
          // Bien  
        } catch (Throwable t) {
            Assert.fail("¡Casi! Pero quiero que provoques una NegativeArraySizeException, no una "
            + t.getClass().getSimpleName() + "! Pista... En este caso también necesitas un array. El API de Java puede ayudarte a saber qué perrería hacerle para lograr esta excepción ;)");
        }
    }
}