/*
 * Descripción: Uso básico de for para calcular los números que sean múltiplo de 3
 * Autor: Raúl Beltrán
 * Fecha: 14/10/2025
 */

package ejercicioBucles;

import java.util.Scanner;

public class Ejerciciobucles5 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		int inicio, fin, contador;
		
		System.out.print("Dame un número de inicio: ");
		inicio = teclado.nextInt();
		System.out.print("Dame un número de fin: ");
		fin = teclado.nextInt();
		
		
		for (contador = inicio; contador <= fin; contador++) {
			System.out.println("Evaluando " + contador + "...");
			
			if (contador % 3 == 0)
			System.out.println(contador + " es múltiplo de 3" );
		}
		teclado.close();
	}
}
