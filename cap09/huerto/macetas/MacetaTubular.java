package huerto.macetas;

import huerto.enums.FormaMaceta;

public class MacetaTubular extends Maceta {
	
	private int diametro;

	public MacetaTubular(String nombre, int alto, int diametro) {
		super(nombre, alto);
		this.diametro = diametro;
	}

	@Override
	public int getSuperficie() {
		return (int)(Math.PI * (diametro/2) * (diametro/2));
	}

	@Override
	public FormaMaceta getForma() {
		return FormaMaceta.TUBULAR;
	}
}
