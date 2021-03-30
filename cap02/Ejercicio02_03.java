/* Ejercicio 2.3 - Escribe un programa que calcule el área de un rectángulo 
 * e imprima por pantalla el texto “El rectángulo de … por … tiene un área de …”. 
 * Recibirá el tamaño de los dos lados como argumentos. 
 */

public class Ejercicio02_03 {
	public static void main(String[] args) {
		// Los argumentos que recibimos son Strings. 
		// Tenemos que convertirlos a números para poder operar con ellos
		// Los guardamos en variables y les damos un nombre representativo
		int ladoX = Integer.valueOf(args[0]);
		int ladoY = Integer.valueOf(args[1]);
		// TODO deberíamos comprobar que al menos tenemos dos argumentos
		// TODO deberíamos asegurarnos de que los argumentos son números enteros
		
		// Guardamos el resultado del cálculo en una variable
		int area = ladoX * ladoY;
		
		// Tras hacer todos los cálculos necesarios, mostarmos el resultado
		// Cuidado con los espacios al concatenar Strings, para que no se 
		// peguen las palabras
		System.out.println("El rectángulo de " + ladoX + " por " + ladoY + 
				" tiene un área de " + area);
	}
}