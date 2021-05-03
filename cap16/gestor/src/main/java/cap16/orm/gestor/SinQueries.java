package cap16.orm.gestor;

import cap16.orm.gestor.dao.PedidoDao;

public class SinQueries {
	public static void main(String[] args) {
		PedidoDao pedidoDao = new PedidoDao();
		Pedido pedido = pedidoDao.pedidoMasRecienteCriteria();
		System.out.println("*** Factura: " + pedido.getFactura());
		System.out.println("*** Albaranes: " + pedido.getAlbaranes());
		System.out.println("*** Productos: " + pedido.getProductos());
	}
}
