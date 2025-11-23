package EjerciciosTema2;

public class TorresHanoi {
	
	public static void hanoi (int n, char origen, char auxiliar, char destino) {
		
		if (n == 1) {
			System.out.println("Mover el disco " + n + " de " + origen + " a " + destino);
			return;
		}
		
		hanoi(n-1, origen, destino, auxiliar);
		System.out.println("Mover el disco " + n + " de " + origen + " a " +  destino);
		hanoi(n-1, auxiliar, origen, destino);
	}

	public static void main(String[] args) {
		hanoi(3, 'A', 'B', 'C');

	}

}
