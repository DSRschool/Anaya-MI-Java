package sooper.contenedores;

public class Caja extends Contenedor {
	private int ancho;
	private int largo;

	public Caja(String referencia, int alto, int ancho, int largo) {
		super(referencia, alto);
		this.ancho = ancho;
		this.largo = largo;
	}

	@Override
	public String getTipo() {
		return "caja";
	}

	@Override
	public int getSuperficie() {
		return ancho * largo;
	}
}
