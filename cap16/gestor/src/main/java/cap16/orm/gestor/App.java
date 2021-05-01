package cap16.orm.gestor;

import java.util.Date;

import cap16.orm.gestor.dao.PedidoDao;

public class App {
	public static void main(String[] args) {
		PedidoDao pedidoDao = new PedidoDao();

		List<Pedido> pedidos = pedidoDao.getAll();
		System.out.println("*** Pedidos: " + pedidos);
	}
}
