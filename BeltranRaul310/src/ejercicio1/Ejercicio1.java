/*
 * Descripción: Almacenar 10 números otorgados por el usuario
 * en un array y mostrarlos en pantalla luego
 * Autor: Raúl Beltrán
 * Fecha: 30/10/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		final int TOTAL_NUM = 10;
		double[] numeros;
		numeros = new double [TOTAL_NUM];
		
		for (int posicion = 0; posicion < numeros.length; posicion++) {
		System.out.println("Introduce un número: ");
		numeros[posicion] = teclado.nextDouble();
		}
		
		System.out.println("Estos son los números almacenados:");
		
		for (int posicion = 0; posicion < numeros.length; posicion++) {
		System.out.println(numeros[posicion]);
		}
	}

}
