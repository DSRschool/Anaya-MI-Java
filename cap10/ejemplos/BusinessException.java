public class BusinessException extends Exception {

    private ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode, String detailMessage) {
        this(errorCode, detailMessage, null);
    }

    public BusinessException(ErrorCode errorCode, String detailMessage, Throwable cause) {
        super(generateMessage(errorCode, detailMessage), cause);
        this.errorCode = errorCode;
    }

    private static String generateMessage(ErrorCode errorCode, String detailMessage) {
        return errorCode + detailMessage;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    enum ErrorCode {
        NEGATIVE("El número recibido es negativo"),
        EVEN("El número recibido es par");

        private String message;

        ErrorCode(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return "ERROR: " + message + ". Detalle: ";
        }
    }
}
