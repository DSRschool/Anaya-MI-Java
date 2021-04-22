package huerto.plantas;

import huerto.enums.Especie;

public class Lechuga extends PlantaHoja {

	public Lechuga(String nombre) {
		super(nombre, 12, 22);
		especie = Especie.LECHUGA;
		compatibles.add(Especie.TOMATE);
		compatibles.add(Especie.ZANAHORIA);
	}
}
