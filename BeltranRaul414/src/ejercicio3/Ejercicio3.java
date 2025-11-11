/*
* Descripción: Programa que calcula el minimo de 2 números pedidos al usuario
* utilizando una función
* Autor: Raúl Beltrán
* Fecha: 11/11/2025
*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);

		int a,b, resultado;
					
		System.out.print("Introduce un número entero: ");
		a = teclado.nextInt();
		System.out.print("Introduce otro número entero: ");
		b = teclado.nextInt();

		resultado = minimo(a,b);
		
		System.out.print("El numenor minimo es: " + resultado);
		
	teclado.close();
	}
	
	// Devuelve el menor entre a y b
	public static int minimo(int a, int b) {
		int minimo = 0;
			if (a > b) {
				minimo = b;
			}
			else if (b > a) {
				minimo = a;
			}
	return minimo;		
	}

}
