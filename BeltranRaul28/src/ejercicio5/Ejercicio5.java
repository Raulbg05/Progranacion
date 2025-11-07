/*
 * Descripción: Pedir 10 números al usuario, hacerle la media de el valor de los números negativos y de los números positivos independientemente y decirle la cantidad de ceros introducidos (si esque los hay)
 * Autor: Raúl Beltrán
 * Fecha: 16/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		double numero = 0;
		double sumaPositiva = numero;
		double sumaNegativa = numero;	
		int contadorPositivo = 0;
		int contadorNegativo = 0;
		int contadorCeros = 0;
		double mediaPositiva = 0;
		double mediaNegativa = 0;
		
		
		do {
			System.out.print("Introduce un número (se pedirán 10 en total): ");
			numero = teclado.nextInt();
			
			if (numero > 0) {
			contadorPositivo = contadorPositivo + 1;																			// contador
			sumaPositiva = sumaPositiva + numero; 																				// acumulador
			mediaPositiva = sumaPositiva / contadorPositivo;
			}
			
			else if (numero < 0) {
				contadorNegativo = contadorNegativo + 1;																		// contador
				sumaNegativa = sumaNegativa + numero; 																			// acumulador
				mediaNegativa = sumaNegativa / contadorNegativo;
			}
			
			else {
				contadorCeros = contadorCeros + 1;																				// contador
			}
						
		}
			
			while (contadorPositivo + contadorNegativo + contadorCeros < 10); {												// Se hara el bucle mientras los números introducidos no sean mas que diez
				}
			
		System.out.println("La cantidad de números introducidos positivos es: " + contadorPositivo + ". Y el valor medio es: " + mediaPositiva 
				+ "\nLa cantidad de números negativos introducidos es: " + contadorNegativo + ". Y el valor medio es: " + mediaNegativa
				+ "\nEl número de ceros introducidos es: " + contadorCeros);
		
		teclado.close();;
	}
			
}
