package huerto;

import huerto.enums.Especie;
import huerto.enums.Familia;

public interface IPlanta {

	String getNombre();
	
	int getSuperficieRequerida();
	int getVolumenRequerido();
	
	Familia getFamilia();
	Especie getEspecie();
	
	boolean esCompatible(IPlanta planta);	
	void plantar(IMaceta maceta);
	boolean tengoEspacio(IMaceta maceta);
}
