package EjerciciosTema2;

public class Ejercicio2_1 {

	public static void main(String[] args) {
        int n = 3; 
        hanoi(n, 'A', 'C', 'B');
    }

    public static void hanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }

        hanoi(n - 1, origen, auxiliar, destino);
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        hanoi(n - 1, auxiliar, destino, origen);
    }
}