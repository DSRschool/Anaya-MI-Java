package huerto.plantas;

import huerto.enums.Familia;

public abstract class PlantaHoja extends Planta {

	protected PlantaHoja(String nombre, int distancia, int litros) {
		super(nombre, distancia, litros);
		familia = Familia.HOJA;
	}
}
