package sooper;

import java.util.Set;

public interface IContenedor {
	
	String getReferencia();

	int getVolumen();

	int volumenDisponible();

	int getResistencia();
	
	Set<IProducto> getProductos();
	
	String getTipo();

	boolean meter(IProducto producto);

	boolean resiste(IProducto producto);
}
