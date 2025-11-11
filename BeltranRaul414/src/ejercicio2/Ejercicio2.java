/*
* Descripción: Programa pide al usuario una edad e identifica si es o no
* mayor de edad utilizando una función
* Autor: Raúl Beltrán
* Fecha: 11/11/2025
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
		short a;
		boolean mayorEdad;
		
		System.out.print("Introduce una edad: ");
		a = teclado.nextShort();
		
			while (a > 150 || a < 0) {
				System.out.print("La edad es errónea, introduzca una edad válida: ");
				a = teclado.nextShort();
			}
		
		mayorEdad = esMayorEdad(a);
		
		System.out.print("¿Es mayor de edad?"
				+ "\n" + mayorEdad);

	teclado.close();
	}
	
	// Devuelve verdadero si a >= 18, falso en caso contrario
	public static boolean esMayorEdad(short a) {
		boolean resultado;
			if (a >= 18) {
				resultado = true;
			}
			else {
				resultado = false;
			}
	return resultado;
	}

}
