package huerto;

import java.util.HashSet;
import java.util.Set;

public class Huerto implements IHuerto {
	
	private String nombre;
	private Set<IMaceta> macetas;

	public Huerto(String nombre) {
		this.nombre = nombre;
		macetas = new HashSet<>();
	}

	@Override
	public void addMaceta(IMaceta maceta) {
		macetas.add(maceta);
	}
	
	@Override
	public IMaceta plantar(IPlanta planta) {
		for (IMaceta maceta : macetas) {
			if (maceta.plantar(planta)) {
				return maceta;
			}
		}
		return null;
	}
		
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Huerto: " + nombre + "\n");
		for (IMaceta maceta : macetas) {
			sb.append("\t" + maceta + "\n");
		}
		return sb.toString();
	}
}
