/*
 * Descripción: programa que pide dos valores enteros N y M, los almacena en un array 
 * de tamaño N, y escriba M en todas sus posiciones y las muestre por pantalla.
 * Autor: Raúl Beltrán
 * Fecha: 30/10/2025
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	
	Scanner teclado= new Scanner(System.in);
		
	int n, m;
	
	System.out.print("Dame un número entero: ");
	n = teclado.nextInt();
	
	System.out.print("Dame otro número entero: ");
	m = teclado.nextInt();
	
	int[] array = new int [n];
	
		for (int posicion = 0; posicion < array.length; posicion++) {
			array[posicion] = m;
		}
		
		for (int posicion = 0; posicion < array.length; posicion++) {
			System.out.println(array[posicion]);
		}
		
	teclado.close();
	}

}
