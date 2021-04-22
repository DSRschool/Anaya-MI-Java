package huerto.plantas;

import huerto.IMaceta;
import huerto.enums.Familia;

public abstract class PlantaRaiz extends Planta {

	private int profunidadRequerida;

	protected PlantaRaiz(String nombre, int distancia, int litros, int profundidad) {
		super(nombre, distancia, litros);
		profunidadRequerida = profundidad;
		familia = Familia.RAIZ;
	}

	public int getProfunidadRequerida() {
		return profunidadRequerida;
	}

	public void setProfunidadRequerida(int profunidadRequerida) {
		this.profunidadRequerida = profunidadRequerida;
	}
}
