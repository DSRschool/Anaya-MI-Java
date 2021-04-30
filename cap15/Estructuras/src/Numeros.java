import java.math.BigInteger;

public class Numeros {
	public static void main(String[] args) {
		BigInteger numGrande = new BigInteger("12345678901234567890123456789");
		System.out.println("Número grande: " + numGrande);
		BigInteger masUno = numGrande.add(BigInteger.ONE);
		System.out.println("Más uno:       " + masUno);
		BigInteger alCuadrado = numGrande.multiply(numGrande);
		System.out.println("Al cuadrado:   " + alCuadrado);
	}
}
