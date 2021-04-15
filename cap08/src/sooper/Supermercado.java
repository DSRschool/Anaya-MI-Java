package sooper;

import sooper.contenedores.Bolsa;
import sooper.contenedores.Caja;

public class Supermercado {

	public static void main(String[] args) {
		IPedido miPedido = new Pedido("pedido001");
		IContenedor bolsa1 = new Bolsa("B111", 40, 25);
		IContenedor caja1 = new Caja("C222", 30, 50, 75);
		miPedido.addContenedor(bolsa1);
		miPedido.addContenedor(caja1);
	}
}
