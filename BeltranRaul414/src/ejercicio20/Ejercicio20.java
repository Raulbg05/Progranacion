/*
* Descripción: Programa que imprime las tablas de multiplicar del 1 al 10.
 Posteriormente hace la tabla de un número cualquiera dado por el usuario mediante una función.
* Autor: Raúl Beltrán
* Fecha: 19/11/2025
*/
package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
		int numero;
		
		final int TOTAL_NUM = 10;
		
		int [][] bidimensional;
		bidimensional = new int [TOTAL_NUM][TOTAL_NUM];
		
		System.out.println("Las tablas de multiplicar son:");
		
			// Bucles que hacen las tablas del 1 al 10 y las muestran
			for (int y = 0; y < 10; y++) {
				for (int x = 0; x < 10; x++) {
					bidimensional[y][x] = (x + 1) * (y + 1);
				}
			}
			
			for (int y = 0; y < 10; y++) {	
				for (int x = 0; x < 10; x++) {
					System.out.print(bidimensional[y][x] + "\t ");
				}
				System.out.println();
			}
			
			System.out.print("-------------"
					+ "\nIntroduce un número entero: ");
			numero = teclado.nextInt();
			
			System.out.println("\nLa tabla del número " + numero + " es:");
			tabla(numero);
	
	teclado.close();
	}
	
	// Función que hace la tabla del número introducido por teclado
	public static void tabla(int numero) {
		int resultado;
			for (int multiplicador = 1; multiplicador < 11; multiplicador++) {
				resultado = numero * multiplicador;
				System.out.println(resultado);
			}
	}

}


