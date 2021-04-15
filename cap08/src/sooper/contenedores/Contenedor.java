package sooper.contenedores;

import java.util.HashSet;
import java.util.Set;

import sooper.IContenedor;
import sooper.IProducto;

public abstract class Contenedor implements IContenedor {

	private String referencia;
	private int alto;
	private int resistencia;

	private Set<IProducto> productos;

	public Contenedor(String referencia, int alto) {
		this.referencia = referencia;
		this.alto = alto;
		productos = new HashSet<>();
	}

	@Override
	public String getReferencia() {
		return referencia;
	}

	@Override
	public int getVolumen() {
		return alto * getSuperficie();
	}

	@Override
	public int volumenDisponible() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getResistencia() {
		return resistencia;
	}

	@Override
	public Set<IProducto> getProductos() {
		return productos;
	}

	@Override
	public boolean meter(IProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean resiste(IProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("Contenedor " + referencia + " [" 
				+ getTipo() + "] (sup " + getSuperficie() + "cm2 - vol " 
				+ getVolumen() + "cm3 - resistencia " + getResistencia() + " g).\n");
		if (productos.isEmpty()) {
			sb.append("\t\tvacío\n");
		}
		for (IProducto p : productos) {
			sb.append("\t\t" + p + "\n");
		}
		sb.append("\t\t>> Disponible vol " + volumenDisponible() + "cm3");
		return sb.toString();
	}
}
