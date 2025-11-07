/*
*  Descripción: Programa le da valor aleatorio entre 0 y 99 a un array con 1000 de capacidad,
*  luego le pide número al usuario y le dice cuantas veces se repite entre los 1000 números generados
 * Autor: Raúl Beltrán
 * Fecha: 31/10/2025
 */
package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
	final int TOTAL_NUM = 1000;
	int[] array = new int [TOTAL_NUM];
	int numero;
	int contador = 0;
	
		for (int posicion = 0; posicion < array.length; posicion++) {
			array[posicion] = (int)(Math.random() * 100);
		}
	
		do {
	System.out.print("Introduce un número entre 0 y 99 (si no se te repetira la orden): ");
	numero = teclado.nextInt();
	}
		while (numero < 0 || numero > 99);
	
		
		for (int posicion = 0; posicion < array.length; posicion++) {
			if (array[posicion] == numero) {
				contador++;
			}
		}
		
	System.out.print("El número se repite " + contador + " vez(es).");
	teclado.close();
	}

}
