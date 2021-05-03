package cap16.orm.gestor.dao;

import cap16.orm.gestor.Factura;

public class FacturaDao extends AbstractDao<Factura> {
	public FacturaDao() {
		setClazz(Factura.class);
	}
}
