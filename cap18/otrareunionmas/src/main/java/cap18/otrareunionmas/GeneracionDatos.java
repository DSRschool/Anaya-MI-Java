package cap18.otrareunionmas;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import cap18.otrareunionmas.dao.ActaDao;
import cap18.otrareunionmas.dao.ReunionDao;
import cap18.otrareunionmas.dao.SalaDao;
import cap18.otrareunionmas.dominio.Acta;
import cap18.otrareunionmas.dominio.Persona;
import cap18.otrareunionmas.dominio.Reunion;
import cap18.otrareunionmas.dominio.Sala;

public class GeneracionDatos 
{
    private static final int HORA_INI = 10;

	public static void main( String[] args )
    {
        System.out.println( "Otra reunión más - Generación de datos" );
		// DAOs
		ReunionDao reunionDao = new ReunionDao();
		ActaDao actaDao = new ActaDao();
		SalaDao salaDao = new SalaDao();

		// Creación de objetos
		Sala s099 = new Sala("S099", "Trastero", 1);
		Sala s101 = new Sala("S101", "Reunión primera planta", 10);
		Sala s109 = new Sala("S109", "Entrevistas primera planta", 3);
		Sala s203 = new Sala("S203", "Sala grande", 25);

		salaDao.save(s099);
		salaDao.save(s101);
		salaDao.save(s109);
		salaDao.save(s203);

		Persona marta = new Persona("E001", "Marta", "García López");
		Persona pedro = new Persona("E002", "Pedro", "Gómez Fernández");
		Persona santi = new Persona("E003", "Santi", "Pérez Pérez");
		Persona luisa = new Persona("E004", "Luisa", "Gutiérrez González");

		Reunion r0 = new Reunion(LocalDateTime.now(), "Reunión de Test");
		Reunion r1 = new Reunion(LocalDateTime.now().plus(2, ChronoUnit.HOURS), "Otra Reunión de Test");
		Reunion r2 = new Reunion(LocalDateTime.now().plus(2, ChronoUnit.DAYS), "Reunión de pasado mañana");
		Reunion r3 = new Reunion(LocalDateTime.now().plus(1, ChronoUnit.DAYS), "Reunión de mañana");
		Reunion r4 = new Reunion(LocalDateTime.now().minus(1, ChronoUnit.DAYS), "Reunión de ayer");
		
		// reuniones de hoy en sala 101
		LocalDateTime hoy = LocalDateTime.now().withHour(10);
		for (int i = 0; i < 5; i ++) {
			Reunion r = new Reunion(hoy.plusHours(i), "Reunión de las " + (HORA_INI + i));
			r.setSala(s101);
			reunionDao.save(r);
		}

		r0.addParticipante(marta);
		r0.setSala(s099);
		reunionDao.save(r0);
		Acta a0 = new Acta("Marta se reúne sola, solo para descansar un rato", r0);
		actaDao.save(a0);
		reunionDao.update(r0);

		r1.addParticipante(marta);
		r1.addParticipante(pedro);
		r1.addParticipante(santi);
		r1.addParticipante(luisa);
		r1.setSala(s101);
		reunionDao.save(r1);

		r2.addParticipante(pedro);
		r2.addParticipante(santi);
		r2.setSala(s109);
		reunionDao.save(r2);

		r3.addParticipante(marta);
		r3.addParticipante(luisa);
		r3.setSala(s109);
		reunionDao.save(r3);

		r4.addParticipante(marta);
		r4.addParticipante(pedro);
		r4.addParticipante(santi);
		r4.addParticipante(luisa);
		r4.setSala(s203);
		reunionDao.save(r4);

		Acta a4 = new Acta("Preparación del lanzamiento de la aplicación \"Otra Reunión Más\".", r4);
		actaDao.save(a4);
		reunionDao.update(r4);
    }
}
