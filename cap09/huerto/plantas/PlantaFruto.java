package huerto.plantas;

import huerto.enums.Familia;

public abstract class PlantaFruto extends Planta {

	protected PlantaFruto(String nombre, int distancia, int litros) {
		super(nombre, distancia, litros);
		familia = Familia.FRUTO;
	}
}
