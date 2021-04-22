package huerto.plantas;

import huerto.enums.Especie;

public class Hinojo extends PlantaAromatica {

	public Hinojo(String nombre) {
		super(nombre, 10, 8);
		especie = Especie.HINOJO;
		incompatibles.add(Especie.TOMATE);
		incompatibles.add(Especie.ZANAHORIA);
		compatibles.add(Especie.LECHUGA);
	}
}
