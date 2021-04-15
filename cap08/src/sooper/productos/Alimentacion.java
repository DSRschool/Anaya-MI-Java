package sooper.productos;

import static sooper.enums.Categoria.ALIMENTACION;
import sooper.IProducto;
import sooper.enums.Categoria;

public class Alimentacion extends Producto {
	public Alimentacion(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
	}

	@Override
	public Categoria getCategoria() {
		return ALIMENTACION;
	}

	@Override
	public boolean esCompatible(IProducto p) {
		// TODO Auto-generated method stub
		return false;
	}
}
