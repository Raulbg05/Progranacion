/*
 * Descripción: Contar todos los números que el usuario introduzca y dar el valor medio de todos los que haya introducido (0 para parar)
 * Autor: Raúl Beltrán
 * Fecha: 14/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Dame un número positivo: ");
		double numero = teclado.nextDouble();	
		
		double suma = numero;
		int contador = 1;
		double media = 0;
		
		while (numero != 0) {													// Mientras el número sea distinto a 0  se hará, cuando la condición no se cumpla la operación parará
			System.out.print("Dame otro número (introduce 0 para parar): ");
			numero = teclado.nextInt();
			contador = contador + 1;											// contador
			suma = suma + numero; 												// acumulador
	
		}
		
		media = suma / --contador;
		System.out.println("La cantidad de números introducidos es: " + contador + ". Y el valor medio es: " + media);
		teclado.close();
	}

}