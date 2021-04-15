package sooper;

import java.util.Set;

public interface IPedido {
	
	String getReferencia();
	
	Set<IProducto> getProductos();

	Set<IContenedor> getContenedores();

	void addContenedor(IContenedor contenedor);
	
	IContenedor addProducto(IProducto producto);
}
