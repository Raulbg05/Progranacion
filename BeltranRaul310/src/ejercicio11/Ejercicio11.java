/*
*  Descripción: Programa que crea 2 array de tamaño 100 e introduce los valores del 1 al 100
*  de manera creciente y decreciente.
 * Autor: Raúl Beltrán
 * Fecha: 31/10/2025
 */
package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
	
	final int TOTAL_NUM = 100;
	
	int[] creciente = new int [TOTAL_NUM];
	int[] decreciente = new int [TOTAL_NUM];

	
		for (int posicion = 0; posicion < creciente.length; posicion++) {
			creciente[posicion] = posicion + 1;
		}
		
		for (int posicion = 0; posicion < decreciente.length; posicion++) {
			decreciente[posicion] = creciente[creciente.length - 1 - posicion];
		}
		
		System.out.println("Los valores crecientes son:");
		
		for (int posicion = 0; posicion < creciente.length; posicion++) {
			System.out.println(creciente[posicion]);
		}
		
		System.out.println("\n" + "Los valores decrecientes son:");
		
		for (int posicion = 0; posicion < decreciente.length; posicion++) {
			System.out.println(decreciente[posicion]);
		}

	}

}
