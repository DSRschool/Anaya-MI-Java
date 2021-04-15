package sooper;

import sooper.contenedores.Bolsa;
import sooper.contenedores.Caja;
import sooper.productos.Congelado;
import sooper.productos.Drogueria;
import sooper.productos.Fresco;
import sooper.productos.Higiene;
import sooper.productos.Mascotas;
import sooper.productos.NoPerecedero;

public class Supermercado {

	public static void main(String[] args) {
		IPedido miPedido = new Pedido("pedido001");
		IContenedor bolsa1 = new Bolsa("B111", 40, 25, 900);
		IContenedor caja1 = new Caja("C222", 30, 50, 75);
		System.out.println("Bolsa: " + bolsa1);
		System.out.println("Caja: " + caja1);
		miPedido.addContenedor(bolsa1);
		miPedido.addContenedor(caja1);
		System.out.println("Mi pedido con contenedores: " + miPedido);

		IProducto manzanas = new Fresco("MNZ", 1000, 1500);
		IProducto helado = new Congelado("HLD", 800, 1000);
		IProducto papelWC = new Higiene("PWC", 500, 2500);
		IProducto peras = new Fresco("PER", 800, 1200);

		IContenedor contManzanas = miPedido.addProducto(manzanas);
		IContenedor contHelado = miPedido.addProducto(helado);
		IContenedor contPapel = miPedido.addProducto(papelWC);
		IContenedor contPeras = miPedido.addProducto(peras);

		for (int i = 0; i < 3; i++) {
			IContenedor caja = new Caja("C23" + i, 30, 40, 30);
			miPedido.addContenedor(caja);
		}
		for (int i = 0; i < 5; i++) {
			IContenedor bolsa = new Bolsa("B12" + i, 3000, 30, 25);
			miPedido.addContenedor(bolsa);
		}
		for (int i = 0; i < 12; i++) {
			IProducto leche = new NoPerecedero("LCH" + i, 6600, 7000);
			miPedido.addProducto(leche);
		}
		miPedido.addProducto(new Mascotas("GAT", 5000, 10000)); // comida gato
		miPedido.addProducto(new Mascotas("PER1", 10000, 20000)); // comida perro
		miPedido.addProducto(new Mascotas("PER2", 10000, 20000)); // más comida perro
		miPedido.addProducto(new Higiene("GEL", 1500, 1600)); // gel de ducha
		miPedido.addProducto(new Drogueria("DET", 2000, 1600)); // detergente lavadora
		miPedido.addProducto(new Drogueria("LEJ", 1000, 1000)); // lejía
		for (int i = 0; i < 24; i++) {
			miPedido.addProducto(new Fresco("YOG" + i, 250, 300)); // yogur
		}
		miPedido.addProducto(new NoPerecedero("ARR", 1000, 1000)); // arroz
		for (int i = 0; i < 5; i++) {
			miPedido.addProducto(new NoPerecedero("PAS" + i, 1000, 1200)); // pasta
		}
		System.out.println("Mi pedido con productos: " + miPedido);
	}
}
