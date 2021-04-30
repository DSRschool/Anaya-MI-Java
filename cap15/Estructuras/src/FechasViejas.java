import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class FechasViejas {
	public static void main(String[] args) {
		long ahora = System.currentTimeMillis();
		System.out.println("Ahora:    " + ahora);
		Date fecha = new Date();
		System.out.println("Fecha:    " + fecha);
		Calendar cal = GregorianCalendar.getInstance();
		cal.set(2020, 0, 1, 2, 3, 4); // los meses también empiezan en cero
		Date fechaCal = cal.getTime();
		System.out.println("Calendar: " + fechaCal);
		DateFormat df = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss Z", Locale.GERMAN);
		System.out.println("Formateo: " + df.format(fechaCal));
	}
}
