package cap16.orm.gestor.dao;

import javax.persistence.Query;

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
}
