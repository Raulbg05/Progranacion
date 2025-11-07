/*
 * Descripción: Pedir 100 números no nulos y luego 
 * mostrar mensaje de si ha leído algún número negativo o no 
 * Autor: Raúl Beltrán
 * Fecha: 20/10/2025
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
	final int TOTAL_NUM = 100;
	int posicion = -1;
	int contador = 0;
	int contadorNegativo = 0;
		
	int[] numeros;
	numeros = new int [TOTAL_NUM];
		
		do {
		posicion++;
		System.out.println("Inserte un número (distinto a 0): ");
		numeros[posicion] = teclado.nextInt();
		contador = contador + 1;

		
			while (numeros[posicion] == 0) {
			System.out.println("Inserte un número (distinto a 0): ");
			numeros[posicion] = teclado.nextInt();
			}
			
			if (numeros[posicion] < 0) {
			contadorNegativo++;
			}
		
		} 
		
		while (contador < TOTAL_NUM);
	
	
	if (contadorNegativo > 0) {
	System.out.print("Se han detectado números negativos");
	} 
	
	else {
		System.out.print("No se han detectado números negativos.");
	}
	
	teclado.close();
	}
}



