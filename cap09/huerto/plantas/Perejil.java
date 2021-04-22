package huerto.plantas;

import huerto.enums.Especie;

public class Perejil extends PlantaAromatica {

	public Perejil(String nombre) {
		super(nombre, 8, 5);
		especie = Especie.PEREJIL;
		incompatibles.add(Especie.LECHUGA);
		incompatibles.add(Especie.ZANAHORIA);
		compatibles.add(Especie.TOMATE);
	}
}
