/*
* Descripción: Programa convierte un número de millas introducido por el usuario a Km
* utilizando una función
* Autor: Raúl Beltrán
* Fecha: 11/11/2025
*/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
		double millas, resultado;
		
		System.out.print("Introduce un número en millas: ");
		millas = teclado.nextDouble();
		
		resultado = millas_a_kilometros(millas);
		
		System.out.print(millas + " millas son " + resultado + " kilómetros");
	
	teclado.close();
	}
	
	// Devuelve la conversión de millas a kilómetros
	public static double millas_a_kilometros(double millas) {
		double kilometros;
			kilometros = millas * 1.60934;
	return kilometros;		
	}

}
