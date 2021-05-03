package cap16.orm.gestor;

import java.time.LocalDateTime;

import cap16.orm.gestor.dao.PedidoDao;

public class GestorPedidos {

	public static void main(String[] args) {
		PedidoDao pedidoDao = new PedidoDao();
		
		Producto libro = new Producto("libJava", "Manual Imprescindible Java");
		Producto cuaderno = new Producto("cuaRojo", "Cuaderno rojo");
		Producto lapiz = new Producto("lapHB", "Lápiz HB");

		Pedido vueltaAlCole = new Pedido("153947", LocalDateTime.now());
		vueltaAlCole.addProducto(libro);
		vueltaAlCole.addProducto(cuaderno);
		vueltaAlCole.addProducto(lapiz);
		
		pedidoDao.save(vueltaAlCole);
		
		Albaran albaran = vueltaAlCole.generaAlbaran();
		Factura factura = vueltaAlCole.generaFactura();
		
		System.out.println("Pedido:\n" + vueltaAlCole);

		pedidoDao.update(vueltaAlCole);
		System.out.println("Pedido actualizado:\n" + vueltaAlCole);
	}
}
