package cap18.otrareunionmas;

import java.text.MessageFormat;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

import cap18.otrareunionmas.dao.ReunionDao;
import cap18.otrareunionmas.dominio.Acta;
import cap18.otrareunionmas.dominio.Persona;
import cap18.otrareunionmas.dominio.Reunion;

public class InformeReunion {
	private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("'el' EEEE, dd 'de' MMMM 'de' yyyy 'a las' HH:mm");
	private static final String ID_FORMAT = ",number,#";
	
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Indica el id de la reunión: ");
			int reunionId = s.nextInt();
			ReunionDao reunionDao = new ReunionDao();
			Optional<Reunion> optional = reunionDao.get(reunionId);
			if (optional.isPresent()) {
				Reunion r = optional.get();
				imprimirReunion(r);
			} else {
				System.err.println(MessageFormat.format("La reunión con id {0" + ID_FORMAT + "} no existe", reunionId));
			}
		}		
	}

	private static void imprimirReunion(Reunion r) {
		System.out.println(MessageFormat.format("Informe de la reunión con asunto \"{0}\" (id {1" + ID_FORMAT + "})", r.getAsunto(), r.getId()));
		System.out.println(MessageFormat.format("\tcelebrada el {0}\n\ten la sala {1} (id {2})", 
				r.getFecha().format(FORMATO_FECHA), r.getSala().getDescripcion(), r.getSala().getId()));
		imprimirParticipantes(r);
		imprimirActa(r);
	}

	private static void imprimirParticipantes(Reunion r) {
		System.out.println("Participantes:");
		Set<Persona> participantes = r.getParticipantes();
		if (participantes.isEmpty()) {
			System.err.println("No hay participantes");
		}
		for (Persona persona : participantes) {
			System.out.println(MessageFormat.format("\t{2}\t{1}, {0}", 
					persona.getNombre(), persona.getApellidos().toUpperCase(), persona.getNumeroEmpleado()));
		}
	}

	private static void imprimirActa(Reunion r) {
		Acta a = r.getActa();
		System.out.println("Acta:");
		if (a == null) {
			System.err.println("No hay acta");
		} else {
			System.out.println("\t" + a.getContenido());
		}
	}
}
