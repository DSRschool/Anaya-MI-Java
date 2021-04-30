import java.text.NumberFormat;
import java.util.Locale;

public class Monedas {
	public static void main(String[] args) {
		double precio = 1234.56;
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("Precio en Francia: " + nf.format(precio));
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Precio en EE. UU.: " + nf2.format(precio));	
	}
}
