/*
*  Programa que pide al usuario el número de alturas que va a introducir, 
*  las guarda en un array, muestra la media, cuantas alturas están por encima y por debajo
*  de la media y cuál es la altura mínima y máxima
 * Autor: Raúl Beltrán
 * Fecha: 31/10/2025
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);

	final int N; 
	int contadorMayor = 0, contadorMenor = 0;
	double suma = 0, media = 0;
	
	System.out.print("Número de alturas que vas a introducir: ");
	N = teclado.nextInt();
	
	double[] alturas = new double [N];
	
	for (int posicion = 0; posicion < alturas.length; posicion++) {
		System.out.println("Introduce altura (metros): ");
		alturas[posicion] = teclado.nextDouble();
		suma += alturas[posicion];
	}
	
	double alturaMayor = alturas[0];
	double alturaMenor = alturas[0];
	
	media = suma / N;
	
	for (int posicion = 0; posicion < alturas.length; posicion++) {
		if (alturas[posicion] > media) {
			contadorMayor++;
		}
		else if (alturas[posicion] < media) {
			contadorMenor++;
		}
	}
	
	for (int posicion = 0; posicion < alturas.length; posicion++) {
		if (alturas[posicion] > alturaMayor) {
			alturaMayor = alturas[posicion];
		}
		else if (alturas[posicion] < alturaMenor) {
			alturaMenor = alturas[posicion];
		}
	}
	
	System.out.print("La altura media es: " + media + "."
			+ "\nHay " + contadorMayor + " alturas superiores a la media."
			+ "\nHay " + contadorMenor + " alturas inferiores a la media."
			+ "\nLa altura más alta es de: " + alturaMayor + "."
			+ "\nLa altura más baja es de: " + alturaMenor + ".");
	
	teclado.close();
	}

}
