/*
 * Descripción: Uso de condiciones básicas para comprobar si un número es mayor, menor o igual a otro
 * Autor: Raúl Beltrán
 * Fecha: 03/10/2025
 */
package ejeercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Introduzca el primer número: ");
		double num1 = teclado.nextDouble();
		System.out.print("Introduzca el segundo número: ");
		double num2 = teclado.nextDouble();
		
		if (num1 > num2) {
			System.out.println("El primer número es mayor que el segundo.");
		} else if (num1 == num2) {
			System.out.println("Los números son iguales.");
		} else {
			System.out.println("El primer número es menor que el segundo.");
		}

	}

}
