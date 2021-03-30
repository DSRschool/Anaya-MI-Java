public class Ejemplo02_02 {
	public static void main(String[] args) {
		// Los argumentos que recibimos son Strings. 
		// Tenemos que convertirlos a números para poder operar con ellos
		// Los guardamos en variables y les damos un nombre representativo
		int numManzanas = Integer.valueOf(args[0]);
		int numPeras = Integer.valueOf(args[1]);
		// TODO deberíamos comprobar que al menos tenemos dos argumentos
		// TODO deberíamos asegurarnos de que los argumentos son números enteros
		
		// Guardamos el resultado del cálculo en una variable
		int numFrutas = numManzanas + numPeras;
		
		// Tras hacer todos los cálculos necesarios, mostramos el resultado
		// Cuidado con los espacios al concatenar Strings, para que no se 
		// peguen las palabras
		System.out.println("El frutero tiene " + numFrutas + 
				" piezas de fruta.");
	}
}
