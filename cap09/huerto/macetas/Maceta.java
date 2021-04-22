package huerto.macetas;

import huerto.IMaceta;
import huerto.IPlanta;

import java.util.HashSet;
import java.util.Set;

public abstract class Maceta implements IMaceta {

	private String nombre;
	private int alto;
	private Set<IPlanta> plantas;
 	
	public Maceta(String nombre, int alto) {
		super();
		this.nombre = nombre;
		this.alto = alto;
		plantas = new HashSet<IPlanta>();
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public int getVolumen() {
		return alto * getSuperficie();
	}
	
	@Override
	public int getProfundidad() {
		return alto;
	}
	
	@Override
	public Set<IPlanta> getPlantas() {
		return plantas;
	}
	
	@Override
	public int superficieDisponible() {
		return getSuperficie() - superficieOcupada();
	}
	
	private int superficieOcupada() {
		int res = 0;
		for (IPlanta p : plantas) {
			res += p.getSuperficieRequerida();
		}
		return res;
	}
	
	@Override
	public int volumenDisponible() {
		return getVolumen() - volumenOcupado();
	}

	private int volumenOcupado() {
		int res = 0;
		for (IPlanta p : plantas) {
			res += p.getVolumenRequerido();
		}
		return res;
	}

	@Override
	public boolean plantar(IPlanta planta) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Maceta " + nombre + " [" + getForma() 
				+ "] (sup " + getSuperficie() + "cm2 - vol " + getVolumen() + "cm3).\n");
		if (plantas.isEmpty()) {
			sb.append("\t\tvacía\n");
		}
		for (IPlanta p : plantas) {
			sb.append("\t\t" + p + "\n");
		}
		sb.append("\t\t>> Disponible sup " + superficieDisponible() + "cm2 - vol " + volumenDisponible() + "cm3");
		return sb.toString();
	}
}
