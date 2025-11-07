/*
 * Descripción: Intercambio de valor de 2 valores
 * Autor: Raúl Beltrán
 * Fecha: 30/09/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame el valor 2 números:" + "\nPrimero: ");
		double num1 = teclado.nextDouble();
		
		System.out.print("Segundo: ");
		double num2 = teclado.nextDouble();
		
		double num3 = num1;
		num1 = num2;
		num2 = num3;
		
				
		System.out.println("El primer valor intercambiado es: " + num1 + "\nEl segundo valor intercambiado es: " + num2);

	}

}
