/*
 * Descripción: Programa que muestra los números entre el 1 y el número que introduzca el usuario
 * Autor: Raúl Beltrán
 * Fecha: 20/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		int numeroInicio, numeroFin;
		
		System.out.print("Introduce un número de fin: ");
		numeroFin = teclado.nextInt();

		for (numeroInicio = 1; numeroInicio <= numeroFin; numeroInicio++)		// Le damos valor al número de inicio que será siempre 1 y luego le damos la orden de que se ejecute el bucle hasta que el número de inicio sea del mismo valor que el número introducido por el usuario. Luego le decimos que le sume 1 al número de inicio hasta que llegue al número de fin
			System.out.println(numeroInicio);
		
		teclado.close();
	}

}
