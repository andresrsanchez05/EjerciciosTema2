package EjerciciosTema2;

public class Ejercicio1_3 {

	public static String ex233(int n) {
		 if (n <= 0) return "";
		 return ex233(n-3) + n + ex233(n-2) + n;
	}
	
	public static void main(String[] args) {
		System.out.println(ex233(6));

	}

}
