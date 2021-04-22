package huerto.plantas;

import huerto.enums.Especie;

public class Tomate extends PlantaFruto {

	public Tomate(String nombre) {
		this(nombre, 30, 18);
	}

	protected Tomate(String nombre, int superficie, int volumen) {
		super(nombre, superficie, volumen);
		especie = Especie.TOMATE;
		incompatibles.add(Especie.HINOJO);
		compatibles.add(Especie.LECHUGA);
		compatibles.add(Especie.PEREJIL);
		compatibles.add(Especie.ZANAHORIA);
	}
}
