package sooper;

import java.util.Set;

import sooper.enums.TipoContenedor;

public interface IContenedor {
	
	String getReferencia();

	int getVolumen();

	int volumenDisponible();

	int getResistencia();
	
	Set<IProducto> getProductos();
	
	TipoContenedor getTipo();

	boolean meter(IProducto producto);

	boolean resiste(IProducto producto);
}
