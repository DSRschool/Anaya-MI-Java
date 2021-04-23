public class NoQuiero {

    public final static void main(String[] args) throws Exception {
        noQuieroParesNiNegativos(Integer.parseInt(args[0]));
    }

    private static void noQuieroParesNiNegativos(int a)
            throws ParException, NegativoException {
        if (esPar(a)) {
            throw new ParException(a + " es par!");
        }
        if (a < 0) {
            throw new NegativoException(a + " es negativo :(");
        }
    }

    private static boolean esPar(int num) {
        return num % 2 == 0;
    }
}

class ParException extends Exception {

    public ParException(String message) {
        super(message);
    }
}

class NegativoException extends Exception {

    public NegativoException(String message) {
        super(message);
    }
}
