public class TestExcepcional {

    public static final String TECH_SIN_ARGUMENTOS = "Se esperaba al menos un argumento";

    public static void main(String[] args) {
        int res = trataNumero(args);
        System.out.println("El resultado es " + res);
    }

    private static int trataNumero(String[] args) {
        if (args.length == 0) {
            throw new TechnicalException(TECH_SIN_ARGUMENTOS);
        }
        int num = Integer.parseInt(args[0]);
        return num * num;
    }
}
