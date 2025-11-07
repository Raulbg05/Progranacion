/*
 * Descripción: Almacenar 20 números otorgados por el usuario
 * en un array y mostrar en pantalla la media de los números introducidos
 * Autor: Raúl Beltrán
 * Fecha: 30/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		final int TOTAL_NUM = 20;
		double[] numeros;
		numeros = new double [TOTAL_NUM];

		double media;
		
		for (int posicion = 0; posicion < numeros.length; posicion++) {
		System.out.println("Introduce un número: ");
		numeros[posicion] = teclado.nextDouble();
		}
		
		double suma = 0;
		
		for (int posicion = 0; posicion < numeros.length; posicion++) {
		System.out.println("Introduce un número: ");
		numeros[posicion] = teclado.nextDouble();
		suma += numeros[posicion];
		}
		
	media = suma / numeros.length;
		
	System.out.println("La media de todos los valores es: " + media);
	teclado.close();
	
	}
}