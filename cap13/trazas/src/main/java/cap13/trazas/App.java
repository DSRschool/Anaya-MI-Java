package cap13.trazas;

import java.text.MessageFormat;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	private static Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		logger.fatal(MessageFormat.format("Nivel actual del log: {0}", logger.getLevel()));
		
		logger.trace("hola trace");
		logger.debug("hola debug");
		logger.info("hola info");
		logger.warn("hola warn");
		logger.error("hola error");
		logger.fatal("hola fatal");
		
		logger.log(Level.INFO, "otra forma de hacerlo");
		if (logger.isInfoEnabled()) {
			logger.info(calculoPesado(1));
		}
		logger.info(calculoPesado(2));
	}

	public static String calculoPesado(int n) {
		String mensaje = "*** Aquí hacemos algo muy muy pesado " + n;
		System.out.println(mensaje);
		return mensaje;
	}
}
