public class TestExcepcional {

    public static final String TECH_SIN_ARGUMENTOS = "Se esperaba al menos un argumento";

    public static void main(String[] args) throws BusinessException {
        int res = trataNumero(args);
        System.out.println("El resultado es " + res);
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
