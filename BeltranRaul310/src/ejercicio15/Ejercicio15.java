/*
*  Descripción: Programa que crea 1 del tamaño y con el valor que introduce el usuario
 * Autor: Raúl Beltrán
 * Fecha: 31/10/2025
 */
package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
	final int N;
	double m;
	
	System.out.print("Introduzca el tamaño del array: ");
	N = teclado.nextInt();
	System.out.print("Introduzca el valor del array: ");
	m = teclado.nextDouble();
	
	double[] array = new double [N];
	
		for (int posicion = 0; posicion < array.length; posicion++) {
			array[posicion] = m;
		}
		
		for (int posicion = 0; posicion < array.length; posicion++) {
			System.out.println(array[posicion]);
		}
		
	teclado.close();
	}

}
