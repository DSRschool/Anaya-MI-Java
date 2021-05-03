package cap18.otrareunionmas.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import cap18.otrareunionmas.dominio.Reunion;
import cap18.otrareunionmas.dominio.Sala;

public class ReunionDao extends AbstractDao<Reunion> {

	public ReunionDao() {
		setClazz(Reunion.class);
	}

	public List<Reunion> getBySalaAndFecha(Sala sala, LocalDate fecha) {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Reunion> criteriaQuery = cb.createQuery(Reunion.class);
		Root<Reunion> root = criteriaQuery.from(Reunion.class);

		Predicate predSala = cb.equal(root.get("sala"), sala);
		Predicate predFecha = cb.between(root.get("fecha"), fecha.atStartOfDay(), fecha.plusDays(1).atStartOfDay());

		criteriaQuery.select(root).where(cb.and(predSala, predFecha));
		criteriaQuery.orderBy(cb.asc(root.get("fecha")));
		Query query = getEntityManager().createQuery(criteriaQuery);
		return query.getResultList();
	}
}
