/*
 * Descripción: Uso básico de while
 * Autor: Raúl Beltrán
 * Fecha: 09/10/2025
 */
package ejercicioBucles;

import java.util.Scanner;

public class Ejerciciobucles1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Introduzca el número de inicio: ");
		int numInicio = teclado.nextInt();
		System.out.print("Introduzca el numero de fin: ");
		int numFin = teclado.nextInt();
		
		int contador = numInicio;
		
		
		while (contador < numFin) {
			System.out.println(contador);
			contador = contador + 1;
		}
		
		while (contador >= numFin) {
				System.out.println(contador);
				contador = contador - 1;
		}
		teclado.close();
	}

}
