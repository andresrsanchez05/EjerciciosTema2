package EjerciciosTema2;

public class MCD {
	
	public static int mcd (int numero1, int numero2) {
		if (numero2 == 0) {
			return numero1;
		}
		
		return mcd(numero2, numero1%numero2);
		
	}

	public static void main(String[] args) {

		int numero1 = 52648;
		int numero2 = 34712;
		System.out.println("El MCD es " + mcd(numero1, numero2));

	}

}
