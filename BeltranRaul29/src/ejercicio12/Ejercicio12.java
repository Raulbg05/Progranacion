/*
 * Descripción: Calcular el valor elevado de los números que introduzca el usuario
 * Autor: Raúl Beltrán
 * Fecha: 24/10/2025
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
	double numero = 0;
	double a,b;
	
	System.out.print("Introduce el número que va a ser elevado: ");
	a = teclado.nextDouble();
	System.out.print("Introduce la potencia a la que se va a elevar: ");
	b = teclado.nextDouble();
	
	numero = a;
	
		if (b == 0) {
			System.out.print("El resultado es 1");
		}
		
		else {
			for (int contador = 1; contador < b; contador++) {
				a = numero * a;
			}
			System.out.print("El resultado es: " + a);
		}
	
	teclado.close();
	}

}
