/*
*  Descripción: Programa que crea matrices del tamaño que el usuario quiera, 
*  le pide que las rellene con números y luego dice cuantos son positivos, negativos o ceros
 * Autor: Raúl Beltrán
 * Fecha: 03/11/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
		
	final int TOTAL_NUM, TOTAL_NUMX;
	int contadorPositivo = 0, contadorNegativo = 0, contadorCeros = 0;
		
	System.out.print("Introduce el primer tamaño del array bidimensional: ");
	TOTAL_NUM = teclado.nextInt();
		
	System.out.print("Introduce el segundo tamaño del array bidimensional: ");
	TOTAL_NUMX = teclado.nextInt();
			
	int [][] bidimensional;
	bidimensional = new int [TOTAL_NUM][TOTAL_NUMX];
		
		
	System.out.println("Introducirás números hasta completar el tamaño de la matriz.");

		for (int y = 0; y < TOTAL_NUM; y++) {
			for (int x = 0; x < TOTAL_NUMX; x++) {
				System.out.println("Introduce un número: ");
				bidimensional[y][x] = teclado.nextInt();
			}
		}
		
		System.out.println("Los números introducidos son:");

		for (int y = 0; y < TOTAL_NUM; y++) {
			for (int x = 0; x < TOTAL_NUMX; x++) {
				System.out.print(bidimensional[y][x] + "\t ");
			}
			System.out.println();
		}
			
		for (int y = 0; y < TOTAL_NUM; y++) {
			for (int x = 0; x < TOTAL_NUMX; x++) {
				if (bidimensional[y][x] == 0) {
					contadorCeros++;
				}
				else if (bidimensional[y][x] > 0) {
					contadorPositivo++;
				}
				else {
					contadorNegativo++;
				}
			}
		}
			
		System.out.print("Hay " + contadorPositivo + " numero(s) positivo(s)"
			+ "\nHay " + contadorNegativo + " numero(s) negativo(s)"
			+ "\nHay " + contadorCeros + " cero(s)");
			
	teclado.close();
	}

}


