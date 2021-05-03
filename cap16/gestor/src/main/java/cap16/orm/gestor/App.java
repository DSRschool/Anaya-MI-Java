package cap16.orm.gestor;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import cap16.orm.gestor.dao.PedidoDao;

public class App 
{
    public static void main( String[] args )
    {
        PedidoDao pedidoDao = new PedidoDao();

		Pedido pedido = new Pedido("001", LocalDateTime.now());
		pedidoDao.save(pedido);

		Pedido pedido2 = new Pedido("pedFut", LocalDateTime.now().plus(2, ChronoUnit.DAYS));
		pedidoDao.save(pedido2);

		List<Pedido> pedidos = pedidoDao.getAll();
		System.out.println("*** Pedidos: " + pedidos);

		try {
			Pedido masReciente = pedidoDao.pedidoMasReciente();
			System.out.println("*** Pedido más reciente: " + masReciente);
		} catch (NoResultException nre) {
			System.out.println("No tienes ningún pedido reciente.");
		}
    }
}