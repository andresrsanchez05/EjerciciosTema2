package EjerciciosTema2;

public class Potencia {

	public static int potencia (int base, int exponente) {
		
		if (exponente == 0) {
			return 1;
		}
		
		return base*potencia(base, exponente-1);
		
	}
	
	public static void main(String[] args) {
		
		int base = 5;
		int exponente = 1;
		int resultado = potencia(base, exponente);
		
		System.out.println(base + " elevado a " + exponente + " es " + resultado);
		
	}

}
