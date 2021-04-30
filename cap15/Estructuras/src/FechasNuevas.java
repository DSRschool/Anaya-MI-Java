import java.time.*;

public class FechasNuevas {
	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println("Instant:       " + instant);
		LocalDate localDate = LocalDate.now().plusMonths(1);
		System.out.println("LocalDate +1m: " + localDate);
		LocalTime localTime = LocalTime.now();
		System.out.println("LocalTime:     " + localTime);
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime: " + localDateTime);
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("ZonedDateTime: " + zonedDateTime);
		Duration duration = Duration.ofDays(1);
		System.out.println("Duration:      " + duration);
		LocalDate inicio = LocalDate.of(2019, Month.JULY, 23);
		LocalDate fin = LocalDate.of(2023, Month.APRIL, 18);
		Period period = Period.between(inicio, fin);
		System.out.println("Period:        " + period);
	}
}
