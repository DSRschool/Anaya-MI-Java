public class LanzadorMultiple {

	public static void queMeSalgo() {
		// Inténtalo aquí: escribe cualquier código 
		// que lance una IndexOutOfBoundsException 
		String[] lista = {"uno", "dos"};
		String tercero = lista[2];
		System.out.println(tercero);
	}

	public static void malditaCasta() {
		// Inténtalo aquí: escribe cualquier código 
		// que lance una ClassCastException 
		Number numero = new Integer(3);
		Double decimal = (Double) numero;
		System.out.println(decimal);
	}

	public static void siemprePositivoNuncaNegativo() {
		// Inténtalo aquí: escribe cualquier código 
		// que lance una NegativeArraySizeException
		String[] lista = new String[-2];
	}
}