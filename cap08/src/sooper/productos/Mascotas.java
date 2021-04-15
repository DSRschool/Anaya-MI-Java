package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;

public class Mascotas extends Producto {
	public Mascotas(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
	}

	@Override
	public Categoria getCategoria() {
		return Categoria.MASCOTAS;
	}

	@Override
	public boolean esCompatible(IProducto p) {
		// TODO Auto-generated method stub
		return false;
	}
}