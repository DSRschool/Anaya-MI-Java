package cap16.orm.gestor.dao;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import cap16.orm.gestor.Pedido;

public class PedidoDao extends AbstractDao<Pedido> {

	public PedidoDao() {
		setClazz(Pedido.class);
	}

	public Pedido pedidoMasReciente() {
		String qlString = "FROM " + Pedido.class.getName() + " WHERE fecha < now() order by fecha desc";
		Query query = getEntityManager().createQuery(qlString).setMaxResults(1);
		return (Pedido) query.getSingleResult();
	}

	public Pedido pedidoMasRecienteCriteria() {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Pedido> criteriaQuery = cb.createQuery(Pedido.class);
		Root<Pedido> root = criteriaQuery.from(Pedido.class);
		criteriaQuery.select(root).where(cb.lessThan(root.get("fecha"), LocalDateTime.now()));
		criteriaQuery.orderBy(cb.desc(root.get("fecha")));
		Query query = getEntityManager().createQuery(criteriaQuery).setMaxResults(1);
		return (Pedido) query.getSingleResult();
	}

	public List<Pedido> pedidosSemanaPasada() {
		String qlString = "FROM " + Pedido.class.getName() + " WHERE fecha between ?1 and ?2";
		Query query = getEntityManager().createQuery(qlString);
		LocalDate esteLunes = getEsteLunes();
		LocalDate lunesAnterior = esteLunes.minusWeeks(1);
		query.setParameter(1, lunesAnterior.atStartOfDay());
		query.setParameter(2, esteLunes.atStartOfDay());
		return query.getResultList();
	}

	private static LocalDate getEsteLunes() {
		LocalDate now = LocalDate.now();
		DayOfWeek diaSemana = now.getDayOfWeek();
		return now.minusDays(diaSemana.getValue() - 1);
	}
}
