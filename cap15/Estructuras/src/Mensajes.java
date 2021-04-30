import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Mensajes {
	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("estructuras", Locale.UK);
		// ResourceBundle bundle = ResourceBundle.getBundle("estructuras");
		String mensaje = bundle.getString("mensaje");
		String objeto = bundle.getString("objeto");
		String color = bundle.getString("color");
		
		System.out.println(MessageFormat.format(mensaje, objeto, color));
	}
}
