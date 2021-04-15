package sooper.contenedores;

import sooper.IProducto;
import sooper.enums.TipoContenedor;

public class Caja extends Contenedor {
	private int ancho;
	private int largo;

	public Caja(String referencia, int alto, int ancho, int largo) {
		super(referencia, alto, 0);
		this.ancho = ancho;
		this.largo = largo;
	}

	@Override
	public TipoContenedor getTipo() {
		return TipoContenedor.CAJA;
	}

	@Override
	public int getSuperficie() {
		return ancho * largo;
	}
	
	@Override
	public boolean resiste(IProducto producto) {
		return true;
	}
}
