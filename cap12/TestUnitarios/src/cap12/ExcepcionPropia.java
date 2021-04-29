package cap12;

public class ExcepcionPropia extends Exception {

	public ExcepcionPropia() {
		super();
	}

	public ExcepcionPropia(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ExcepcionPropia(String message, Throwable cause) {
		super(message, cause);
	}

	public ExcepcionPropia(String message) {
		super(message);
	}

	public ExcepcionPropia(Throwable cause) {
		super(cause);
	}

}
