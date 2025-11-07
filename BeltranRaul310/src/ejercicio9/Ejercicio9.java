/*
*  Programa que crea un array de enteros de tamaño 100 y lo rellene con valores
 enteros aleatorios entre 1 y 10 . Luego pedirá un valor N y mostrará en qué 
 posiciones del array aparece N. 
 * Autor: Raúl Beltrán
 * Fecha: 31/10/2025
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		
		final int NUM_MAX = 100;
		int[] numeros = new int [NUM_MAX];
		
		int n, contador = 0, indice = 0;
			
				for (int posicion = 0; posicion < numeros.length; posicion++) {
					numeros[posicion] = (int) ((Math.random() * 10) + 1);
				}
		
			System.out.print("Introduce un número entre el 1 y el 10: ");
			n = teclado.nextInt();


				for (int posicion = 0; posicion < numeros.length; posicion++) {
					if (numeros[posicion] == n) {
						contador++;
					}
				}
		
		int[] igual = new int[contador];
		
				for (int posicion = 0; posicion < numeros.length; posicion++) {
					if (numeros[posicion] == n) {
						igual[indice] = posicion;
						indice++;
					}
				}
				
		System.out.println("El número " + n + " aparece en las posiciones:");
				
				for (int posicion = 0; posicion < igual.length; posicion++) {
				System.out.println(igual[posicion]);
				}
		
		
		teclado.close();
		}
	}