/*
 * Descripción: Usar y explicar las funciones Math
 * Autor: Raúl Beltrán
 * Fecha: 01/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un valor: ");
		double val1 = teclado.nextDouble();
		
		double floor = Math.floor(val1);					// REDONDEA SIEMPRE PARA ABAJO (SI ES 3,9 LO REDONDEA A 3)
		double ceil = Math.ceil(val1);						// REDONDEA SIEMPRE PARA ARRIBA (SI ES 3,1 LO REDONDEA A 4)
		double round = Math.round(val1);					// REDONDEA COMÚNMENTE (AL NÚMERO ENTERO MÁS CERCANO. SI ES X,5 REDONDEA HACIA ARRIBA)
		
		System.out.println("El resultado usando la función 'Math.floor' (El mayor de los enteros que sigue siendo inferior o igual a numero) el resultado es: " + floor + 
				"\nEl resultado usando la función 'Math.ceil' (El menor de los enteros que sigue siendo mayor o igual a numero) el resultado es: " + ceil + 
				"\nEl resultado usando la función 'Math.round' (Redondeo al número entero más cercano.) el resultado es: " + round);

	}

}