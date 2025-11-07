/*
* Descripción: Pedir 100 números no nulos y luego mostrar cuantos numeros positivos 
* y negativos se han detectado respectivamente 		   
*Autor: Raúl Beltrán
* Fecha: 20/10/2025
*/
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
			Scanner teclado= new Scanner(System.in);
				
			int posicion = -1;
			int contadorNegativo = 0;
			int contadorPositivo = 0;
				
			int[] numeros;
				
				do {
				posicion++;
				int contador = 1;
				numeros = new int [contador++];
				System.out.println("Inserte un número (distinto a 0): ");
				numeros[posicion] = teclado.nextInt();
					
					if (numeros[posicion] > 0) {
					contadorPositivo++;
					}
					
					else if (numeros[posicion] < 0) {
					contadorNegativo++;
					} 
				}
				
				while (numeros[posicion] != 0);
			
			System.out.println("Hay " + contadorPositivo + " números positivos y " 
			+ contadorNegativo + " números negativos.");
				
	teclado.close();
	}
}


