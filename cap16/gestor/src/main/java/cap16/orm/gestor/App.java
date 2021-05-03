package cap16.orm.gestor;

import java.util.List;

import cap16.orm.gestor.dao.PedidoDao;

public class App 
{
    public static void main( String[] args )
    {
        PedidoDao pedidoDao = new PedidoDao();

		Pedido pedido = new Pedido("001", new Date());
		pedidoDao.save(pedido);

		List<Pedido> pedidos = pedidoDao.getAll();
		System.out.println("*** Pedidos: " + pedidos);
    }
}