package huerto.plantas;

import huerto.enums.Especie;

public class Zanahoria extends PlantaRaiz {

	public Zanahoria(String nombre) {
		super(nombre, 10, 3, 25);
		especie = Especie.ZANAHORIA;
		incompatibles.add(Especie.PEREJIL);
		incompatibles.add(Especie.HINOJO);
		compatibles.add(Especie.REMOLACHA);
		compatibles.add(Especie.TOMATE);
	}
}
