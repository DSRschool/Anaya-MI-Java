public class TestExcepcional {

    public static final String TECH_SIN_ARGUMENTOS = "Se esperaba al menos un argumento";

    public static void main(String[] args) {
        try {
            int res = trataNumero(args);
            System.out.println("El resultado es " + res);
        } catch (BusinessException be) {
            System.out.println("===== ERROR FUNCIONAL =====");
            System.out.println ("Se ha producido un error funcional: " + be);

            switch (be.getErrorCode()) {
                case EVEN:
                    System.out.println("Prefiero números impares (1, 3, 5, ...)");
                    break;
                case NEGATIVE:
                    System.out.println("Quiero números positivos");
                    break;
            }
        }
    }

    private static int trataNumero(String[] args) throws BusinessException {
        if (args.length == 0) {
            throw new TechnicalException(TECH_SIN_ARGUMENTOS);
        }
        int num = Integer.parseInt(args[0]);
        noQuieroPares(num);
        noQuieroNegativos(num);
        return num * num;
    }

    private static  void noQuieroPares(int n) throws BusinessException {
        if (n % 2 == 0) {
            throw new BusinessException(BusinessException.ErrorCode.EVEN, "Valor " + n);
        }
    }

    private static void noQuieroNegativos(int n) throws BusinessException {
        if (n < 0) {
            throw new BusinessException(BusinessException.ErrorCode.NEGATIVE, "Valor " + n);
        }
    }
}
