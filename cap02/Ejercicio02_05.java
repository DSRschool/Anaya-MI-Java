/* Ejercicio 2.5 - Realiza el mismo ejercicio que en el 03a, 
 * pero sacando el cálculo del área a un método: 
 * Escribe un programa que calcule el área de un rectángulo 
 * e imprima por pantalla el texto “El rectángulo de … por … tiene un área de …”. 
 * Recibirá el tamaño de los dos lados como argumentos. 
 */

public class Ejercicio02_05 {
	public static void main(String[] args) 
	{	
		int ladoX = Integer.valueOf(args[0]);
		int ladoY = Integer.valueOf(args[1]);
		
		// Llamamos a un método para que calcule el área
		int area = areaRectangulo(ladoX, ladoY);
		
		System.out.println("El rectángulo de " + ladoX + " por " + ladoY + 
				" tiene un área de " + area);
	}

	// Este método recibe dos parámetros, ambos enteros
	// Y devuelve un entero
	private static int areaRectangulo(int base, int altura) {
		return base * altura;
	}
}
