package EjerciciosTema2;

public class Ejercicio2 {
	
	public static void ex232(int n) {
		 if (n <= 0) return;
		 System.out.println(n);
		 ex232(n-2);
		 ex232(n-3);
		 System.out.println(n);
		}

	public static void main(String[] args) {
		ex232(6);

	}

}