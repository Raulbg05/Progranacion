/*
*  Descripción: Programa que crea 1 array con una secuencia de valores del 1 al 10
*  usando "Arrays.fill"
 * Autor: Raúl Beltrán
 * Fecha: 31/10/2025
 */
package ejercicio16;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
		
	final int TOTAL_NUM = 55;	// 1 + 2 + 3 + ... + 10 = 55 → tamaño total del array
	int[] secuencia = new int [TOTAL_NUM];
	
	Arrays.fill(secuencia, 0, 1, 1);     // 1 vez el número 1
    Arrays.fill(secuencia, 1, 3, 2);     // 2 veces el número 2
    Arrays.fill(secuencia, 3, 6, 3);     // 3 veces el número 3
    Arrays.fill(secuencia, 6, 10, 4);    // 4 veces el número 4
    Arrays.fill(secuencia, 10, 15, 5);   // 5 veces el número 5
    Arrays.fill(secuencia, 15, 21, 6);   // 6 veces el número 6
    Arrays.fill(secuencia, 21, 28, 7);   // 7 veces el número 7
    Arrays.fill(secuencia, 28, 36, 8);   // 8 veces el número 8
    Arrays.fill(secuencia, 36, 45, 9);   // 9 veces el número 9
    Arrays.fill(secuencia, 45, 55, 10);	 // 10 veces el número 10
	
		for (int posicion = 0; posicion < secuencia.length; posicion++) {
			System.out.println(secuencia[posicion]);
		}
		
	teclado.close();	
	}

}
