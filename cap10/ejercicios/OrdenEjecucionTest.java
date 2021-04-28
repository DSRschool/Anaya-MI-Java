import org.junit.Test;
import org.junit.Assert;

public class OrdenEjecucionTest {
    private static final String CASO_0 = "ABCGHI";
    private static final String CASO_1 = "ABDGHI";
    private static final String CASO_2 = "ABEGH";
    private static final String CASO_3 = "ABCG";
    private static final String CASO_4 = "ABDG";
    
    @Test
    public void testCaso0() {
        try {
            OrdenEjecucion.ordename(0);
        } catch (Exception e) {
            Assert.fail("En el caso 0 no deberían saltar excepciones.");
        }
        Assert.assertEquals("Caso 0 ko", CASO_0, OrdenEjecucion.res);
    }

    @Test
    public void testCaso1() {
        try {
            OrdenEjecucion.ordename(1);
        } catch (Exception e) {
            Assert.fail("En el caso 1 no deberían saltar excepciones.");
        }
        Assert.assertEquals("Caso 1 ko", CASO_1, OrdenEjecucion.res);
    }
    
    @Test
    public void testCaso2() {
        try {
            OrdenEjecucion.ordename(2);
        } catch (Exception e) {
        }
        Assert.assertEquals("Caso 2 ko", CASO_2, OrdenEjecucion.res);
    }
    
    @Test
    public void testCaso3() {
        try {
            OrdenEjecucion.ordename(3);
        } catch (Exception e) {
        }
        Assert.assertEquals("Caso 3 ko", CASO_3, OrdenEjecucion.res);
    }
    
    @Test
    public void testCaso4() {
        try {
            OrdenEjecucion.ordename(4);
        } catch (Exception e) {
        }
        Assert.assertEquals("Caso 4 ko", CASO_4, OrdenEjecucion.res);
    }
}
