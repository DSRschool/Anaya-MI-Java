package huerto.plantas;

import huerto.enums.Familia;

public abstract class PlantaAromatica extends Planta {

	protected PlantaAromatica(String nombre, int distancia, int litros) {
		super(nombre, distancia, litros);
		familia = Familia.AROMATICA;
	}
}
