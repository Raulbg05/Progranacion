/*
* Descripción: Programa que crea un array de cantidad que el usuario quiera y le da números aleatorios
 mediante una función.
* Autor: Raúl Beltrán
* Fecha: 18/11/2025
*/
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
		final int TOTAL_NUM;
		
		System.out.print("Indica el tamaño del array: ");
		TOTAL_NUM = teclado.nextInt();
		
		
		System.out.println("Los valores del array son:");
		aleatorio(TOTAL_NUM);
	
	teclado.close();
	}
	// Función que crea un array de cantidad que el usuario quiera y le da números aleatorios
	public static void aleatorio(final int TOTAL_NUM) {
		double[] array = new double [TOTAL_NUM];
			
			for (int posicion = 0; posicion < array.length; posicion++) {
				array[posicion] = Math.random();
			}
			for (int posicion = 0; posicion < array.length; posicion++) {
				System.out.println(array[posicion]);
			}
	}

}
