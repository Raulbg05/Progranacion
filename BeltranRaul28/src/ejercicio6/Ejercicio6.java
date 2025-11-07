/*
 * Descripción: Pedir 10 números al usuario, hacerle la media de el valor de los números negativos y de los números positivos independientemente y decirle la cantidad de ceros introducidos (si esque los hay)
 * Autor: Raúl Beltrán
 * Fecha: 16/10/2025
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		double numero, resultado;
		

			
		do {
			System.out.print("Introduce un número (introducir negativo para parar): ");
			numero = teclado.nextDouble();
			
				if (numero >= 0) {
				resultado = numero * numero;
				System.out.println("El resultado de elevar " + numero + " al cuadrado es: " + resultado);
				}
		}
		
		while (numero >= 0); {
		}
		
		teclado.close();
	}

}
