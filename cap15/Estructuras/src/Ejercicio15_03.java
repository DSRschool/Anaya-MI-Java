import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Ejercicio15_03 {
	public static void main(String[] args) {
		LocalDate miNacimiento = LocalDate.of(1980, Month.JULY, 1);
		LocalDate now = LocalDate.now();
		Period edad = Period.between(miNacimiento, now);
		System.out.println("Tengo " + edad.getYears() + " años, " + edad.getMonths() 
			+ " meses y " + edad.getDays() + " días.");
	}
}
