package cap12;

public class Calculadora {
	public static int suma(int a, int b) {
		return a + b;
	}

	public static int resta(int a, int b) {
		return a + b;
	}

	public static int multiplica(int a, int b) {
		return a * b;
	}
    
    public static int divide(int a, int b) 
    {
    	return a / b;
	}

	public static int divideB(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("No podemos dividir entre cero.");
		}
		return a / b;
	}

	public static int divideC(int a, int b) throws ExcepcionPropia {
		if (b == 0) {
			throw new ExcepcionPropia("No podemos dividir entre cero.");
		}
		return a / b;
	}
}