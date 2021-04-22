package huerto.plantas;

import huerto.IMaceta;
import huerto.IPlanta;
import huerto.enums.Especie;
import huerto.enums.Familia;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public abstract class Planta implements IPlanta {

	protected Especie especie;
	protected Familia familia;
	protected Set<Especie> incompatibles;
	protected Set<Especie> compatibles;

	private String nombre;
	private int superficieRequerida;
	private int volumenRequerido;
	private Date fechaSiembra;
	private IMaceta maceta;
	
	public Planta(String nombre, int distancia, int litros) {
		this(nombre);
		this.superficieRequerida = distancia^2;
		this.volumenRequerido = litros * 1000;
		incompatibles = new HashSet<Especie>();
		compatibles = new HashSet<Especie>();
	}
	
	@Override
	public boolean esCompatible(IPlanta planta) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public boolean tengoEspacio(IMaceta maceta) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void plantar(IMaceta maceta) {
		fechaSiembra = new Date(); // hoy
		this.maceta = maceta; 
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSuperficieRequerida() {
		return superficieRequerida;
	}

	public void setSuperficieRequerida(int superficieRequerida) {
		this.superficieRequerida = superficieRequerida;
	}

	public int getVolumenRequerido() {
		return volumenRequerido;
	}

	public void setVolumenRequerido(int volumenRequerido) {
		this.volumenRequerido = volumenRequerido;
	}
	
	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	@Override
	public String toString() {
		return "Planta " + nombre + " [especie=" + especie + ", familia=" + familia
				+ ", superficieRequerida="
				+ superficieRequerida + ", volumenRequerido="
				+ volumenRequerido + ", incompatibles=" + incompatibles
				+ ", fechaSiembra=" + fechaSiembra + ", maceta=" + maceta.getNombre() + "]";
	}
}
