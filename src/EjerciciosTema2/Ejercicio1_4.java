package EjerciciosTema2;

public class Ejercicio1_4 {

	public static String ex234(int n) {
		if (n <= 0) return "";
		String s = ex234(n-3) + n + ex234(n-2) + n;
		return s;
		}
	
	public static void main(String[] args) {
		System.out.println(ex234(6));

	}

}
