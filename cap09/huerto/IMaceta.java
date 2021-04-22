package huerto;

import huerto.enums.FormaMaceta;

import java.util.Set;

public interface IMaceta {

	String getNombre();
	
	int getVolumen();
	int volumenDisponible();
	
	int getSuperficie();
	int superficieDisponible();
	
	int getProfundidad();
	
	FormaMaceta getForma();
	
	boolean plantar(IPlanta planta);	
	Set<IPlanta> getPlantas();
}
