package huerto.macetas;

import huerto.enums.FormaMaceta;

public class MacetaRectangular extends Maceta {
	
	private int ancho;
	private int largo;

	public MacetaRectangular(String nombre, int alto, int ancho, int largo) {
		super(nombre, alto);
		this.ancho = ancho;
		this.largo = largo;
	}

	@Override
	public int getSuperficie() {
		return ancho * largo;
	}
	
	@Override
	public FormaMaceta getForma() {
		return FormaMaceta.RECTANGULAR;
	}
}
