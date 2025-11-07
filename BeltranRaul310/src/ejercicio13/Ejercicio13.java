/*
*  Descripción: Programa hace una secuencia arítmetica al gusto del usuario
 * Autor: Raúl Beltrán
 * Fecha: 31/10/2025
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);

	int v, i;
	final int S;
	
	System.out.print("Introduce el valor inicial: ");
	v = teclado.nextInt();
	System.out.print("Introduce el valor incremental: ");
	i = teclado.nextInt();
	System.out.print("Introduce cómo de larga será la secuencia: ");
	S = teclado.nextInt();
	
	int[] array = new int [S];

	
		for (int posicion = 0; posicion < array.length; posicion++) {
			v = v + i;
			array[posicion] = v - i;
		}
		
		System.out.println("El resultado de la secuencia aritmética es: ");
		for (int posicion = 0; posicion < array.length; posicion++) {
			System.out.println(array[posicion]);
		}
	
	teclado.close();
	}

}
