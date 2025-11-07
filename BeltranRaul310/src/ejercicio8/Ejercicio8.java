/*
* Programa que crea un array con 100 números reales aleatorios entre 0.0 y 1.0,
 y luego pide al usuario que introduzca un número entre 0 y 1 y compara 
 cuantos números de los 100 son mayores o menores que el introducido
 * Autor: Raúl Beltrán
 * Fecha: 30/10/2025
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
	
	final int NUM_MAX = 100;
	double[] numeros = new double [NUM_MAX];
	
	double r;
	int contadorMayor = 0, contadorMenor = 0;
	
	
	
			for (int posicion = 0; posicion < numeros.length; posicion++) {
				numeros[posicion] = (double) Math.random();
			}
			
			
	
	System.out.print("Introduce un número comprendido entre 0 y 1: ");
	r = teclado.nextDouble();

	
	
			for (int posicion = 0; posicion < numeros.length; posicion++) {
				if (numeros[posicion] > r) {
					contadorMayor++;
				}
				else if (numeros[posicion] < r) {
					contadorMenor++;
				}
			}
			
			
		System.out.print("Hay " + contadorMayor + " numeros mayores que " + r + "."
				+ "\nHay " + contadorMenor + " numeros mayores que " + r + ".");
			
	teclado.close();
	}
}