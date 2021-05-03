package cap18.otrareunionmas;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import cap18.otrareunionmas.dao.ReunionDao;
import cap18.otrareunionmas.dao.SalaDao;
import cap18.otrareunionmas.dominio.Reunion;
import cap18.otrareunionmas.dominio.Sala;

public class CartelSala {

	private static final DateTimeFormatter FORMATO_HORA = DateTimeFormatter.ofPattern("HH:mm");

	public static void main(String[] args) {
		if (args.length == 0) { 
			System.err.println("Faltan parámetros. Indica id de sala, y opcionalmente la fecha deseada (AAAA-MM-DD).");
			return;
		}
		String salaId = args[0];
		LocalDate fecha;
		if (args.length >= 2) {
			fecha = LocalDate.parse(args[1]);
		} else {
			fecha = LocalDate.now();
		}
		
		SalaDao salaDao = new SalaDao();
		Optional<Sala> optional = salaDao.get(salaId);
		if (optional.isPresent()) {
			Sala sala = optional.get();
			ReunionDao reunionDao = new ReunionDao();
			List<Reunion> reuniones = reunionDao.getBySalaAndFecha(sala, fecha);
			imprimirCabecera(sala, fecha);
			imprimirReuniones(reuniones);
		} else {
			System.err.println(MessageFormat.format("La sala con id {0} no existe", salaId));
		}
	}

	private static void imprimirCabecera(Sala sala, LocalDate fecha) {
		System.out.println(MessageFormat.format("* SALA: {0} ({1})", sala.getDescripcion(), sala.getId()));
		System.out.println(MessageFormat.format("* FECHA: {0}", fecha));
	}

	private static void imprimirReuniones(List<Reunion> reuniones) {
		System.out.println("Reuniones previstas:");
		for (Reunion reunion : reuniones) {
			System.out.println(MessageFormat.format("{0}:\t{1}", reunion.getFecha().format(FORMATO_HORA), reunion.getAsunto()));
		}
	}

}
