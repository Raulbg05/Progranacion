/*
 * Descripción: Pasar de euros a pesetas y de pesetas a euros
 * Autor: Raúl Beltrán
 * Fecha: 01/10/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca la cantidad de euros que quiera pasar a pesetas: ");
		double cantidadEuros = teclado.nextDouble();
		
		double cantidadPesetas = cantidadEuros * 166.386;
		System.out.println("El resultado son " + cantidadPesetas + " pesetas.");
		
		System.out.print("--------------" + "\nIntroduzca la cantidad de pesetas que quiera pasar a euros: ");
		double numeroPesetas = teclado.nextDouble();
		
		double numeroEuros = numeroPesetas / 166.386;
		System.out.println("El resultado son " + numeroEuros + " euros.");
		
	}

}
