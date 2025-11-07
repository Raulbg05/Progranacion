/*
 * Descripción: Almacenar 20 números otorgados por el usuario
 * en un array y mostrar en pantalla cuantos números positivos y negativos hay
 * Autor: Raúl Beltrán
 * Fecha: 30/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		final int TOTAL_NUM = 20;
		int[] numeros;
		numeros = new int [TOTAL_NUM];
		
		int contadorPositivo = 0;
		int contadorNegativo = 0;
		
		for (int posicion = 0; posicion < numeros.length; posicion++) {
		System.out.println("Introduce un número: ");
		numeros[posicion] = teclado.nextInt();
			
			if (numeros[posicion] > 0) {
				contadorPositivo++;
			}
			else if (numeros[posicion] < 0) {
				contadorNegativo++;
			}
		}
	System.out.print("Hay " + contadorPositivo + " números positivos."
	+ "\nHay " + contadorNegativo + " números negativos.");
	
	teclado.close();
	}
}