/*
 * Descripción: Almacenar 10 números otorgados por el usuario
 * en un array y mostrar en pantalla el número más alto y más pequeño
 * Autor: Raúl Beltrán
 * Fecha: 30/10/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		final int TOTAL_NUM = 10;
		double[] numeros;
		numeros = new double [TOTAL_NUM];
		
		double numeroMax = 0;
		double numeroMin = 0;
		
		for (int posicion = 0; posicion < numeros.length; posicion++) {
		System.out.println("Introduce un número: ");
		numeros[posicion] = teclado.nextDouble();
		}
		
		numeroMax = numeros[0];
		numeroMin = numeros[0];
		
		for (int posicion = 0; posicion < numeros.length; posicion++) {
			if (numeros[posicion] > numeroMax) {
				numeroMax = numeros[posicion];
			}
		}
		for (int posicion = 0; posicion < numeros.length; posicion++) {
			if (numeros[posicion] < numeroMin) {
				numeroMin = numeros[posicion];
			}
		}
	
	System.out.println("El número más alto introducido es: " + numeroMax
			+ "\nEl número más pequeño introducido es: " + numeroMin);
	
	teclado.close();
	}
}