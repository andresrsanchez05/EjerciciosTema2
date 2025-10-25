package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio3_1 {
	
	public static long ejercicio1a(int N) {
		long tiempo1 = System.nanoTime();
		int sum = 0;
		for (int n = N; n > 0; n /= 2) {
			for (int i = 0; i < n; i++) {
				sum++;
	}}
		long tiempo2 = System.nanoTime();
		return tiempo2-tiempo1;
	}
	
	public static long ejercicio1b(int N) {
		long tiempo1 = System.nanoTime();
		int sum = 0;
		for (int i = 1; i < N; i *= 2) {
			for(int j = 0; j < i; j++) {
				sum++;
	}}
		long tiempo2 = System.nanoTime();
		return tiempo2-tiempo1;
	}
	
	public static long ejercicio1c(int N) {
		long tiempo1 = System.nanoTime();
		int sum = 0;
		for (int i = 1; i < N; i *= 2) {
			for (int j = 0; j < N; j++) {
				sum++;
	}}
		long tiempo2 = System.nanoTime();
		return tiempo2-tiempo1;
	}
	
	public static void main(String[] args) {
		System.out.println("Inserte un número:");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.close();
		
		
		System.out.println("El tiempo total de ejecucion del ejercicio 1a es " + ejercicio1a(numero) + " nanosegundos");
		System.out.println("El tiempo total de ejecucion del ejercicio 1b es " + ejercicio1b(numero) + " nanosegundos");
		System.out.println("El tiempo total de ejecucion del ejercicio 1c es " + ejercicio1c(numero) + " nanosegundos");
	}

}
